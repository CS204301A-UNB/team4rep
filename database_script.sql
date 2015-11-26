CREATE TABLE Users (
	id INT NOT NULL AUTO_INCREMENT,
	firstname VARCHAR(20),
	lastname VARCHAR(20),
	password CHAR(32),
	PRIMARY KEY (id)
);

INSERT INTO Users (firstname, lastname, password) VALUES("Gehad", "Elrobey", "202cb962ac59075b964b07152d234b70");

CREATE TABLE Courses (
	id INT NOT NULL AUTO_INCREMENT,
	course_id VARCHAR(30),
	course_name VARCHAR(50),
	course_description VARCHAR(200),
	PRIMARY KEY (id)
);

INSERT INTO Courses (course_id, course_name, course_description) VALUES("CS2043", "Software Engineering 1", "Introduction to fundamentals of the discipline of software engineering with focus on the software development life cycle. Topics include software development methodologies and processes, requirements analysis, modeling, architecture, design, implementation, testing, and maintenance. Basics of software management are also introduced.");

CREATE TABLE take_course (
	student_id INT NOT NULL,
	course_id INT NOT NULL,
	FOREIGN KEY (student_id) REFERENCES Users(id),
	FOREIGN KEY (course_id) REFERENCES Courses(id),
	CONSTRAINT UNIQUE (student_id,course_id)
);

INSERT INTO take_course VALUES(1, 1);