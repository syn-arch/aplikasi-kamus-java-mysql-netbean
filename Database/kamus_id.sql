-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 21, 2019 at 04:51 AM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kamus_id`
--

-- --------------------------------------------------------

--
-- Table structure for table `kamus`
--

CREATE TABLE `kamus` (
  `id` int(11) NOT NULL,
  `indonesia` varchar(30) NOT NULL,
  `japan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kamus`
--

INSERT INTO `kamus` (`id`, `indonesia`, `japan`) VALUES
(1, 'aku', 'watashi'),
(2, 'kamu', 'kimiwa'),
(3, 'hati', 'kokoro'),
(4, 'ayo', 'ikeh'),
(5, 'semuanya', 'minna'),
(6, 'hancur', 'barbarani'),
(7, 'menyiram', 'abiru'),
(8, 'berbahaya', 'abunai'),
(9, 'memberi', 'agenai'),
(10, 'anak kesayangan', 'aiko'),
(11, 'perasaan cinta', 'aijo'),
(12, 'salam', 'aisatsu'),
(13, 'merasa', 'ajiwau'),
(14, 'merah', 'akai'),
(15, 'bayi', 'akachan'),
(16, 'terang', 'akarui'),
(17, 'membuka', 'akeru'),
(18, 'musim gugur', 'aki'),
(19, 'setan', 'akuma'),
(20, 'manis', 'amai'),
(21, 'hujan', 'ame'),
(22, 'kalian', 'anatatachi'),
(23, 'kakak laki laki', 'ani'),
(24, 'itu', 'ano'),
(25, 'biu', 'aoi'),
(26, 'kasar', 'arai'),
(27, 'berterngkar mulut', 'arasou'),
(28, 'mencuci', 'arau'),
(29, 'muncul', 'arawareru'),
(30, 'itu', 'are'),
(31, 'semut', 'ari'),
(32, 'terimas kasih', 'arigato'),
(33, 'mempunyai', 'aru'),
(34, 'berjalan', 'aruku'),
(35, 'sarapan', 'asagohan'),
(36, 'dangkal', 'asai'),
(37, 'lusa', 'asatte'),
(38, 'keringat', 'ase'),
(39, 'kaki', 'ashi'),
(40, 'besok', 'ashita'),
(41, 'bermamin', 'asobu'),
(42, 'malam', 'ban'),
(43, 'pisang', 'banana'),
(44, 'makan malam', 'bangohan'),
(45, 'program', 'banguni'),
(46, 'tempat', 'basgo'),
(47, 'bis', 'basu'),
(48, 'belajar', 'benkyo'),
(49, 'praktis', 'benri n'),
(50, 'kaget', 'bikkuri suru'),
(51, 'gedung', 'biru'),
(52, 'botol', 'bin'),
(53, 'tombol', 'botan'),
(54, 'kalimat', 'bun'),
(55, 'membongkar', 'bunkaisuru'),
(56, 'perpecahan', 'bunretsu'),
(57, 'babi', 'buta'),
(58, 'daging babi', 'butaniku'),
(59, 'rumah sakit', 'byoin'),
(60, 'sakit', 'byoki'),
(61, 'warna cokelat', 'chairo no'),
(62, 'ayah', 'chichi'),
(63, 'kecil', 'chiisai'),
(64, 'berbeda', 'chigau'),
(65, 'wilayah', 'chiho'),
(66, 'dekat', 'chikai'),
(67, 'tenaga', 'chikara'),
(68, 'bumi', 'chikyo'),
(69, 'geografi', 'chiri'),
(70, 'pengetahuan', 'chisiki'),
(71, 'peta', 'chizu'),
(72, 'tepat', 'chodo'),
(73, 'langsung', 'chokusetsu'),
(74, 'maaf sebentar', 'chotto sumimasen'),
(75, 'bab', 'daiben suru'),
(76, 'dapur', 'daidokoro'),
(77, 'perguruan tinggi', 'daigaku'),
(78, 'tidak apa apa ', 'daijobu desu'),
(79, 'sebagian besar', 'daitai'),
(80, 'hanya', 'dake'),
(81, 'diam', 'damaru'),
(82, 'menipu', 'damasu'),
(83, 'tidak boleh', 'dame'),
(84, 'pelajar pria', 'dansei'),
(85, 'dansa', 'dansu'),
(86, 'siapa', 'dare'),
(87, 'mengeluarkan', 'dasu'),
(88, 'pergi ke luar', 'dekiru'),
(89, 'tapi', 'demo'),
(90, 'menjemput', 'demukae suru'),
(91, 'listrik', 'denki'),
(92, 'menghidupkan listrik', 'denki tsukeru'),
(93, 'naik kereta api', 'densha ni noru'),
(94, 'penyakit menular', 'densenbyo'),
(95, 'nomor telepon', 'denwa bango'),
(96, 'menelepon', 'denwa o kakeru'),
(97, 'keluar', 'deru'),
(98, 'bagaimana', 'do'),
(99, 'pintu', 'doa'),
(100, 'yang mana', 'dochira'),
(101, 'mana', 'doko'),
(102, 'email', 'eameeru'),
(103, 'film', 'eiga'),
(104, 'bioskop', 'eigakan'),
(105, 'bahasa inggris', 'eigo'),
(106, 'statsiun', 'eki'),
(107, 'pensil', 'enpitsu'),
(108, 'menggambar', 'e o kaku'),
(109, 'memilih', 'erabu'),
(110, 'elevator', 'erebeta'),
(111, 'tidak peraktris', 'fuben na'),
(112, 'bertambah', 'fueru'),
(113, 'lama', 'furui'),
(114, 'gemetar ', 'furueru'),
(115, 'kampung halaman', 'furusato'),
(116, 'unik', 'fushigi na'),
(117, 'gemuk', 'futoi'),
(118, 'berkelakar', 'fuzakeru'),
(119, 'luar negeri', 'gaikoku'),
(120, 'orang asing', 'gaikokujin'),
(121, 'kecewa', 'gakkari suru'),
(122, 'sekolah', 'gako'),
(123, 'murid', 'gakusei'),
(124, 'kesenian', 'geijutsu'),
(125, 'sehat', 'genki na'),
(126, 'senin', 'getsuyobi'),
(127, 'bank', 'ginko'),
(128, 'lima', 'go'),
(129, 'siang;sore;malam', 'gogo'),
(130, 'delapan', 'hachi'),
(131, 'kartu pos', 'hagaki'),
(132, 'masuk', 'hairu'),
(133, 'asbak', 'haizara'),
(134, 'mulai', 'hajimeru'),
(135, 'memulai', 'hajimeru'),
(136, 'jelas', 'hakkiri'),
(137, 'setengah', 'han'),
(138, 'bunga', 'hana'),
(139, 'hidung', 'hana'),
(140, 'berpisah', 'hananeru'),
(141, 'bicara', 'hanasu'),
(142, 'separuh', 'hanbun'),
(143, 'tampan', 'hansamu na'),
(144, 'berlawanan', 'hantai'),
(145, 'membayar', 'hareru'),
(146, 'menajadi cerah', 'hareru'),
(147, 'jembatan', 'hashi'),
(148, 'sumpit', 'hashi'),
(149, 'berlari', 'hashiru'),
(150, 'bekerja', 'hataraku'),
(151, 'cepat', 'hayai'),
(152, 'bodo', 'heta'),
(153, 'kamar', 'heya'),
(154, 'mata hari', 'hi'),
(155, 'api', 'hi'),
(156, 'kiri', 'hidari'),
(157, 'timur', 'higashi'),
(158, 'kumis', 'hige'),
(159, 'cahaya', 'hikari'),
(160, 'menarik', 'hiku'),
(161, 'nendek', 'hikui'),
(162, 'sama', 'onaji'),
(163, 'cantik', 'kirei'),
(164, 'tunggu', 'cotto'),
(165, 'terima kasih', 'arigato');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `level` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `level`) VALUES
(1, 'dyatna.id', 'xcodesecurity', 'Admin'),
(6, 'abdurrahman09', 'abdu', 'Admin'),
(9, 'rahmat', 'password', 'User'),
(12, 'admin', 'admin', 'Admin'),
(13, 'user', 'user', 'User'),
(22, 'adiatna', 'user1', 'User'),
(23, 'sukmana', 'root', 'Admin'),
(24, 'hajimemaste', 'password', 'User'),
(25, 'adminBaru', 'adminBaru009', 'User'),
(26, 'Adiatna Sukmana', 'admin123', 'Admin'),
(27, 'user123', 'user123', 'User'),
(30, 'ini123', 'ini123', 'User'),
(31, 'iksanskmt', 'zxc', 'User'),
(32, 'dimas', 'subagja', 'User'),
(33, 'hj', 'bg', 'User');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kamus`
--
ALTER TABLE `kamus`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kamus`
--
ALTER TABLE `kamus`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=166;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
