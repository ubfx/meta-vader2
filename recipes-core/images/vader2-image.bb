SUMMARY = "Vader2"

LICENSE = "MIT"
inherit core-image

DISTRO = "vader2"
MACHINE = "u96v2-vader2"

RDEPENDS_vader2-image += "xilinx-bootbin"

IMAGE_INSTALL_remove = "avahi"
PACKAGECONFIG_remove = "avahi"