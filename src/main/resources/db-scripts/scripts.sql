CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` int NOT NULL,
  `name` varchar(200) NOT NULL,
  `description` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
CREATE TABLE `category` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
)
CREATE TABLE `book-collections` (
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  CONSTRAINT `book_id` FOREIGN KEY (`id`) REFERENCES `book` (`id`),
  CONSTRAINT `collection_id` FOREIGN KEY (`id`) REFERENCES `category` (`id`)
)
