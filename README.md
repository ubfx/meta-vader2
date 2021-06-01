### meta-vader2 Yocto-Layer
Dieser Layer beinhaltet die Vader2-spezifischen Komponenten für die Linux-Vader2-Distribution.

## Kernel-Konfiguration
Die Kernel-Konfiguration findet sich unter `recipes-kernel/linux/files/vader2.cfg`

## Device-Tree
Der Device-Tree findet sich unter `recipes-bsp/device-tree/files/u96v2-vader2/vader2.dtsi`

Zusätzliche Einstellungen, wie zum Beispiel reservierte Speicherbereiche können unter `recipes-bsp/device-tree/files/u96v2-vader2/system-conf.dtsi` vorgenommen werden.

## Vader2-Kernelmodul
Der Sourcecode für das Kernelmodul findet sich unter `recipes-kernel/vader2-mod/files`

Das Kernelmodul kann separat gebaut werden: `$ bitbake vader2-mod`

Zum Laden des Kernelmoduls: `insmod /lib/modules/$(uname -r)/extra/vader2.ko`

## Software hinzufügen/entfernen
Unter `conf/distro/vader2.conf` kann Software zur Distribution hinzugefügt oder entfernt werden.