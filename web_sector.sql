-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2018 at 04:18 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `web_sector`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `id` int(6) NOT NULL,
  `first_name` varchar(300) NOT NULL,
  `last_name` varchar(300) NOT NULL,
  `email` varchar(300) NOT NULL,
  `password` varchar(300) NOT NULL,
  `description` varchar(1200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`id`, `first_name`, `last_name`, `email`, `password`, `description`) VALUES
(1, 'juxhin', 'bleta', 'jbadmin@gmail.com', '123456', '');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(5) NOT NULL,
  `tittle` varchar(100) NOT NULL,
  `description` varchar(1500) DEFAULT NULL,
  `cover_photo` varchar(500) NOT NULL,
  `image_1` varchar(300) DEFAULT NULL,
  `image_2` varchar(300) DEFAULT NULL,
  `image_3` varchar(300) DEFAULT NULL,
  `date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `price` int(4) NOT NULL,
  `category` varchar(50) NOT NULL,
  `sales` int(6) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `tittle`, `description`, `cover_photo`, `image_1`, `image_2`, `image_3`, `date_created`, `price`, `category`, `sales`) VALUES
(1, 'Auto Market Bootstrap Website Template', 'Auto Market, Car Dealer Bootstrap Template\r\n\r\n\r\nWe are representing brand new template which not only corresponds to the marketplace which produces cars but also auto dealer companies. Bootstrap templates are created by CSS and JS frameworks which makes its design in high quality and efficiently.\r\n\r\n\r\nHere is given simple HTML template but if it has a high demand from costumers, supply is not a pr', 'db_files/AutoMarketBootstrapWebsiteTemplate/car-chat-dribbble.jpg', 'db_files/AutoMarketBootstrapWebsiteTemplate/800.jpg', NULL, NULL, '2018-02-19 12:22:48', 35, 'template', 0),
(2, 'Creator Civil Engineering Multipage Website Template', 'Want a professional-looking theme to start generating quality leads from online? Have a close look at Civil Engineering Website Template. Designed by top industry leaders, it has all necessary tools for an efficient promotion of your services. Its sleek and absolutely stunning design will immerse visitors straight away and make them take an action. Responsive website slider is a way to present your services in the best light and emphasize users\' attention on the benefits of your company. Feel free to take advantage of multiple header and footer options, theme color scheme and Google fonts. In addition, you will be able to enrich the functionality of your future website with static and dynamic elements, widgets, plugins, modules and other UI elements. Also, while customizing the theme you will be able to make use of template documentation, that is included in the pack or get additional help by addressing your questions to 24/7 dedicated and friendly support. Grab Bootstrap Civil Engineering Website Template to power your industrial website.', 'db_files/CreatorCivilEngineeringMultipageWebsiteTemplate/creator-logo.jpg', 'db_files/CreatorCivilEngineeringMultipageWebsiteTemplate/creator-civil-engineering-multipage-website-template_64346-original.jpg', NULL, NULL, '2018-02-19 12:21:10', 45, 'template', 0),
(3, 'Famous Electronic Store HTML5 Web Template', 'Famous is a modern, clean and professional HTML Template, It is fully responsive, it looks stunning on all types of screens and devices.\r\n\r\n\r\nIt is super for digital shop, fashion shop, games shop, food shop, devices shop, household appliances shop or any other categories.\r\n\r\n\r\nThe HTML template has 100+ Pages and 3 Variations. The template is full and easily customizable. It is well organized, commented and documented.', 'db_files/FamousElectronicStoreHTML5WebTemplate/logo_2016_0282_electronic_1x.jpg', 'db_files/FamousElectronicStoreHTML5WebTemplate/screenshot.jpg', NULL, NULL, '2018-02-19 12:20:37', 54, 'template', 0),
(4, 'Food & Drink Responsive Web Template', 'This organic farm web template comes with over 40 pre-designed pages for multiple purposes. Be it a layout for a blog, shop or any essential website page, any of them is ready to use out of the box. Simply replace the default content with your own. To showcase projects, feel free to choose from grid, masonry, cobbles, and full-width styles of gallery. Thanks to a sticky header and mega footer, you can make the most of the key website areas. Besides menu items, the header features a live search option and shopping cart. In the mega footer, there are links to the latest blog posts, Flickr and Twitter widgets, contact details and follow icons. In its core, this multipurpose template is based on a SEO-friendly code that is easy to understand thanks to comments.', 'db_files/Food&DrinkResponsiveWebTemplate/Healthy-eating-logo-design-vector-set-02.jpg', 'db_files/Food&DrinkResponsiveWebTemplate/food--drink-responsive-website-template_58975-original.jpg', NULL, NULL, '2018-02-19 12:20:37', 60, 'template', 0),
(5, 'Interior Furniture Theme Wordpress Template', 'Lifetime support for the theme.Theme suitable for modern businesses. It is 100% responsive and looks stunning on all types of screens and devices. Well organized and very easy to customize, Orange is better way to present your modern business.Theme suitable for modern businesses. It is 100% responsive and looks stunning on all types of screens and devices. Well organized and very easy to customize, Orange is better way to present your modern business.', 'db_files/InteriorFurnitureThemeWordpress/1-.jpg', 'db_files/InteriorFurnitureThemeWordpress/interior-furniture-wordpress-theme_53145-original.jpg', NULL, NULL, '2018-06-09 22:10:37', 65, 'template', 1),
(6, 'Modicate Multipurpose Website Template', 'Modicate is a modern, multipurpose HTML theme built with Twitter Bootstrap 3.x framework. The template comes with 58 ready made unique pages, various headers, footers and content block allowing to create eye catching and truly flexible websites for any purpose and project. Clean and valid HTML5 code makes it easy to promote your website. Thought through layout is optimized for further theme conversion to popular CMS engines. Use Modicate to build professional websites that look and perform same great at desktop, mobile and tablet.', 'db_files/ModicateMultipurposeWebsiteTemplate/LANDSCAPINGLogo996.jpg', 'db_files/ModicateMultipurposeWebsiteTemplate/modicate-multipurpose-website-template_58434-original.jpg', NULL, NULL, '2018-02-19 12:20:37', 55, 'template', 0),
(7, 'Orange One Page Bootstrap Website Template', '\r\n\r\nOrange - One Page Bootstrap Theme suitable for modern businesses. It is 100% responsive and looks stunning on all types of screens and devices. Well organized and very easy to customize, Orange is better way to present your modern business.\r\n\r\n\r\n\r\nFeatures\r\n\r\n\r\n- Bootstrap 3.3.7\r\n\r\n- Agency Page\r\n\r\n- Creatives Page\r\n\r\n- Culinary Page\r\n\r\n- Fashion Page\r\n\r\n- Legal Page\r\n\r\n- Example Video Page\r\n\r\n- Clean and Professional Design\r\n\r\n- Cross Browser Compatible\r\n\r\n- Fully Responsive\r\n\r\n- Clean Code\r\n\r\n- Valid HTML5 & CSS3\r\n\r\n- Working Contact Form\r\n\r\n- Well Documented\r\n\r\n- 24/7 Support', 'db_files/OrangeOnePageBootstrapWebsiteTemplate/orange.png', 'db_files/OrangeOnePageBootstrapWebsiteTemplate/preview-1.jpg', NULL, NULL, '2018-03-05 17:06:10', 80, 'template', 1),
(8, 'Organic Agriculture Farm Website Template', 'Organic Agricultural Farm is a fully responsive multipurpose website template that can be used for farming, industrial, business or any other web project. Designed as per the latest web trends, the template features a full-width header video, which captivates the users\' attention once they land on your site. The main page was made informative yet easy to scan. Here you can find a quick review of the company\'s services, a list of the latest blog updates, a progress bar, a user-friendly contact form, integrated Google map, and a set of social sharing options. Coming with multiple header and footer variations, over 50 ready-made HTML5 pages, a huge set of UI elements and blocks, the theme is rich in customization options, which are ready to go out of the box. Cool CSS3 animation effects and transition will only enhance the visual appeal of your site.', 'db_files/OrganicAgricultureFarmWebsiteTemplate/logo.png', 'db_files/OrganicAgricultureFarmWebsiteTemplate/organic-agriculture-farm-multipurpose-website-template_58580-original.jpg', NULL, NULL, '2018-05-20 18:49:01', 60, 'template', 1),
(9, 'Photography Responsive Web Template', 'This template is made for people who are in the field of photography. It is stunning for freelance photographers or anyone who wants to show their gallery to the world!\r\n\r\n\r\nTo create it our developers used HTML, CSS3 and Bootstrap and JS frameworks. The template is responsive, which means that it has flexible design. It can change according to the screen size of the device, therefore looks perfect as on PCs and laptops, as well on smartphones or tablets.\r\n\r\n\r\nOur designers considered every single detail to make the first impression of this website simply amazing!\r\n\r\nAs you can probably already see, the main menu is placed on the left side column of our Home page. It is closed on default, but you can view it by clicking on the button on the top.', 'db_files/PhotographyWebTemplate/p-logo.png', 'db_files/PhotographyWebTemplate/picture-1.jpg', NULL, NULL, '2018-02-19 23:06:30', 45, 'template', 1),
(10, 'Plastic Goods Business Multipage Website Template', 'If you’re an industrial company owner and you want your company to have an attractive and detectable website, use our fully responsive Industrial Company HTML Template and you’ll never have to worry about drawing your clients to your website ever again. Developed by a team of professional web developers after the thorough analysis of many industrial company websites, this template offers everything you need. Fast response rate, intuitive interface, stunning artwork and fully adjustable looks with blogging and social network support. Download and install our Industrial Company HTML Template right now and you’ll get a 24/7 lifetime support, free of charge.', 'db_files/PlasticGoodsBusinessMultipageWebsiteTemplate/p-logo.jpg', 'db_files/PlasticGoodsBusinessMultipageWebsiteTemplate/plastic-goods-business-multipage-website-template_62319-original.jpg', NULL, NULL, '2018-02-19 12:20:37', 75, 'template', 0),
(11, 'Teeth Whitening Website Template', 'Use this stylish lightweight design for setting any type of medical-related websites. Its contemporary well-organized layout will wisely present all information about the company and make people interested in it. Being user-oriented, this theme offers easy on the eyes, intuitive design that is pleasant to work with. You can easily alter any settings within this dentist website template in order to personalize its design. And you do not have to be an expert web developer in order to perform it. ', 'db_files/TeethWhiteningWebsiteTemplate/201606041941210.png', 'db_files/TeethWhiteningWebsiteTemplate/teeth-whitening-website-template_58563-original.jpg', NULL, NULL, '2018-06-09 22:02:34', 55, 'template', 2),
(12, 'Wedding Invitation Couple Event & Celebratio Template', 'Wedding Invitation – Couple Event and Celebration HTML Template\r\n\r\n\r\nWedding Invitation Multipurpose and clean HTML template with 6 Index + header style + Dark Variation. Great Design for wedding invitation or engagement. Coming with wedding features such as Countdown, Couple Timeline, Location Map, RSVP, Grooms Family, Brides Family, Friends, Gift Registry and others. HTML is designed to give all the information for the wedding guests. It is a modern and clean HTML template.\r\n\r\nIf you are looking for Wedding Invitation, Couple Event and Celebration website, then EVENT will be the best choice for you.', 'db_files/WeddingInvitationCoupleEvent&CelebrationWebsiteTemplate/w-logo.jpg', 'db_files/WeddingInvitationCoupleEvent&CelebrationWebsiteTemplate/main_image.jpg', NULL, NULL, '2018-06-08 09:32:32', 30, 'template', 1);

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `id` int(6) NOT NULL,
  `user_id` int(6) NOT NULL,
  `product_id` int(6) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`id`, `user_id`, `product_id`, `date`) VALUES
(1, 5, 9, '2018-02-19 23:06:30'),
(2, 5, 12, '2018-02-21 11:43:28'),
(3, 5, 11, '2018-02-21 13:00:32'),
(4, 5, 7, '2018-03-05 17:06:10'),
(5, 5, 8, '2018-05-21 18:49:00'),
(6, 5, 11, '2018-06-09 22:02:34'),
(7, 5, 5, '2018-06-09 22:10:37');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(6) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(16) NOT NULL,
  `description` varchar(500) DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `first_name`, `last_name`, `email`, `password`, `description`) VALUES
(5, 'juxhin', 'bleta', 'juxhinb@gmail.com', '123456', ''),
(6, 'jordi', 'sefaj', 'jsefaj@gmail.com', '12345', ''),
(8, 'geri', 'ylli', 'gylli@gmail.com', 'iamgeri', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admins`
--
ALTER TABLE `admins`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
