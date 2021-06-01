### meta-vader2 Yocto-Layer
Dieser Layer beinhaltet die Vader2-spezifischen Komponenten für die Linux-Vader2-Distribution.

## Kernel-Konfiguration
Die Kernel-Konfiguration findet sich unter `meta-vader2/recipes-kernel/linux/files/vader2.cfg`

## Device-Tree
Der Device-Tree findet sich unter `meta-vader2/recipes-bsp/device-tree/files/u96v2-vader2/vader2.dtsi`
Zusätzliche Einstellungen, wie zum Beispiel reservierte Speicherbereiche können unter `meta-vader2/recipes-bsp/device-tree/files/u96v2-vader2/system-conf.dtsi` vorgenommen werden.

## Software hinzufügen/entfernen
Unter `meta-vader2/conf/distro/vader2.conf` kann Software zur Distribution hinzugefügt oder entfernt werden.