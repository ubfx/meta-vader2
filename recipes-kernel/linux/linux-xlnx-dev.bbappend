#AVNET_FILES = "${THISDIR}/../../../meta-avnet/recipes-kernel/linux/files"
#FILESEXTRAPATHS_prepend := "${THISDIR}/files:/u96v2-sbc:${AVNET_FILES}:${AVNET_FILES}/u96v2-sbc:"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://vader2.cfg \
    file://fix_u96v2_pwrseq_simple.patch \
"

KBUILD_DEFCONFIG = "file://vader2.cfg"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"