#include <linux/fs.h>
#include <linux/init.h>
#include <linux/kernel.h>
#include <linux/module.h>
#include <linux/proc_fs.h>
#include <linux/sched.h>
#include <linux/of.h>
#include <linux/of_reserved_mem.h>
#include <linux/mm.h>

static int mmap(struct file *filp, struct vm_area_struct *vma)
{
    struct device_node *nodeptr = of_find_node_by_path("/reserved-memory/imgbuf0");
    struct reserved_mem *rm;

    rm = of_reserved_mem_lookup(nodeptr);

    unsigned long long vmsize = vma->vm_end - vma->vm_start;

    if (vmsize != rm->size)
    {
        printk("vmsize (%llx) != reserved memory size (%llx)\n", vmsize, rm->size);
        return -1;
    }

    printk("mapping %llx (size %llx, %llx) to %lx\n", rm->base, rm->size, vmsize, vma->vm_start);
    int ret = remap_pfn_range(vma, vma->vm_start, rm->base >> PAGE_SHIFT, rm->size, vma->vm_page_prot);
    printk("mapped %llx to %lx, retval remap_pfn_range = %d\n", rm->base, vma->vm_start, ret);

    return 0;
}

static int open(struct inode *inode, struct file *filp)
{
    printk("open\n");

    return 0;
}

static const struct file_operations fops = {
    .mmap = mmap,
    .open = open
};

struct proc_dir_entry *p;

int init_vader2(void)
{
    p = proc_create("vader2", 0, NULL, &fops);

    return 0;
}

void cleanup_vader2(void)
{
    proc_remove(p);
}

MODULE_LICENSE("GPL");
MODULE_AUTHOR("Felix Schneider");
MODULE_DESCRIPTION("");
module_init(init_vader2);
module_exit(cleanup_vader2);