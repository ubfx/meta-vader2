SUMMARY = "Vader2"
LICENSE = "MIT"
DISTRO = "vader2"
MACHINE = "u96v2-vader2"

inherit image

RDEPENDS_vader2-image += "xilinx-bootbin"

RRECOMMENDS_vader2-image = "kernel-module-msdos \
    kernel-module-vfat \
    kernel-module-nls-iso8859-1 \
    kernel-module-nls-cp437 \
    dosfstools \
"

IMAGE_INSTALL += "packagegroup-distro-base \
    usbutils \
    busybox-hwclock \
    busybox \
    udev \
    sysvinit \
    base-files \
    base-passwd \
    netbase \
    bash \
"

PACKAGE_EXCLUDE += "avahi gtk+3 iw kernel-module-mali libmali-xlnx libx11 libxrandr mobile-broadband-provider-info pango xorgproto"