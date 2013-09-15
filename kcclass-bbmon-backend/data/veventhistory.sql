--DROP TABLE `vEventsHistory`;
CREATE TABLE `vEventsHistory` (
   `id` INT(10) UNSIGNED NOT NULL DEFAULT '0',
   `timestamp` TIMESTAMP NOT NULL DEFAULT '0000-00-00 00:00:00',
   `year` INT(4) UNSIGNED NOT NULL,
   `month` INT(2) UNSIGNED NOT NULL,
   `day` INT(2) UNSIGNED NOT NULL,
   `hour` INT(4) UNSIGNED NOT NULL,
   `event_unixtime` BIGINT(20) UNSIGNED NOT NULL,
   `customer_id` INT(11) NOT NULL DEFAULT '0',
   `monitoring_system_id` INT(11) NOT NULL,
   `device_id` INT(11) NOT NULL,
   `metric_id` INT(11) NOT NULL,
   `status` INT(1) NOT NULL,
   `acknowledge_id` INT(10) UNSIGNED NULL DEFAULT NULL,
   `message_sent` TINYINT(1) NOT NULL DEFAULT '0',
   `user_deleted` TINYINT(1) NOT NULL DEFAULT '0',
   `client_id` INT(11) NOT NULL,
   `duration` INT(10) UNSIGNED NULL DEFAULT '0',
   `prev_status` INT(1) UNSIGNED NULL DEFAULT NULL,
   `prev_event_unixtime` BIGINT(20) UNSIGNED NULL DEFAULT NULL,
   `sender` VARCHAR(256) NULL DEFAULT NULL,
   `origin` VARCHAR(256) NULL DEFAULT NULL,
   `expiretime` BIGINT(20) NULL DEFAULT NULL,
   `color` VARCHAR(20) NULL DEFAULT NULL,
   `prevcolor` VARCHAR(20) NULL DEFAULT NULL,
   `changetime` BIGINT(20) NULL DEFAULT NULL,
   `disabletime` BIGINT(20) NULL DEFAULT NULL,
   `disablemsg` VARCHAR(1000) NULL DEFAULT NULL,
   `downtimeactive` BIGINT(20) NULL DEFAULT NULL,
   `clienttstamp` BIGINT(20) NULL DEFAULT NULL
);
INSERT INTO `vEventsHistory` (`id`, `timestamp`, `year`, `month`, `day`, `hour`, `event_unixtime`, `customer_id`, `monitoring_system_id`, `device_id`, `metric_id`, `status`, `acknowledge_id`, `message_sent`, `user_deleted`, `client_id`, `duration`, `prev_status`, `prev_event_unixtime`, `sender`, `origin`, `expiretime`, `color`, `prevcolor`, `changetime`, `disabletime`, `disablemsg`, `downtimeactive`, `clienttstamp`)
VALUES
	(180915, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14139, 2971, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1341569322, 0, '', 0, 1340401370),
	(180916, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14140, 2972, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1343202139, 0, '', 0, 1340401370),
	(180917, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14141, 2972, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1343201223, 0, '', 0, 1340401370),
	(180918, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14142, 2972, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1343170940, 0, '', 0, 1340401370),
	(180919, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14143, 2972, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1343199216, 0, '', 0, 1340401370),
	(180920, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14144, 2972, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1343072546, 0, '', 0, 1340401370),
	(180921, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14145, 2972, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1343197260, 0, '', 0, 1340401370),
	(180922, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14146, 2972, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1343202814, 0, '', 0, 1340401370),
	(180923, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14147, 2972, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1343203670, 0, '', 0, 1340401370),
	(180924, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14139, 2972, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1339407752, 0, '', 0, 1340401370),
	(180925, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14139, 2973, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1326646339, 0, '', 0, 1340401370),
	(180926, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14147, 2974, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1343203670, 0, '', 0, 1340401370),
	(180927, '2012-08-02 15:00:15', 2012, 8, 2, 15, 1343912415, 13, 14, 14146, 2975, 1, NULL, 0, 0, 10, 0, NULL, NULL, '127.0.0.1', '', 1343914215, 'green', 'green', 1343202814, 0, '', 0, 1340401370)
