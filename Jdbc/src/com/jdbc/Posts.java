package com.jdbc;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;
	import java.util.Scanner;

	public class Posts {
		
			public static void main(String[] args) throws Exception{
					Scanner s=new Scanner(System.in);
					System.out.println("enter post id");
					int post_id=s.nextInt();
					
					System.out.println("enter title");
					String title=s.next();
					
					System.out.println("enter description");
					String description=s.next();
					
					System.out.println("enter reg_id");
					int reg_id=s.nextInt();
					
					System.out.println("enter post type");
					int post_type=s.nextInt();
					switch(post_type)
					{
						case 1:
							System.out.println("video");
							break;
						case 2:
							System.out.println("audio");
							break;
						case 3:
							System.out.println("image");
							break;
					default:
							System.out.println("choose valid option");
					}
					System.out.println("enter filepath");
					String file_path=s.next();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/socialmedia","root","");
					Statement st=conn.createStatement();
					
					String query="INSERT INTO posts VALUES("+post_id+",'"+title+"','"+description+"',"+reg_id+","+post_type+",'"+file_path+"')";
					int result=st.executeUpdate(query);
					System.out.println(result);
					conn.close();
				}
			}


