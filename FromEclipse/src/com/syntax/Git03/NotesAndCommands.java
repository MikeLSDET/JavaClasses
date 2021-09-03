package com.syntax.Git03;

public class NotesAndCommands {

	public static void main(String[] args) {
		/*
		 * 
		 * we created a project of which we want a backup
​
so the first step after creating the project is
1.find the location of the project
2. we need to open terminals
3.navigate the terminal to the location of our project
​
to make our first commit
1.initalize the repository
git init
2.git status to check the current state of our repository
3.add the files in stsging area in order to track them
staging area is a tmeporary storage between working directory and repostiory
it takes the snapshot of the files in the working directory and holds them there
to go in the commit we make
​
​
git has alot of commands that have differnet purposes
git ls-files:
it lists all the files in the staging area
​
now lets assume that you accidently added wrongfile in the staging area
git rm --cached filename
​
4. we want all the files in the staging area to be in the repository
git commit -m "first commit"
​
5. to review the commits you have made
git log
​
We learned how to make a commit and delete file from the staging area and see files in the staging area
​
----------------------------------------------------------------------------------------------------------
​
we created a new java class and entered a template in it
this class is in the same package
1.add the file in the staging area
2.make a commit "the second commit"
​
now we will learn how we can revert back to the previous commits that we made
git restore --source commit code "filename"
​
​
MAC users dont panic we will run this command after the class please
donot run any other checkout or reset command
​
after we have moved back to the previous commit
at this point if we do git status what will be the output
 as we reverted to the last commit we have some new files in the working directory
​
​
we made a new commit for those who were having some changes and were
not able to revert due to some issues ..
​
​
Github connecting with local
1.create a new repository
2.Establish a connection between our local repository and the remote repository
that we created
but first we MUST check if there is already a connection or not???
git remote -v if it returns null output (no connection)
else it will give us the link of repostiory
now run git remote add origin URLOFREPO
​
3.In git we have a tree structure (we will discuss that in future)
for now we just know that after adding remote (connection) we MUST run
a command  (git branch -M main)
4.Everything is good now just type in command
git push -u origin(name of repo) main(branch)
​
for those who see a credential key in terminal enter your correct password
you may not see it while typing
make sure you type the correct one and press enter it will work
​
​
learning more git commands
1. make changes in the first class , any change can be made
2.git status (it shows file is modify)
3.git diff (shows difference in the files in working directory
and the staging area)
use case of this command (when i have made no changes in working directory,
but still the git status shows that there are some changes,
i simply run this command and it shows me change)
​
4.to see the changes in files in staging area and the last commit
we have (git diff --staged).
​
5 make a commit and now you will see
a red origin main and green head-->main it shows your local
and remote are not sync
so in order to sync them we do git push -->
git push means send the code to Github
so this time you donot need to do git push -u orign main that is what u need
to do only once and then after that git push is sufficient
​
To restore your working directory from what is in staging area
you have the command
git restore .  or git restore filename
​
​
​
Some common mistakes:
1.not being at the right folder ...
make sure that you are in the folder where you want to create the repository (i.e where your codes are)
2.Multiple local repos (one within another)
3.Forgetting to add things in staging area and trying to make a commit directly
​
When connecting to a remote
one local to one remote
If you have differnet commit history of local and remote
it will give you an error
.........
​
Quick tips:
Every time you create a new local repository you will have to do follwoing
for individual repo only once
1.connect each individual to unique remote repo(git remote add origin , git branch -M main)
​
2.git push -u origin main
​
then you can simply use git push and its all good
​
Remember if you close your git bash or terminal
it doesnot make any difference , you can reopen them and start from where
you left offf
		 * 
		 * 
		 */

	}

}
