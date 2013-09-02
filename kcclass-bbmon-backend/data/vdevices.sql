DROP TABLE `vDevices`;
CREATE TABLE `vDevices` (
   `mon_sys_id` INT(11) NOT NULL DEFAULT '0',
   `mon_sys_name` VARCHAR(100) NOT NULL,
   `mon_sys_desc` VARCHAR(1024) NULL DEFAULT NULL,
   `mon_sys_ip` VARCHAR(50) NOT NULL,
   `mon_sys_dns` VARCHAR(100) NOT NULL,
   `mon_sys_url` VARCHAR(100) NOT NULL,
   `mon_sys_customer` INT(11) NOT NULL,
   `dev_id` INT(11) NOT NULL DEFAULT '0',
   `dev_name` VARCHAR(100) NOT NULL,
   `dev_desc` VARCHAR(1024) NULL DEFAULT NULL,
   `dev_ip` VARCHAR(50) NULL DEFAULT NULL,
   `met_id` INT(11) NOT NULL DEFAULT '0',
   `met_name` VARCHAR(100) NOT NULL,
   `met_desc` VARCHAR(1024) NULL DEFAULT NULL
);
INSERT INTO `vDevices` (`mon_sys_id`, `mon_sys_name`, `mon_sys_desc`, `mon_sys_ip`, `mon_sys_dns`, `mon_sys_url`, `mon_sys_customer`, `dev_id`, `dev_name`, `dev_desc`, `dev_ip`, `met_id`, `met_name`, `met_desc`)
VALUES
	(14, 'monitoring_system', NULL, '', '', '', 13, 14138, 'localhost', '', '127.0.0.1', 2970, 'xymongen', ''),
	(14, 'monitoring_system', NULL, '', '', '', 13, 14139, 'localhost', '', '127.0.0.1', 2971, 'xymongen', ''),
	(14, 'monitoring_system', NULL, '', '', '', 13, 14139, 'localhost', '', '127.0.0.1', 2972, 'conn', ''),
	(14, 'monitoring_system', NULL, '', '', '', 13, 14139, 'localhost', '', '127.0.0.1', 2973, 'bbd', '');