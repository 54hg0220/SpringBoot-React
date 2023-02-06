
<h1 align="center">
  Employee Management system
  <br>
</h1>

<h4 align="center">Full stack (Spring Boot + React + MySQL8)</h4>

<p align="center">
  <a href="#key-features">Key Features</a> •
  <a href="#how-to-use">How To Use</a> •
  <a href="#project-design">Project Design</a> •
  <a href="#future-work">Future Work</a> 
</p>

## Key Features

* View all profiles 
* Create new profile
* Delete profile from the data source
* Edit profile by ID

## How To Use

```bash
# Clone this repository
$ git clone https://github.com/54hg0220/auspost-challenge.git
```
Run **MainEntry** file in the **src/main/java/com.demo.profileservice** folder
![img_1.png](project-folder.png)
The main interface is shown like below:

![img.png](main-interface.png)

Then, enter your selection to use the application.
## Project Design

![img_1.png](project-structure.png)

1. Main Entry：Display information, interact with user, simply business logic defined
2. Service: Business logic implementation and interact with data source layer.
3. Data Source: Access the data and interact with the data source. This is set as a list in this application, but the data source can be replaced with xml, json or database. 

## Future Work

* Engage some boundary testing for ProfileServiceImpl
* Write a controller to split the user interaction from the main entry class
