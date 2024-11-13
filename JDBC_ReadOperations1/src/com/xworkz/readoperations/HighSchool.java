package com.xworkz.readoperations;

public class HighSchool {
    private String insertQuery = "INSERT INTO students3_table VALUES" +
            "(1, 'Anil Kumar', 'anil.kumar@example.com', 'Anil@123', '9876543210', 'Bangalore High School', 'Class 10', '2023')," +
            "(2, 'Priya Shetty', 'priya.shetty@example.com', 'Priya@456', '9876543211', 'Mysore High School', 'Class 9', '2024')," +
            "(3, 'Manoj Naik', 'manoj.naik@example.com', 'Manoj@789', '9876543212', 'Udupi High School', 'Class 10', '2023')," +
            "(4, 'Neha Patil', 'neha.patil@example.com', 'Neha@101', '9876543213', 'Belgaum High School', 'Class 8', '2025')," +
            "(5, 'Rajesh Rao', 'rajesh.rao@example.com', 'Rajesh@202', '9876543214', 'Hubli High School', 'Class 9', '2026')," +
            "(6, 'Sneha Kulkarni', 'sneha.kulkarni@example.com', 'Sneha@303', '9876543215', 'Shimoga High School', 'Class 10', '2023')," +
            "(7, 'Vinay Gowda', 'vinay.gowda@example.com', 'Vinay@404', '9876543216', 'Davangere High School', 'Class 9', '2024')," +
            "(8, 'Kavya N', 'kavya.n@example.com', 'Kavya@505', '9876543217', 'Hassan High School', 'Class 10', '2023')," +
            "(9, 'Aditya Menon', 'aditya.menon@example.com', 'Aditya@606', '9876543218', 'Mangalore High School', 'Class 8', '2025')," +
            "(10, 'Megha Shastry', 'megha.shastry@example.com', 'Megha@707', '9876543219', 'Raichur High School', 'Class 9', '2026')," +
            "(11, 'Rahul Reddy', 'rahul.reddy@example.com', 'Rahul@808', '9876543220', 'Bagalkot High School', 'Class 10', '2023')," +
            "(12, 'Lakshmi Iyer', 'lakshmi.iyer@example.com', 'Lakshmi@909', '9876543221', 'Chitradurga High School', 'Class 8', '2025')," +
            "(13, 'Nikhil Shetty', 'nikhil.shetty@example.com', 'Nikhil@010', '9876543222', 'Gulbarga High School', 'Class 9', '2024')," +
            "(14, 'Reshma R', 'reshma.r@example.com', 'Reshma@111', '9876543223', 'Bellary High School', 'Class 10', '2023')," +
            "(15, 'Akash Kumar', 'akash.kumar@example.com', 'Akash@212', '9876543224', 'Mandya High School', 'Class 8', '2026')," +
            "(16, 'Shreya P', 'shreya.p@example.com', 'Shreya@313', '9876543225', 'Tumkur High School', 'Class 9', '2024')," +
            "(17, 'Vivek Joshi', 'vivek.joshi@example.com', 'Vivek@414', '9876543226', 'Chikmagalur High School', 'Class 10', '2023')," +
            "(18, 'Anjali K', 'anjali.k@example.com', 'Anjali@515', '9876543227', 'Bijapur High School', 'Class 8', '2025')," +
            "(19, 'Manoj Kini', 'manoj.kini@example.com', 'Manoj@616', '9876543228', 'Kolar High School', 'Class 9', '2024')," +
            "(20, 'Priya Shetty', 'priya.shetty@example.com', 'Priya@717', '9876543229', 'Bidar High School', 'Class 10', '2023');";

    public String getInsertQuery() {
        return insertQuery;
    }
}
