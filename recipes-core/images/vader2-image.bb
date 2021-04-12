SUMMARY = "Vader2"

LICENSE = "MIT"
inherit core-image

DISTRO = "vader2"
MACHINE = "u96v2-vader2"

PREFERRED_PROVIDER_virtual/boot-bin = "xilinx-bootbin"

PREFERRED_RPROVIDER_virtual/qemu-native = "qemu-xilinx-native"
PREFERRED_PROVIDER_virtual/qemu-native = "qemu-xilinx-native"

PREFERRED_RPROVIDER_virtual/nativesdk-qemu = "nativesdk-qemu-xilinx"
PREFERRED_PROVIDER_virtual/nativesdk-qemu = "nativesdk-qemu-xilinx"

CORE_IMAGE_EXTRA_INSTALL = "openssh openssh-scp openssh-sftp-server ca-certificates cmake curl dosfstools file git gzip ifupdown init-ifupdown iptables iputils mmc-utils ncurses net-tools perf syslog-ng tar time tree unzip update-rc.d wget which wilc wilc3000-fw zip xilinx-bootbin wpa-supplicant wifi-autostart sudo devmem2 sudo fpga-manager-script clang"

IMAGE_INSTALL_remove = "avahi"
PACKAGECONFIG_remove = "avahi"