USE [master]
GO

CREATE DATABASE [OrderFoodDB]
GO
USE [OrderFoodDB]
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](255) NULL,
	[password] [nvarchar](255) NULL,
	[displayName] [nvarchar](255) NULL,
	[address] [nvarchar](255) NULL,
	[email] [nvarchar](255) NULL,
	[phone] [nvarchar](255) NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](255) NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 2/24/2022 7:50:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[order_id] [int] NULL,
	[productName] [nvarchar](255) NULL,
	[productImage] [nvarchar](255) NULL,
	[productPrice] [float] NULL,
	[quantity] [int] NULL,
 CONSTRAINT [PK_OrderDetail] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 2/24/2022 7:50:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[account_id] [int] NULL,
	[totalPrice] [float] NULL,
	[note] [text] NULL,
	[created_date] [date] NULL,
	[shipping_id] [int] NULL,
 CONSTRAINT [PK_Orders] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 2/24/2022 7:50:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](255) NULL,
	[quantity] [int] NULL,
	[price] [float] NULL,
	
	[image_url] [nvarchar](255) NULL,
	[created_date] [date] NULL,
	[category_id] [int] NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Shipping]    Script Date: 2/24/2022 7:50:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Shipping](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](255) NULL,
	[phone] [nvarchar](255) NULL,
	[address] [nvarchar](255) NULL,
 CONSTRAINT [PK_Shipping] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Category] ON 

INSERT [dbo].[Category] ([id], [name]) VALUES (1, N'Đồ Ăn')
INSERT [dbo].[Category] ([id], [name]) VALUES (2, N'Đồ Uống')
INSERT [dbo].[Category] ([id], [name]) VALUES (3, N'Tráng Miệng')
INSERT [dbo].[Category] ([id], [name]) VALUES (4, N'Khai vị')
INSERT [dbo].[Category] ([id], [name]) VALUES (5, N'Bánh Kẹo')
INSERT [dbo].[Category] ([id], [name]) VALUES (6, N'Rượu')
INSERT [dbo].[Category] ([id], [name]) VALUES (7, N'Hoa Qủa')
INSERT [dbo].[Category] ([id], [name]) VALUES (8, N'Hải Sản')
INSERT [dbo].[Category] ([id], [name]) VALUES (9, N'Bán Chạy')
INSERT [dbo].[Category] ([id], [name]) VALUES (10, N'Sale')
SET IDENTITY_INSERT [dbo].[Category] OFF
GO
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (1, N'Cá Hồng Chiên Xù', 9, 6.3,  N'http://dummyimage.com/100x100.png/ff4444/ffffff', CAST(N'2022-08-23' AS Date), 8)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (2, N'Cá Vược Hấp', 8, 12.5,  N'http://dummyimage.com/224x100.png/ff4444/ffffff', CAST(N'2021-04-03' AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (3, N'Cá ba sa', 18, 10.3,  N'http://dummyimage.com/242x100.png/ff4444/ffffff', CAST(N'2021-01-21' AS Date), 6)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (4, N'Súp Vi Cá Mập', 17, 13.2,  N'http://dummyimage.com/108x100.png/5fa2dd/ffffff', CAST(N'2021-02-09' AS Date), 6)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (5, N'Súp cua', 6, 17,  N'http://dummyimage.com/120x100.png/cc0000/ffffff', CAST(N'2021-08-23' AS Date), 4)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (6, N'Súp hải sản', 16, 5.2, N'http://dummyimage.com/171x100.png/cc0000/ffffff', CAST(N'2021-09-25' AS Date), 2)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (7, N'Cháo ngao', 19, 16.4, N'http://dummyimage.com/191x100.png/5fa2dd/ffffff', CAST(N'2021-07-07' AS Date), 8)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (8, N'Gà gói hạt sen', 10, 12.9, N'http://dummyimage.com/177x100.png/ff4444/ffffff', CAST(N'2022-02-03' AS Date), 7)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (9, N'Tôm Hùm Hấp Bia', 15, 14.2,  N'http://dummyimage.com/197x100.png/cc0000/ffffff', CAST(N'2022-01-28' AS Date), 2)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [image_url], [created_date], [category_id]) VALUES (10, N'Mực chiên xù', 13, 7.2,  N'http://dummyimage.com/116x100.png/dddddd/000000', CAST(N'2021-06-06' AS Date), 2)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (11, N'Trâu xào', 17, 10.4, N'http://dummyimage.com/243x100.png/cc0000/ffffff', CAST(N'2021-04-05' AS Date), 7)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (12, N'Mực xào', 13, 15.9,  N'http://dummyimage.com/192x100.png/cc0000/ffffff', CAST(N'2021-03-16' AS Date), 6)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (13, N'Bò bít tết', 15, 16.6,  N'http://dummyimage.com/162x100.png/ff4444/ffffff', CAST(N'2021-02-26' AS Date), 5)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (14, N'Bò walington', 13, 14.9,  N'http://dummyimage.com/102x100.png/dddddd/000000', CAST(N'2021-11-02' AS Date), 2)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (15, N'Gà nướng ngũ vị', 11, 13.3, N'http://dummyimage.com/217x100.png/5fa2dd/ffffff', CAST(N'2021-10-29' AS Date), 5)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (16, N'Lườn gà xào nấm hương', 12, 9.6,  N'http://dummyimage.com/115x100.png/ff4444/ffffff', CAST(N'2021-07-27' AS Date), 3)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (17, N'Gà nướng mật ong', 16, 10.2,  N'http://dummyimage.com/100x100.png/5fa2dd/ffffff', CAST(N'2021-08-05' AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (18, N'Gỏi gà lá chanh chua ngọt', 17, 19.9,  N'http://dummyimage.com/155x100.png/dddddd/000000', CAST(N'2021-06-25' AS Date), 2)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (19, N'Bia hơi Hà Nội', 12, 19.6,  N'http://dummyimage.com/187x100.png/5fa2dd/ffffff', CAST(N'2021-09-20' AS Date), 10)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (20, N'Gỏi Cá Hồi', 8, 7.4,  N'http://dummyimage.com/210x100.png/cc0000/ffffff', CAST(N'2021-12-12' AS Date), 10)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (21, N'Cá Hồi sốt chanh leo', 15, 8.7, N'http://dummyimage.com/237x100.png/ff4444/ffffff', CAST(N'2021-07-02' AS Date), 3)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (22, N'Cá quả nướng muối ớt', 18, 9.5,N'http://dummyimage.com/191x100.png/cc0000/ffffff', CAST(N'2021-07-18' AS Date), 6)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (23, N'Bánh Macaron Pháp', 11, 20,  N'http://dummyimage.com/108x100.png/ff4444/ffffff', CAST(N'2021-08-20' AS Date), 4)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (24, N'Bánh Táo Mỹ', 18, 9.6,  N'http://dummyimage.com/215x100.png/ff4444/ffffff', CAST(N'2021-01-06' AS Date), 10)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (25, N'Bánh Mochi Nhật Bản', 6, 13.3, N'http://dummyimage.com/207x100.png/5fa2dd/ffffff', CAST(N'2021-05-05' AS Date), 5)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (26, N'Bánh Tiramisu Ý', 11, 12,  N'http://dummyimage.com/190x100.png/ff4444/ffffff', CAST(N'2021-05-06' AS Date), 8)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (27, N'Trà phô mai kem sữa ', 17, 19.3,  N'http://dummyimage.com/174x100.png/5fa2dd/ffffff', CAST(N'2021-05-09' AS Date), 5)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [image_url], [created_date], [category_id]) VALUES (28, N'Trà hoa quả', 6, 13, N'http://dummyimage.com/116x100.png/ff4444/ffffff', CAST(N'2021-08-08' AS Date), 4)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (29, N'Matcha đá xay', 6, 6.7,  N'http://dummyimage.com/240x100.png/dddddd/000000', CAST(N'2021-05-29' AS Date), 4)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (30, N'Trà đào chanh sả', 15, 13.7,   N'http://dummyimage.com/126x100.png/5fa2dd/ffffff', CAST(N'2022-02-06' AS Date), 9)
INSERT [dbo].[Product] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (31, N'Trà hoa quả nhiệt đới', 20, 15.9,N'http://dummyimage.com/147x100.png/cc0000/ffffff', CAST(N'2021-02-04' AS Date), 1)
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [image_url], [created_date], [category_id]) VALUES (32, N'Trà sữa gạo rang Hàn Quốc', 12, 10.5,  N'http://dummyimage.com/129x100.png/ff4444/ffffff', CAST(N'2021-08-09' AS Date), 4)

GO
INSERT [dbo].[Product] ([id], [name], [quantity], [price], [description], [image_url], [created_date], [category_id]) VALUES (100, N'Mustang', 12, 17.7, N'Toxic effect of freon', N'http://dummyimage.com/120x100.png/dddddd/000000', CAST(N'2021-04-09' AS Date), 7)
SET IDENTITY_INSERT [dbo].[Product] OFF
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK__OrderDeta__order__30F848ED] FOREIGN KEY([order_id])
REFERENCES [dbo].[Orders] ([id])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK__OrderDeta__order__30F848ED]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK__Orders__account___2F10007B] FOREIGN KEY([account_id])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK__Orders__account___2F10007B]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK__Orders__shipping__300424B4] FOREIGN KEY([shipping_id])
REFERENCES [dbo].[Shipping] ([id])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK__Orders__shipping__300424B4]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK__Product__categor__267ABA7A] FOREIGN KEY([category_id])
REFERENCES [dbo].[Category] ([id])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK__Product__categor__267ABA7A]
GO
USE [master]
GO
ALTER DATABASE [ShoppingOnlineDB] SET  READ_WRITE 
GO

SET IDENTITY_INSERT [dbo].[CategoryTours] ON 

INSERT [dbo].[CategoryTours] ([id], [name]) VALUES (1, N'Việt Nam')
INSERT [dbo].[CategoryTours] ([id], [name]) VALUES (2, N'Trung Quôc')
INSERT [dbo].[CategoryTours] ([id], [name]) VALUES (3, N'Hàn Quốc')
INSERT [dbo].[CategoryTours] ([id], [name]) VALUES (4, N'Thái Lan')
INSERT [dbo].[CategoryTours] ([id], [name]) VALUES (5, N'Châu Âu')
INSERT [dbo].[CategoryTours] ([id], [name]) VALUES (6, N'Singapore')
SET IDENTITY_INSERT [dbo].[CategoryTours] OFF
GO
SET IDENTITY_INSERT [dbo].[Tours] ON 

INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (1, N'Vịnh Hạ Long', 9, 6.3,  N'http://dummyimage.com/100x100.png/ff4444/ffffff', CAST(N'2022-08-23' AS Date), 1)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (2, N'Cố Đô Huế', 8, 12.5,  N'http://dummyimage.com/224x100.png/ff4444/ffffff', CAST(N'2021-04-03' AS Date), 1)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (3, N'Đồ Sơn', 18, 10.3,  N'http://dummyimage.com/242x100.png/ff4444/ffffff', CAST(N'2021-01-21' AS Date), 1)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (4, N'Nha Trang', 17, 13.2,  N'http://dummyimage.com/108x100.png/5fa2dd/ffffff', CAST(N'2021-02-09' AS Date), 1)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (5, N'Phú Quốc', 6, 17,  N'http://dummyimage.com/120x100.png/cc0000/ffffff', CAST(N'2021-08-23' AS Date), 1)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (6, N'Vạn Lý Trường Thành', 16, 5.2, N'http://dummyimage.com/171x100.png/cc0000/ffffff', CAST(N'2021-09-25' AS Date), 2)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (7, N'Tử Cấm Thành', 19, 16.4, N'http://dummyimage.com/191x100.png/5fa2dd/ffffff', CAST(N'2021-07-07' AS Date), 2)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (8, N'Bến Thượng Hải', 10, 12.9, N'http://dummyimage.com/177x100.png/ff4444/ffffff', CAST(N'2022-02-03' AS Date), 2)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (9, N'Di Hòa Viên', 15, 14.2,  N'http://dummyimage.com/197x100.png/cc0000/ffffff', CAST(N'2022-01-28' AS Date), 2)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price], [image_url], [created_date], [category_id]) VALUES (10, N'Chùa Treo Huyền Không', 13, 7.2,  N'http://dummyimage.com/116x100.png/dddddd/000000', CAST(N'2021-06-06' AS Date), 2)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (11, N'Tháp Namsan', 17, 10.4, N'http://dummyimage.com/243x100.png/cc0000/ffffff', CAST(N'2021-04-05' AS Date), 3)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (12, N'Cung điện Gyeongbokgung', 13, 15.9,  N'http://dummyimage.com/192x100.png/cc0000/ffffff', CAST(N'2021-03-16' AS Date), 3)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (13, N'Đảo Jeju', 15, 16.6,  N'http://dummyimage.com/162x100.png/ff4444/ffffff', CAST(N'2021-02-26' AS Date), 3)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (14, N'Công viên Everland', 13, 14.9,  N'http://dummyimage.com/102x100.png/dddddd/000000', CAST(N'2021-11-02' AS Date), 3)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (15, N'Vườn hoa Morning Calm', 11, 13.3, N'http://dummyimage.com/217x100.png/5fa2dd/ffffff', CAST(N'2021-10-29' AS Date), 3)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (16, N'Grand Palace ', 12, 9.6,  N'http://dummyimage.com/115x100.png/ff4444/ffffff', CAST(N'2021-07-27' AS Date), 4)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (17, N'Chùa Phật Ngọc ', 16, 10.2,  N'http://dummyimage.com/100x100.png/5fa2dd/ffffff', CAST(N'2021-08-05' AS Date), 4)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (18, N'Cung điện Vimanmek', 17, 19.9,  N'http://dummyimage.com/155x100.png/dddddd/000000', CAST(N'2021-06-25' AS Date), 4)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (19, N'Chùa Phật Vàng', 12, 19.6,  N'http://dummyimage.com/187x100.png/5fa2dd/ffffff', CAST(N'2021-09-20' AS Date), 4)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (20, N'Sông Chao Phraya', 8, 7.4,  N'http://dummyimage.com/210x100.png/cc0000/ffffff', CAST(N'2021-12-12' AS Date), 4)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (21, N'Paris – Pháp', 15, 8.7, N'http://dummyimage.com/237x100.png/ff4444/ffffff', CAST(N'2021-07-02' AS Date), 5)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (22, N'Venice – Ý', 18, 9.5,N'http://dummyimage.com/191x100.png/cc0000/ffffff', CAST(N'2021-07-18' AS Date), 5)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (23, N'Barcelona – Tây Ban Nha', 11, 20,  N'http://dummyimage.com/108x100.png/ff4444/ffffff', CAST(N'2021-08-20' AS Date), 5)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (24, N'Rome – Ý', 18, 9.6,  N'http://dummyimage.com/215x100.png/ff4444/ffffff', CAST(N'2021-01-06' AS Date), 5)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (25, N'Amsterdam – Hà Lan', 6, 13.3, N'http://dummyimage.com/207x100.png/5fa2dd/ffffff', CAST(N'2021-05-05' AS Date), 5)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (26, N'Cologne – Đức', 11, 12,  N'http://dummyimage.com/190x100.png/ff4444/ffffff', CAST(N'2021-05-06' AS Date), 5)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (27, N'Florence – Ý ', 17, 19.3,  N'http://dummyimage.com/174x100.png/5fa2dd/ffffff', CAST(N'2021-05-09' AS Date), 5)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price], [image_url], [created_date], [category_id]) VALUES (28, N'Công viên Merlion', 6, 13, N'http://dummyimage.com/116x100.png/ff4444/ffffff', CAST(N'2021-08-08' AS Date), 6)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (29, N'Cầu Helix', 6, 6.7,  N'http://dummyimage.com/240x100.png/dddddd/000000', CAST(N'2021-05-29' AS Date), 6)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (30, N'China Town', 15, 13.7,   N'http://dummyimage.com/126x100.png/5fa2dd/ffffff', CAST(N'2022-02-06' AS Date), 6)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price],  [image_url], [created_date], [category_id]) VALUES (31, N'Little India', 20, 15.9,N'http://dummyimage.com/147x100.png/cc0000/ffffff', CAST(N'2021-02-04' AS Date), 6)
INSERT [dbo].[Tours] ([id], [name], [quantity], [price], [image_url], [created_date], [category_id]) VALUES (32, N'Clark Quay', 12, 10.5,  N'http://dummyimage.com/129x100.png/ff4444/ffffff', CAST(N'2021-08-09' AS Date), 6)
