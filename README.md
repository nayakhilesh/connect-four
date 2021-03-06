connect-four
============

Connect Four game with AI and Swing UI in Java

This started out as a final project for CIS 121 UPenn, Spring 2011.
I have since improved it and added many new features such as:

	-window resizing
	-ability to undo moves
	-ability to reset the game
	-more intuitive UI for selecting who goes first (also allows computer vs. computer play)
	-refactored and improved general code quality
	-smaller memory footprint since now it doesn't create and populate the entire move search tree at the
	 beginning of each move, instead it makes a move and undoes it after checking for it's value
	-converted MiniMax algorithm to negaMax
	-added alpha-beta pruning to negaMax
	-added ability for computer to choose randomly from among equally good moves (controlled by "Deterministic"
	 checkbox on the UI)
	-computer can be forced to make time limited moves (implemented by iterative deepening) as opposed to
	 previously only limited by depth of the search tree. This allows the computer to explore the tree
	 deeper as the game progresses
	-computer chooses moves asynchronously - this stops UI freezing when computer is making a move
	-refactored code to MVC design pattern
	-added depth discounting for the value of moves in the search tree - this makes the Ai defer a loss for
	 as long as possible and take a win as soon as possible
