HOME_FOLDER = ZooSystem
0) Download 2022435_SambhavGautam.zip unzip it and  go to ZooSystem dir .
1) mvn clean
2) mvn compile
3) mvn package
4) cd target
5) java -jar ZooSystem-1.0-SNAPSHOT.jar

-> InputMismatch exceptions are handled also.
-> Six Animals Are Hardcoded that is they will be present in zoo by default
-> Polymorphism is used in these hardcoded animal which extends Animal class and overrides feed and read method that will be used in Visit Animal section .
-> Two special deals given which can be added and removed as per choice by admin user
-> I have also made two subcategories of mammal, reptile and amphibian each and the user must enter mammaltype1 or mammaltype2 in mammal subcategories exactly same as it is.
-> reptiletype1 or reptiletype2 in reptile subcategory and amphibiantype1 or amphibiantype2 in amphibian category exact spelling please otherwise it will not proceed;
-> default ticket price for attrcation is set to 101.0 .


---------------------------------------------Sample Run--------------------------------------------
PS D:\ZooSystem> mvn clean
PS D:\ZooSystem> mvn compile
PS D:\ZooSystem> mvn package
PS D:\ZooSystem> cd target
PS D:\ZooSystem\target> java -jar ZooSystem-1.0-SNAPSHOT.jar
+---------------------------+
|  Welcome to ZOOtopia!     |
+---------------------------+
|  1. Enter as Admin        |
|  2. Enter as Visitor      |
|  3. View Special Deals    |
|  4. Exit                  |
+---------------------------+
Enter your Choice[1-4] ::
1
Enter Admin Username:::
admin
Enter Admin Password:::
admin123
Logged in as Admin.
+---------------------------+
|  Admin Menu  :
+---------------------------+
|   1. Manage Attractions
|   2. Manage Animals
|   3. Schedule Events
|   4. Set Discounts
|   5. Set Special Deal
|   6. View Visitor Stats
|   7. View Feedback
|   8. Exit
+---------------------------+
Enter your Choice [1- 8] ::
1
+---------------------------+
|  Manage Attractions!     |
+---------------------------+
1. Add Attraction
2. View Attractions
3. Modify Attraction
4. Remove Attraction
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
1
Enter Attraction Name::
a1
Enter Attraction Description::
good attrction
Enter the ticket price
Enter ticket price :::
19
Attraction Added Successfully....
+---------------------------+
|  Manage Attractions!     |
+---------------------------+
1. Add Attraction
2. View Attractions
3. Modify Attraction
4. Remove Attraction
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
1
Enter Attraction Name::
a2
Enter Attraction Description::
nice
Enter the ticket price
Enter ticket price :::
15
Attraction Added Successfully....
+---------------------------+
|  Manage Attractions!     |
+---------------------------+
1. Add Attraction
2. View Attractions
3. Modify Attraction
4. Remove Attraction
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
1
Enter Attraction Name::
a3
Enter Attraction Description::
okk
Enter the ticket price
Enter ticket price :::
23
Attraction Added Successfully....
+---------------------------+
|  Manage Attractions!     |
+---------------------------+
1. Add Attraction
2. View Attractions
3. Modify Attraction
4. Remove Attraction
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
2
+---------------------------+
1. Name ::a1
1. Description ::good attrction
1. UniqueID ::1
+---------------------------+
+---------------------------+
2. Name ::a2
2. Description ::nice
2. UniqueID ::2
+---------------------------+
+---------------------------+
3. Name ::a3
3. Description ::okk
3. UniqueID ::3
+---------------------------+
+---------------------------+
|  Manage Attractions!     |
+---------------------------+
1. Add Attraction
2. View Attractions
3. Modify Attraction
4. Remove Attraction
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
3
Enter the Attraction ID :::
3
Details of Attraction with Attraction ID ::3
Name of Attraction ID ->a3
Description of Attraction ID -> okk
Enter New Name ::
garden
Enter Updated Description ::
good garden
Details Has Been Updated Successfully......
+---------------------------+
|  Manage Attractions!     |
+---------------------------+
1. Add Attraction
2. View Attractions
3. Modify Attraction
4. Remove Attraction
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
4
Enter attractionID to remove the attraction :::
2
Attraction Has Been Removed...
+---------------------------+
|  Manage Attractions!     |
+---------------------------+
1. Add Attraction
2. View Attractions
3. Modify Attraction
4. Remove Attraction
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
5
+---------------------------+
|  Admin Menu  :
+---------------------------+
|   1. Manage Attractions
|   2. Manage Animals
|   3. Schedule Events
|   4. Set Discounts
|   5. Set Special Deal
|   6. View Visitor Stats
|   7. View Feedback
|   8. Exit
+---------------------------+
Enter your Choice [1- 8] ::
2
+---------------------------+
|  Manage Animals !     |
+---------------------------+
1. Add Animal
2. Update Animal Details
3. Remove Animal
4. View Animals
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
1
Animal name  ::
koala
Animal Brief Description ::
good animal
Animal Sound  ::
no sound
Animal type (Mammal,Amphibian or Reptile ) ::
amphibian
Enter Subtype Amphibian ( enter exact spelling AmphibianType1 or AmphibianType2) ::
amphibiantype1
Added from Amphibian ...
Runtime polymorphism .....
+---------------------------+
|  Manage Animals !     |
+---------------------------+
1. Add Animal
2. Update Animal Details
3. Remove Animal
4. View Animals
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
1
Animal name  ::
snake
Animal Brief Description ::
snake
Animal Sound  ::
ziiii
Animal type (Mammal,Amphibian or Reptile ) ::
reptile
Enter Subtype Reptile ( enter exact spelling ReptileType1 or ReptileType2) ::
reptiletype1
Added from Reptile ...
Runtime polymorphism .....
+---------------------------+
|  Manage Animals !     |
+---------------------------+
1. Add Animal
2. Update Animal Details
3. Remove Animal
4. View Animals
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
2
Enter Existing Animal name  to be modified   ::
snake
Animal Existing type (Mammal,Amphibian or Reptile ) to be modified ::
reptile
Enter New Name for Animal ::
new snake
Enter New Description for animal ::
new snake
Enter New Sound for animal ::
siiz
Animal New type (Mammal,Amphibian or Reptile ) ::
reptile
Enter New -Subtype of Reptile ReptileType1 or ReptileType2 :::
reptiletype1
Modified from Reptile....
Runtime Polymorphism
+---------------------------+
|  Manage Animals !     |
+---------------------------+
1. Add Animal
2. Update Animal Details
3. Remove Animal
4. View Animals
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
3
Enter Animal Name to be Removed :::
koala
Enter the type of the Animal to be Removed :::
amphibian
Removed from Amphibian
Runtime Polymorphism
+---------------------------+
|  Manage Animals !     |
+---------------------------+
1. Add Animal
2. Update Animal Details
3. Remove Animal
4. View Animals
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
4
+---------------------------+

Animal Name ::Simba
Animal Description ::A majestic lion with a golden mane, often seen napping in the shade of the savannah.
Animal Type ::Mammal
Animal Sound ::Roars

Animal Name ::Coco
Animal Description ::A playful and intelligent chimpanzee who loves swinging through the trees and solving puzzles.
Animal Type ::Mammal
Animal Sound ::Chatter

Animal Name ::KomodoDragon
Animal Description ::A fearsome Komodo dragon, the largest lizard species on Earth, known for its stealth and venomous bite.
Animal Type ::Reptile
Animal Sound ::Hisses menacingly

Animal Name ::Rattler
Animal Description ::A venomous rattlesnake with a distinctive rattling tail, a master of camouflage in the desert.
Animal Type ::Reptile
Animal Sound ::W rattle

Animal Name ::Frog
Animal Description ::A bullfrog that resides by the pond, a skilled jumper, and a symphony conductor of the wetlands.
Animal Type ::Amphibian
Animal Sound ::Riz

Animal Name ::Stripes
Animal Description ::A tiger salamander, marked by distinctive black and yellow stripes, renowned for its regenerative abilities.
Animal Type ::Amphibian
Animal Sound ::Croak

Animal Name ::new snake
Animal Description ::new snake
Animal Type ::reptile
Animal Sound ::siiz
+---------------------------+
|  Manage Animals !     |
+---------------------------+
1. Add Animal
2. Update Animal Details
3. Remove Animal
4. View Animals
5. Exit
+---------------------------+
Enter your Choice [1- 5] ::
5
+---------------------------+
|  Admin Menu  :
+---------------------------+
|   1. Manage Attractions
|   2. Manage Animals
|   3. Schedule Events
|   4. Set Discounts
|   5. Set Special Deal
|   6. View Visitor Stats
|   7. View Feedback
|   8. Exit
+---------------------------+
Enter your Choice [1- 8] ::
3
Attractions that can be opened, closed or can set price for  are :::
+---------------------------+
1. Name ::a1
1. Description ::good attrction
1. UniqueID ::1
+---------------------------+
+---------------------------+
2. Name ::garden
2. Description ::good garden
2. UniqueID ::3
+---------------------------+
+---------------------------+
1. Open Attraction
2. Close Attraction
3. Set Price for Attraction
4. Exit
+---------------------------+
Enter your Choice [1- 4] ::
1
Give attractionID to open the Attraction :::
1
Attraction has been opened....
+---------------------------+
1. Open Attraction
2. Close Attraction
3. Set Price for Attraction
4. Exit
+---------------------------+
Enter your Choice [1- 4] ::
1
Give attractionID to open the Attraction :::
3
Attraction has been opened....
+---------------------------+
1. Open Attraction
2. Close Attraction
3. Set Price for Attraction
4. Exit
+---------------------------+
Enter your Choice [1- 4] ::
4
+---------------------------+
|  Admin Menu  :
+---------------------------+
|   1. Manage Attractions
|   2. Manage Animals
|   3. Schedule Events
|   4. Set Discounts
|   5. Set Special Deal
|   6. View Visitor Stats
|   7. View Feedback
|   8. Exit
+---------------------------+
Enter your Choice [1- 8] ::
4
+---------------------------+
|  Set Discount !     |
+---------------------------+
1. Add Discount
2. Modify Discount
3. Remove Discount
4. Exit
+---------------------------+
Enter your choice [1-4] :::
1
Enter Discount Category :::
MINOR
Enter Discount Percentage [1-100]
10
Discount Has been added Successfully .....
+---------------------------+
|  Set Discount !     |
+---------------------------+
1. Add Discount
2. Modify Discount
3. Remove Discount
4. Exit
+---------------------------+
Enter your choice [1-4] :::
1
Enter Discount Category :::
STUDENT
Enter Discount Percentage [1-100]
20
Discount Has been added Successfully .....
+---------------------------+
|  Set Discount !     |
+---------------------------+
1. Add Discount
2. Modify Discount
3. Remove Discount
4. Exit
+---------------------------+
Enter your choice [1-4] :::
1
Enter Discount Category :::
SENIOR
Enter Discount Percentage [1-100]
23
Discount Has been added Successfully .....
+---------------------------+
|  Set Discount !     |
+---------------------------+
1. Add Discount
2. Modify Discount
3. Remove Discount
4. Exit
+---------------------------+
Enter your choice [1-4] :::
2
Present Discounts that can be modified ::::
Discount Category :::MINOR
Discount Percentage :::10
Discount Category :::STUDENT
Discount Percentage :::20
Discount Category :::SENIOR
Discount Percentage :::23
Enter Discount Category to be modified :::
SENIOR
Enter the new discount Category :::
SENIORNEW
Enter the new  Discount Percentage :::
Enter Discount Percentage [1-100]
34
Discount Has Been Modified successfully .....
+---------------------------+
|  Set Discount !     |
+---------------------------+
1. Add Discount
2. Modify Discount
3. Remove Discount
4. Exit
+---------------------------+
Enter your choice [1-4] :::
3
Present Discounts that can be Removed ::::
Discount Category :::MINOR
Discount Percentage :::10
Discount Category :::STUDENT
Discount Percentage :::20
Discount Category :::SENIORNEW
Discount Percentage :::34
Enter Discount Category to be Removed :::
SENIORNEW
Discount Has been Removed Successfully ......
+---------------------------+
|  Set Discount !     |
+---------------------------+
1. Add Discount
2. Modify Discount
3. Remove Discount
4. Exit
+---------------------------+
Enter your choice [1-4] :::
4
+---------------------------+
|  Admin Menu  :
+---------------------------+
|   1. Manage Attractions
|   2. Manage Animals
|   3. Schedule Events
|   4. Set Discounts
|   5. Set Special Deal
|   6. View Visitor Stats
|   7. View Feedback
|   8. Exit
+---------------------------+
Enter your Choice [1- 8] ::
5
1. Add Special Deal ...
2. Remove Special Deal ...
3. Exit ...
Enter your Choice [1-3] inclusive :::
1
You Can Add Two Special Deals :::
1. If a person buys more than 2 attractions, they get a special discount of 15% on the total amount
2. If a person buys more than 3 attractions, they get a special discount of 30% on the total amount
Please enter 1 to add the first deal and 2 to add the second deal. ::
1
Special Deal Set Successfully ....
1. Add Special Deal ...
2. Remove Special Deal ...
3. Exit ...
Enter your Choice [1-3] inclusive :::
1
You Can Add Two Special Deals :::
1. If a person buys more than 2 attractions, they get a special discount of 15% on the total amount
2. If a person buys more than 3 attractions, they get a special discount of 30% on the total amount
Please enter 1 to add the first deal and 2 to add the second deal. ::
2
Special Deal Set Successfully
1. Add Special Deal ...
2. Remove Special Deal ...
3. Exit ...
Enter your Choice [1-3] inclusive :::
2
Two Special Deals Are Active Currently ...
1. If a person buys more than 2 attractions, they get a special discount of 15% on the total amount
2. If a person buys more than 3 attractions, they get a special discount of 30% on the total amount
Enter 1 or 2 or (press 3 ro cancel )for Corresponding Deal to remove ::
2
Special Deal Removed Successfully ....
1. Add Special Deal ...
2. Remove Special Deal ...
3. Exit ...
Enter your Choice [1-3] inclusive :::
1
You Can Add Two Special Deals :::
1. If a person buys more than 2 attractions, they get a special discount of 15% on the total amount
2. If a person buys more than 3 attractions, they get a special discount of 30% on the total amount
Please enter 1 to add the first deal and 2 to add the second deal. ::
2
Special Deal Set Successfully
1. Add Special Deal ...
2. Remove Special Deal ...
3. Exit ...
Enter your Choice [1-3] inclusive :::
3
+---------------------------+
|  Admin Menu  :
+---------------------------+
|   1. Manage Attractions
|   2. Manage Animals
|   3. Schedule Events
|   4. Set Discounts
|   5. Set Special Deal
|   6. View Visitor Stats
|   7. View Feedback
|   8. Exit
+---------------------------+
Enter your Choice [1- 8] ::
6
Total Number Of Visitors :::0
Total Earned Profit is ::: ?0.0
No Attractions has been visited ...
+---------------------------+
|  Admin Menu  :
+---------------------------+
|   1. Manage Attractions
|   2. Manage Animals
|   3. Schedule Events
|   4. Set Discounts
|   5. Set Special Deal
|   6. View Visitor Stats
|   7. View Feedback
|   8. Exit
+---------------------------+
Enter your Choice [1- 8] ::
7
No Feedback ...
+---------------------------+
|  Admin Menu  :
+---------------------------+
|   1. Manage Attractions
|   2. Manage Animals
|   3. Schedule Events
|   4. Set Discounts
|   5. Set Special Deal
|   6. View Visitor Stats
|   7. View Feedback
|   8. Exit
+---------------------------+
Enter your Choice [1- 8] ::
8
+---------------------------+
|  Welcome to ZOOtopia!     |
+---------------------------+
|  1. Enter as Admin        |
|  2. Enter as Visitor      |
|  3. View Special Deals    |
|  4. Exit                  |
+---------------------------+
Enter your Choice[1-4] ::
2
+---------------------------+
1. Register
2. Login
+---------------------------+
Enter your Choice[1-2] ::
1
Enter Visitor Name: a
Enter age +ve value ::
9
Enter Visitor Phone Number: 0182089218
Enter Visitor Balance +ve value ::
1000
Enter Visitor Email: a@email.com
Enter Visitor Password: 1
+---------------------------+
1. Register
2. Login
+---------------------------+
Enter your Choice[1-2] ::
2
Enter Visitor  Username:::
a
Enter Visitor Password:::
1
Login Successful....
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
1
+---------------------------+
1. View Attraction
2. View Animals
3. Exit
+---------------------------+
Enter Choice in range [1-3] ::
1
+---------------------------+
1. Name ::a1
Price ::19.0
2. Name ::garden
Price ::101.0
+---------------------------+
Enter the Number to learn about between [1- 2] :::::
1
good attrction
.....Buy Your Ticket Now .......
+---------------------------+
1. View Attraction
2. View Animals
3. Exit
+---------------------------+
Enter Choice in range [1-3] ::
2
+---------------------------+

Animal Name ::Simba
Animal Description ::A majestic lion with a golden mane, often seen napping in the shade of the savannah.
Animal Type ::Mammal
Animal Sound ::Roars

Animal Name ::Coco
Animal Description ::A playful and intelligent chimpanzee who loves swinging through the trees and solving puzzles.
Animal Type ::Mammal
Animal Sound ::Chatter

Animal Name ::KomodoDragon
Animal Description ::A fearsome Komodo dragon, the largest lizard species on Earth, known for its stealth and venomous bite.
Animal Type ::Reptile
Animal Sound ::Hisses menacingly

Animal Name ::Rattler
Animal Description ::A venomous rattlesnake with a distinctive rattling tail, a master of camouflage in the desert.
Animal Type ::Reptile
Animal Sound ::W rattle

Animal Name ::Frog
Animal Description ::A bullfrog that resides by the pond, a skilled jumper, and a symphony conductor of the wetlands.
Animal Type ::Amphibian
Animal Sound ::Riz

Animal Name ::Stripes
Animal Description ::A tiger salamander, marked by distinctive black and yellow stripes, renowned for its regenerative abilities.
Animal Type ::Amphibian
Animal Sound ::Croak

Animal Name ::new snake
Animal Description ::new snake
Animal Type ::reptile
Animal Sound ::siiz
+---------------------------+
1. View Attraction
2. View Animals
3. Exit
+---------------------------+
Enter Choice in range [1-3] ::
3
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
2
..Only Press 1 or 2...
1. Basic Membership (?20)
2. Premium Membership (?80)
Enter input in range [1 - 2] :::
1
Apply CouponCode(enter no or none if no coupon code ) :::

....Successfully Purchased Basic MemberShip....
Total Balance left :: ?980.0
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
9
Logged Out ....
+---------------------------+
|  Welcome to ZOOtopia!     |
+---------------------------+
|  1. Enter as Admin        |
|  2. Enter as Visitor      |
|  3. View Special Deals    |
|  4. Exit                  |
+---------------------------+
Enter your Choice[1-4] ::
2
+---------------------------+
1. Register
2. Login
+---------------------------+
Enter your Choice[1-2] ::
1
Enter Visitor Name: s
Enter age +ve value ::
89
Enter Visitor Phone Number: 7291728121
Enter Visitor Balance +ve value ::
1000
Enter Visitor Email: sam@email.com
Enter Visitor Password: 1
+---------------------------+
1. Register
2. Login
+---------------------------+
Enter your Choice[1-2] ::
2
Enter Visitor  Username:::
s
Enter Visitor Password:::
1
Login Successful....
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
2
..Only Press 1 or 2...
1. Basic Membership (?20)
2. Premium Membership (?80)
Enter input in range [1 - 2] :::
1
Apply CouponCode(enter no or none if no coupon code ) :::
MINOR10
....Successfully Purchased Basic MemberShip....
Total Balance left :: ?982.0
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
3
+---------------------------+
1. Name ::a1
Price ::19.0
2. Name ::garden
Price ::101.0
+---------------------------+
Enter Your Choice in range [1-2]
1
Enter number of tickets(+ve value >0) :::
3
Apply CouponCode (enter no or none if no coupon code ) :::
no
Special Deal applied since 15% discount since you have bought more than 2 tickets..
....Ticket Bought Successfully....
Balance Left :::933.55
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
3
+---------------------------+
1. Name ::a1
Price ::19.0
2. Name ::garden
Price ::101.0
+---------------------------+
Enter Your Choice in range [1-2]
2
Enter number of tickets(+ve value >0) :::
5
Apply CouponCode (enter no or none if no coupon code ) :::
no
Special Deal applied 30% discount since you have bought more than 3 tickets..
....Ticket Bought Successfully....
Balance Left :::580.05
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
4
1. MINOR(MINOR%10)-MINOR10
1. STUDENT(STUDENT%20)-STUDENT20
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
5
1. If a person buys more than 2 attractions, they get a special discount of 15% on the total amount
2. If a person buys more than 3 attractions, they get a special discount of 30% on the total amount
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
6
+---------------------------+
1. Animal Name ::Simba
2. Animal Name ::Coco
3. Animal Name ::KomodoDragon
4. Animal Name ::Rattler
5. Animal Name ::Frog
6. Animal Name ::Stripes
7. Animal Name ::new snake
Enter Animal You want to visit in range [1-7 ]
1
1. Feed An Animal
2. Read About Animal
Choose to feed or read about animal (1 or 2 ):::
1
Animal Makes Sound :::
Feeding the lion: Simba
Feeding in Zoo Class in Lion Class
Runtime PolyMorphism
Animal Feed Thanks .....
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
6
+---------------------------+
1. Animal Name ::Simba
2. Animal Name ::Coco
3. Animal Name ::KomodoDragon
4. Animal Name ::Rattler
5. Animal Name ::Frog
6. Animal Name ::Stripes
7. Animal Name ::new snake
Enter Animal You want to visit in range [1-7 ]
5
1. Feed An Animal
2. Read About Animal
Choose to feed or read about animal (1 or 2 ):::
2
Lets Learn About the Animal ....
Reading to the bullfrog: Frog
Reading in Zoo Class in AmericanBullFrog Class
Runtime PolyMorphism
..... Thanks .....
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
7
+---------------------------+
1. Name ::a1
Price ::19.0
2. Name ::garden
Price ::101.0
+---------------------------+
Enter Your Choice in range [1-2]
1
Welcome to the Attraction -> a1
Description ->good attrction
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
8
Enter Feedback that you want to give ::::
good attraction
+---------------------------+
1. Explore the Zoo
2. Buy Membership
3. Buy Tickets
4. View Discounts
5. View Special Deals
6. Visit Animals
7. Visit Attractions
8. Leave Feedback
9. Log Out
+---------------------------+
Enter your Choice[1-9] ::
9
Logged Out ....
+---------------------------+
|  Welcome to ZOOtopia!     |
+---------------------------+
|  1. Enter as Admin        |
|  2. Enter as Visitor      |
|  3. View Special Deals    |
|  4. Exit                  |
+---------------------------+
Enter your Choice[1-4] ::
3
1. If a person buys more than 2 attractions, they get a special discount of 15% on the total amount
2. If a person buys more than 3 attractions, they get a special discount of 30% on the total amount
+---------------------------+
|  Welcome to ZOOtopia!     |
+---------------------------+
|  1. Enter as Admin        |
|  2. Enter as Visitor      |
|  3. View Special Deals    |
|  4. Exit                  |
+---------------------------+
Enter your Choice[1-4] ::
1
Enter Admin Username:::
admin
Enter Admin Password:::
admin123
Logged in as Admin.
+---------------------------+
|  Admin Menu  :
+---------------------------+
|   1. Manage Attractions
|   2. Manage Animals
|   3. Schedule Events
|   4. Set Discounts
|   5. Set Special Deal
|   6. View Visitor Stats
|   7. View Feedback
|   8. Exit
+---------------------------+
Enter your Choice [1- 8] ::
6
Total Number Of Visitors :::2
Total Earned Profit is ::: ?439.95
Most Visited Attractions ....
1. Attraction Name a1with ticketed visitors1
+---------------------------+
|  Admin Menu  :
+---------------------------+
|   1. Manage Attractions
|   2. Manage Animals
|   3. Schedule Events
|   4. Set Discounts
|   5. Set Special Deal
|   6. View Visitor Stats
|   7. View Feedback
|   8. Exit
+---------------------------+
Enter your Choice [1- 8] ::
7
+---------------------------+
Name :::a
Feedback ::null
+---------------------------+
Name :::s
Feedback ::good attraction
+---------------------------+
|  Admin Menu  :
+---------------------------+
|  Welcome to ZOOtopia!     |
+---------------------------+
|  1. Enter as Admin        |
|  2. Enter as Visitor      |
|  3. View Special Deals    |
|  4. Exit                  |
+---------------------------+
Enter your Choice[1-4] ::
4
Thanks For Using Interface ....
PS D:\ZooSystem\target>