AVNET_FILES = "${THISDIR}/../../../meta-avnet/recipes-kernel/linux/files"
FILESEXTRAPATHS_prepend := "${THISDIR}/files:/u96v2-sbc:${AVNET_FILES}:${AVNET_FILES}/u96v2-sbc:"

SRC_URI += "file://vader2.cfg"

KBUILD_DEFCONFIG = "file://vader2.cfg"

SRC_URI += "file://fix_u96v2_pwrseq_simple.patch"