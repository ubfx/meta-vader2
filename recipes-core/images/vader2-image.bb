SUMMARY = "Vader2"

LICENSE = "MIT"
inherit core-image

DISTRO = "vader2"
MACHINE = "u96v2-vader2"

IMAGE_INSTALL_remove = "avahi"
PACKAGECONFIG_remove = "avahi"