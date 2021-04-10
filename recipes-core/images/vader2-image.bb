SUMMARY = "Vader2"

IMAGE_FEATURES += "splash"
#IMAGE_INSTALL += "binutils binutils-cross-aarch64 busybox busybox-inittab buildtools-extended-tarball "
LICENSE = "MIT"


CORE_IMAGE_EXTRA_INSTALL = "packagegroup-core-buildessential packagegroup-core-ssh-dropbear ca-certificates cmake curl dhcpcd dnf dosfstools file git gzip ifupdown init-ifupdown iptables iputils mmc-utils ncurses net-tools perf syslog-ng tar time tree unzip update-rc.d wget which wilc wilc3000-fw wpa-supplicant zip"

inherit core-image