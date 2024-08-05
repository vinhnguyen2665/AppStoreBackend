ALTER TABLE `app_info`
    ADD COLUMN `certificate_expiration_date` DATETIME NULL DEFAULT NULL AFTER `update_content`;
