/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 5.7.29-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;
-- enable 字段是软删除标志位
create table `book` (
	`id` int (10),
	`name` varchar (60),
	`author` varchar (60),
	`publish` varchar (60),
	`pages` int (10),
	`price` float ,
	`bookcaseid` int (10),
	`abled` int (10),
	`enable` int (1)
); 
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('1','解忧杂货店','东野圭吾','电子工业出版社','102','27.30','9','1','1');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('2','追风筝的人','卡勒德·胡赛尼','中信出版社','330','26.00','1','1','1');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('3','人间失格','太宰治','作家出版社','150','17.30','1','1','0');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('4','这就是二十四节气','高春香','电子工业出版社','220','59.00','3','1','0');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('5','白夜行','东野圭吾','南海出版公司','300','27.30','4','1','0');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('6','摆渡人','克莱儿·麦克福尔','百花洲文艺出版社','225','22.80','1','1','0');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('7','暖暖心绘本','米拦弗特毕','湖南少儿出版社','168','131.60','5','1','0');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('8','天才在左疯子在右','高铭','北京联合出版公司','330','27.50','6','1','0');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('9','我们仨','杨绛','生活.读书.新知三联书店','89','17.20','7','1','0');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('10','活着','余华','作家出版社','100','100.00','6','1','0');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('11','水浒传','施耐庵','三联出版社','300','50.00','1','1','0');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('12','三国演义','罗贯中','三联出版社','300','50.00','2','1','0');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('13','红楼梦','曹雪芹','三联出版社','300','50.00','5','1','0');
insert into `book` (`id`, `name`, `author`, `publish`, `pages`, `price`, `bookcaseid`, `abled`, `enable`) values('14','西游记','吴承恩','三联出版社','300','60.00','3','1','0');
