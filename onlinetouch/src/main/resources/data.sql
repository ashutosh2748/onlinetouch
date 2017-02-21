INSERT INTO `cs544`.`web_user` (`id`, `email`, `enabled`, `first_name`, `last_name`, `middle_name`, `password`, `user_name`) VALUES ('1', 'sdf', '1', 'sdf', 'sdf', 'sdf', '$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm', 'abc125');
INSERT INTO `cs544`.`user_roles` (`user_role_id`, `role`) VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `cs544`.`web_user_roles` (`user_id`, `role_id`) VALUES ('1', '1');
