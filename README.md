# 🦁 Zoo Management System (ZOOtopia) 🦁

Welcome to the Zoo Management System (ZOOtopia)! This project is an Object-Oriented Programming (OOP) example designed to help manage a zoo's operations. It includes functionalities for both administrators and visitors, such as managing animals, attractions, events, tickets, and special deals. This guide provides detailed instructions on how to set up and use the system, along with a breakdown of its features.

## 🚀 Getting Started

### 1. Prerequisites

Make sure you have the following installed on your machine:
- Java Development Kit (JDK) 8 or higher
- Apache Maven

### 2. Installation and Setup

1. **Download the Project**: Download the `2022435_SambhavGautam.zip` file and unzip it.
2. **Navigate to the Project Directory**:
   ```bash
   cd ZooSystem
   ```
3. **Build the Project**:
   - Clean the project:
     ```bash
     mvn clean
     ```
   - Compile the source code:
     ```bash
     mvn compile
     ```
   - Package the project into a JAR file:
     ```bash
     mvn package
     ```
4. **Run the Application**:
   - Navigate to the `target` directory:
     ```bash
     cd target
     ```
   - Run the application using the JAR file:
     ```bash
     java -jar ZooSystem-1.0-SNAPSHOT.jar
     ```

## 🌟 Key Features

### 1. Admin Functionalities

Admins can manage various aspects of the zoo including attractions, animals, events, discounts, and visitor stats. Here are the main features available to the Admin:

- **Manage Attractions**: Add, view, modify, and remove zoo attractions.
- **Manage Animals**: Add new animals, update their details, remove them, or view a list of all zoo animals.
- **Schedule Events**: Manage events, open or close attractions, and set or update ticket prices.
- **Set Discounts**: Define, modify, or remove discounts for different categories (e.g., Minor, Student, Senior).
- **Set Special Deals**: Add or remove special deals, such as discounts based on the number of attractions visited.
- **View Visitor Stats**: Check the total number of visitors and the total profit earned.
- **View Feedback**: Review feedback left by visitors.

### 2. Visitor Functionalities

Visitors can interact with the zoo in multiple ways:

- **Explore the Zoo**: View available attractions and animals.
- **Buy Membership**: Purchase a zoo membership for additional perks.
- **Buy Tickets**: Purchase tickets for attractions.
- **View Discounts**: See the discounts available for different categories.
- **View Special Deals**: Check out any special deals currently being offered.
- **Visit Animals**: Interact with or view detailed information about the animals in the zoo.
- **Visit Attractions**: Visit and learn more about various zoo attractions.
- **Leave Feedback**: Provide feedback on their zoo experience.

### 3. Exception Handling

The system gracefully handles input mismatches and other exceptions to ensure a smooth user experience.

### 4. Polymorphism in Action

The zoo system uses polymorphism to manage different types of animals. The `Animal` class is extended by specific animal classes (e.g., `Mammal`, `Reptile`, `Amphibian`), each overriding methods like `feed` and `read` for unique behavior in the "Visit Animal" section.

### 5. Hardcoded Animals

Six animals are hardcoded into the system to be present in the zoo by default:
1. **Simba** - A majestic lion 🦁
2. **Coco** - A playful chimpanzee 🐵
3. **KomodoDragon** - A fearsome Komodo dragon 🐉
4. **Rattler** - A venomous rattlesnake 🐍
5. **Frog** - A bullfrog 🐸
6. **Stripes** - A tiger salamander 🦎

### 6. Subcategories and Exact Spelling Requirements

For specific animal types, the user must enter exact subcategories to proceed:
- **Mammals**: `mammaltype1` or `mammaltype2`
- **Reptiles**: `reptiletype1` or `reptiletype2`
- **Amphibians**: `amphibiantype1` or `amphibiantype2`

> 📝 **Note**: Ensure the correct spelling is used when entering these subcategories!

### 7. Default Ticket Price

The default ticket price for all attractions is set to **101.0**.

## 🛠 Sample Run

Here is a quick sample run demonstrating how to navigate the system:

1. Start the application:
   ```bash
   java -jar ZooSystem-1.0-SNAPSHOT.jar
   ```

2. The main menu will appear with options for both Admin and Visitor:
   ```
   +---------------------------+
   |  Welcome to ZOOtopia!     |
   +---------------------------+
   |  1. Enter as Admin        |
   |  2. Enter as Visitor      |
   |  3. View Special Deals    |
   |  4. Exit                  |
   +---------------------------+
   ```

3. **Admin Workflow Example**:
   - Enter as Admin and use the credentials:
     - Username: `admin`
     - Password: `admin123`
   - Manage attractions, animals, set discounts, and view visitor stats.

4. **Visitor Workflow Example**:
   - Register or log in as a visitor.
   - Explore the zoo, buy tickets, view animals, and leave feedback.

5. **View and Manage Discounts and Deals**:
   - Admins can add, modify, or remove discounts.
   - Special deals can be set up, such as discounts for purchasing multiple attractions.

## 📝 Conclusion

The Zoo Management System (ZOOtopia) provides a comprehensive platform for managing a zoo's operations effectively. Whether you are an admin managing the backend operations or a visitor exploring the zoo, this system offers a range of functionalities to enhance your experience.

Enjoy managing and exploring ZOOtopia! 🌿🦓🦒🐘🐍

Feel free to contribute or report any issues to help us improve the system!
