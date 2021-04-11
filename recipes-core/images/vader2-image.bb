SUMMARY = "Vader2"

LICENSE = "MIT"

PREFERRED_PROVIDER_virtual/boot-bin = "xilinx-bootbin"

PREFERRED_RPROVIDER_virtual/qemu-native = "qemu-xilinx-native"
PREFERRED_PROVIDER_virtual/qemu-native = "qemu-xilinx-native"

PREFERRED_RPROVIDER_virtual/nativesdk-qemu = "nativesdk-qemu-xilinx"
PREFERRED_PROVIDER_virtual/nativesdk-qemu = "nativesdk-qemu-xilinx"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL = "packagegroup-core-buildessential openssh openssh-scp openssh-sftp-server ca-certificates cmake curl dosfstools file git gzip ifupdown init-ifupdown iptables iputils mmc-utils ncurses net-tools perf syslog-ng tar time tree unzip update-rc.d wget which wilc wilc3000-fw zip xilinx-bootbin wpa-supplicant wifi-autostart clang sudo"

IMAGE_INSTALL_remove = "avahi"
PACKAGECONFIG_remove = "avahi"

HDF_BASE = "file://"
HDF_PATH = "${TOPDIR}/system.xsa"
HDF_EXT = "xsa"
