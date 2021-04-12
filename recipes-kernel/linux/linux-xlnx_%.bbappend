FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://vader2.cfg"

KBUILD_DEFCONFIG = "file://vader2.cfg"

SRC_URI += "file://vader2.cfg \
            file://user.cfg \
            file://vitis_kconfig.cfg \
            file://0001-hwmon-pmbus-Add-Infineon-IR38060-62-63-driver.patch \
            file://fix_u96v2_pwrseq_simple.patch \
"

#SRC_URI += "file://bsp.cfg"