package com.syntax.Manual04;

public class RecapAndNewStuff {

	public static void main(String[] args) {
		/* We will be working in a software development team
		 * 1.- What is ad hoc testing?- Random testing, exploratory testing, w/o planning and documentation. 
		 * can be performed by anyone on team; devs, testers, test lead/scrum master, BA.
		 * 
		 * 2. What is smoke testing?-Testing most important components/functionalities of the application. done before launching
		 * If a smoke test fails then it is a serious issue
		 * Smoke test is a light weight test.
		 * 
		 * 3. What is regression testing? - executes every single test case
		 * Testing all functionalities of application
		 * Testing that is performed ,most of the time, before code gets pushed/deployed to production.
		 * To ensure that nothing else was affected by any of the new code changes.
		 * 
		 * 4. It is the middle of a two weeks sprint, devs deploy their code to the QA/Test enviorment.
		 * leaving you with 3 days to complete your testing. You have enough time to complete tickets on board,
		 * but nothing else. What tests would you execute first?
		 * 
		 * A. Test the items first, then run smoke, then run regression.
		 * 
		 * B.Run smoke first, then test ticket items, then regression.
		 * 
		 * C. Run smoke first, then regression, then ticket items
		 * 
		 * D. None of the above.
		 * 
		 * THE CORRECT ANSWER  is D., tickets take priority, then run smoke, (regression get run before release not after sprint.
		 * A first 2 parts are correct but not the last one (regression).
		 * 
		 * "Tickets on the board" - items/tickets/Issues(Jira) on the Scrum board.
		 * 
		 * 5. What is 508 compliance testing?
		 * Requirement for accessible applications for everyone, needs to be used by all companies, its the law.
		 * 
		 * 6. What is black box testing?
		 * performed by testers that don't need to know the internal structure of the application.
		 * 
		 * 7. What is white box testing?
		 * Testing that is performed by users who know the internal structures of the application
		 * ,mostly developers (Unit testing)
		 * 
		 * 
		 * 8.What is considered internal/external structure?
		 * Internal- code that was used to develop the application
		 * External- functional features that is being used by users, like (login, logout, html links)
		 * 
		 * 9. What kind of testing is considered performance testing? 
		 * 
		 * Non-Functional
		 * 
		 * Testing that is non functional that test back end side of things
		 * 
		 * things to include when reporting a bug; name of bug, short description of bug, steps to reproduce,
		 * longer description in big box.
		 * act/expec results
		 * video/screenshot of bug
		 * 
		 * test cases include: pre conditions, test id, steps ( steps are actions), step numbers, expect/actual, pass or fail. comments
		 * reviewed by.
		 * 
		 * ^ Manual classic test cases
		 * 
		 * 
		 * Cucumber Scenarios:
		 * - Are test cases that are written differently using differently using different rules.
		 * -We write cucumber scenarios in a syntax(formula/language) called gherkin( plain english text).
		 * 
		 * Keywords in Gherkin we need to use:
		 * 
		 * Given- pre condition
		 * when - action
		 * then- expected result
		 * 
		 * 
		 * Example :
		 * Acceptance Criteria:
		 * As a public netflix user, I should be able to log in with valid credentials
		 * 
		 * Given a netflix user is on the netflix home page
		 * When the user logs in with valid credentials
		 * Then the user should see the netflix landing page
		 * 
		 * Cucumber follows a Behavior Driven Development (BDD) Approach.
		 * 
		 * -When we refer to Cucumber BDD, we refer to describing the behavior that a user
		 * will take on an application
		 * 
		 * With cucumber BDDD, we describe business rules AKA requirements.
		 * Use third person when using Given, When, Then. no first person point of view.
		 * 
		 * 
		 * Cucumber scenarios are meant for automation testing using a Cucumber based framework.
		 * But these scenarios can also be your manual test cases until they need to be automated.
		 * 
		 * 
		 * THE MAIN GOAL OF WRITING A CUCUMBER SCENARIO IS FOR THE SCENARIO TO MAKE SENSE.
		 * other keywords:
		 * And
		 * But
		 * ------- you can make it long, you can repeat given, ands, buts, whens, ands etc,.
		 * Given this
		 * And that
		 * When this
		 * But that
		 * Then this
		 * 
		 * Rules to follow:
		 * Given- pre condition
		 * When - Action
		 * Then- Expected Result
		 * 
		 * And/But to make it make sense
		 * 
		 * Requirement example :
		 * We want user to log in with valid credentials
		 * 
		 * Acceptance Criteria example:
		 * As a user, I should be able to log in with valid credentials.
		 * 
		 * Difference between user story and AC
		 * a user story us a ticket/issue/document where we write the AC
		 * 
		 * Acceptance criteria are summaries of requirements which are written in user stories.
		 * so user story is the space(designated area) where we place acceptance criteria
		 * 
		 * LOE stands for level of effort
		 * 
		 */

	}

}
