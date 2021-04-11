FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
DT_INCLUDE += "${THISDIR}/files"

#python() {
#    bb.debug(1, "DTI >" + d.getVar("DT_INCLUDE") + "<\n\nTD: " + d.getVar("THISDIR") + "<\n DT_FILES_PATH: >" + d.getVar("DT_FILES_PATH") + "<");
#}