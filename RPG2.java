//Griffin Tattongeyer
//2024 oct 20-30
//dog quest RPG
public class RPG2
{
    //caricer sheets
    String Cname[] = {"dog", "cat", "snake", "toad", "bird", "rat"};
    int Chp[] = {25, 25, 25, 15, 15, 25};
    String Cmove1[] = {"bite", "scratch", "soothe", "tonic", "shoot", "poison bite"};
    char Cmove1T[] = {'n', 'n', 'p', 'p', 'n', 'n'};
    String Cmove1type[] = {"damage", "damage", "heal", "buff", "damage", "poison"};
    int Cmove1Dam[] = {10, 5, 10, 0, 10, 3};
    String Cmove2[] = {"guard", "cast", "trap", "jump", "fly", "tall wip"};
    char Cmove2T[] = {'s', 'n', 'n', 's', 's', 'n'};
    String Cmove2Type[] = {"hide", "cast", "afraid", "hide", "hide", "debuff"};
    int Cmove2Dam[] = {0, 20, 0, 0, 0, 3};
    String Cmove3[] = {"bark", "lick", "poison bite", "soothe", "gust", "stealth claw"};
    char Cmove2T[] = {'n', 'p', 'n', 'p', 'n', 'p'};
    String Cmove3type[] = {"afraid", "buff", "poison", "heal", "debuff", "cast"};
    int Cmove3Dam[] = {0, 0, 3, 10, 3, 20};
    //player vars
    int pc = 1;
    int p1 = 0;
    int p1hp = 50;
    String p1statP1 = "";
    String p1statN = "";
    int poisontimerP1 = 0;
    int bufftimerP = 0;
    int buffP = 0;
    int debufftimerP = 0;
    int debuffP = 0;
    int p2 = 0;
    int p2hp = 50;
    String p2statP = "";
    String p2statN = "";
    int poisontimerP2 = 0
    int p3 = 0;
    int p3hp = 50;
    String p3statP = "";
    String p3statN = "";
    int poisontimerP3 = 0;
    int p4 = 0;
    int p4hp = 50;
    String p4statP = "";
    String p4statN = "";
    int poisontimerP4 = 0;
    //enemy vars
    int e1 = 0;
    int e1hp = 0;
    String e1statP = "";
    String e1statN = "";
    int poisontimerE1 = 0;
    int bufftimerE = 0;
    int buffE = 0;
    int debufftimerE = 0;
    int debuffE = 0;
    int e2 = 0;
    int ehp = 0;
    String e2statP = "";
    String e2statN = "";
    int poisontimerE2 = 0;
    int e3 = 0;
    int e3hp = 0;
    String e3statP = "";
    String e3statN = "";
    int poisontimerE3 = 0;
    int e4 = 0;
    int e4hp = 0;
    String e4statP = "";
    String e4statN = "";
    int poisontimerE4 = 0;
    //area flags
    int r = 0;
    int g = 0;
    int sc = 0;
    int p = 0;
    int sw = 0;
    int t = 0;
    int f = 0;
    //encounter flags
    int re = 0;
    int ge = 0;
    int sce = 0;
    int pe = 0;
    int swe = 0;
    int te = 0;
    char play = 'y';
    //inventory
    int Money = 20;
    int treat = 5;
    int big_treat = 0;
    int rusty_knife = 0;
    int air_horn = 0;
    public static void main (String args[])
    {
	new RPG2 ();
    }


    public RPG2 ()
    {
	System.out.println (" you are a dog swept away from you home, now you must find your way back, you are on a...");
	System.out.println ("::::::::.............................................................................::.......:....:");
	System.out.println (":::::::::::::.......:......................................................::::::::..::...........:-");
	System.out.println (":.:::::::::::::.:..::.:......:..................................................:...................");
	System.out.println (":.::::..............................................................................................");
	System.out.println (":...................................................................................................");
	System.out.println (":..................................................................................................:");
	System.out.println (".................................   ......... .....................................................-");
	System.out.println ("-......................... ....     ..........    .................................................:");
	System.out.println ("=.........:....::.........   ..             .        .. .................         ..........  .....=");
	System.out.println ("+*+++++++++++=+=+++=-.                          ..                                                .:");
	System.out.println ("--=****************++=.                   ...:-=====:...                                        --.:");
	System.out.println ("----:-+***#**********+=.            .--===++*****++++++++==-:                                   .+*=");
	System.out.println ("---.::-=++******#****++==:.     .:-++**********#**********+==.                                ..:+*=");
	System.out.println ("++-..::*@@@@@@@@#******+++==:-++++*******####*#%@@@@@@%##*****++=:.                     :*. .:=++*#=");
	System.out.println ("*+=--.-*@%****=*@%+=+***#******#**#***#**#####@@#*####@@%**###***+-                  .=+#@-.-+**###=");
	System.out.println ("+**=::-*@%**#####@+ .%@@@@@%###@@@@@@@%######@@%####*##@@%#@@#***%%:  %@%#@@:  +@@%@@%*%@@@%**#####=");
	System.out.println ("++=-: .=@*.=*****@*:#%=: .+@%#@@%###%@%######@@########%@%#@@####%@*:%%    =%::@@#*=**+*%@#***#####=");
	System.out.println ("++=-. .=@#--#*#*#@#-@#.   :%@#@@#####@%######@@%#######@@%#%@####@@##@@%%%%%@#*#%@@@@%**%@#########+");
	System.out.println ("*#*+: :+@%--#**#@%+=%%=:. *@%#@@%###@@%#######@@###%@%@@@##@@####@@##@@****%%%%@#++*%@%*%@*+**#####+");
	System.out.println ("***=-::=@@@@@@@@#++++#@@%@@#++*%@@@@@@#########%@@@@@@@@%#*#@@@@@@@%#*@@@@@@%#*%@@@@@%==*@@%=-=+*##*");
	System.out.println ("*#**+=:--.--+*+**+++=::=..===+*###*#%@##################%%****#######*####***+++=+-.-:::.:-:..::+**+");
	System.out.println ("*##**==-.. :+++*++=-:.::  ---=+%@@%@@#*+*######**###*###***--+**#####**#*+++==+-=+::..::... ::..=.:=");
	System.out.println ("**##*+===:.-=++*=-=====:. :::---=-=-+=+=+******=++++++++++=::-+*#####*+++***=:::-=::..:.... .::-===+");
	System.out.println ("==+**=.:-:.:-=::=:-=:==-.   . . . : .-+=++==++==-:=--=====-:::-=+****=-+-::........::::--::---==++*+");
	System.out.println ("+====-.. .:-===  .-=..-=-:  :::   -  :==+++=====+==---+++==- .--=*=+=+===::-:    .--=========+++*+++");
	System.out.println ("--::::.   .-==-   --. -==:  .--..:..:::=++++==--==---=-==---:::-=====--+++==:    .--=++++*********=:");
	System.out.println ("----:::...:-++=.::--.:---:..::-----::....::--=----:..-=====:::::..:::==-+**++. ..:-=++*++*****#####*");
	System.out.println ("------==========-:..::::.............:-:..:::.........::::::......:::-+==++=+:....::.......::--=++++");
	System.out.println ("====----::::::::.....:::::::.......::::::::.....................:::::-----:-:::::::::::::::::::---==");
	System.out.println ("::::::::::::::-:-::::::::::::::::::----==-:-::.......:::::::::::::--::-:---::::::::::::::-::::------");
	System.out.println (":::::::....::::::::::::::::::::::::--------:::::::::::::::::::::----------------------:-------======");
	System.out.println ("::::::::::::::::::::::::::::::::::------::::::::::::::------------------------------------=========+");
	System.out.println ("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::---:::----------------------------======++");
	System.out.println ("::::::::::::::::::::::..:...::...::::::---::::::::::::::::::::::---------------------------------===");
	System.out.println ("::-----:::::--::::---:--------------------------------------------=====================++=======+++=");
	play = IO.inputChar ("play game? (y/n) ");
	while (play != 'n')
	{
	    int place = (int) (Math.random () * 7);
	    if (place == 1 && r == 0)
		road ();
	    else if (place == 2 && g == 0)
		garbage_dump ();
	    else if (place == 3 && sc == 0)
		school ();
	    else if (place == 4 && p == 0)
		park ();
	    else if (place == 5 && sw == 0)
		sewer ();
	    else if (place == 6 && t == 0)
		train_tracks ();
	    else if (r == 1 && g == 1 && sc == 1 && p == 1 && sw == 1 && t == 1)
	    {
		//play ending
		System.out.println ("you see the light of your home ahead. you knock on the door.");
		System.out.println ("your mother throws it open and pulls you into a hug.");
		System.out.println ("after some explaing and discusstion, she agrees to adopt your new friends.");
		System.out.println ("you find your way to your bed and curl up in it.");
		System.out.println ("you have had enough adventure for a long time.");
		System.out.println ();
		System.out.println ("thank you for playing Dog Quest. i had a lot of fun programing it,");
		System.out.println ("and i hope you had a lot of fun playing it -Griffin");
		play = 'n';
	    }
	}
    }


    public void road ()
    { // no atomatic party meber
	System.out.println ("\tyou arive at long road");
	for (i = 0 ; i >= 5 ; i++)
	{
	    int e = (int) (Math.random () * 4);
	    if (e == 1)
	    {
		int t = (int) (Math.random () * 8) + 1;
		if (t <= 4)
		    e1 = 0;
		else if (t <= 7)
		    e1 = 1;
		else
		    e1 = 4;
		battle ();
	    }
	    else if (e == 2)
		shop ();
	    else
	    {

		int a = (int) Math.random () * 2;
		if (a == 1 && re == 0)
		{
		    //area spific encounter
		    System.out.println ("you find a dog hit by the side of the round. It whimpers quietly ");
		    System.out.println ("do you");
		    System.out.println ("a) use a big treat to heal him \n or");
		    System.out.println ("b) let him pass on and 'partak'");
		    char c = IO.inputChar ();
		    if (c == 'a')
		    {
			pc++;
			System.out.println ("the dog stands up, thanks you and disids to join your quest");
		    }
		    re++;
		}
		else
		    //genral encounter
		    encounter ();
	    }
	}
	int np = (int) (Math.random () * 2);
	r++;
	play = IO.inputChar ("keep going? (y/n)");
    }


    public void garbage_dump ()
    {
	System.out.println ("\tyou arive at garbage dump");
	if (pc != 4)
	{
	    System.out.println ("a well gromed cat joins you on your quest");
	    int p = (int) Math.random () * 4;
	    if (p == 4)
	    {
		if (p2 < -1)
		    p2 = 1;
		else if (p3 < -1)
		    p3 = 1;
		else
		    p4 = 1;
	    }
	}
	int e = (int) (Math.random () * 4);
	if (e == 1)
	{
	    int t = (int) (Math.random () * 8) + 1;
	    if (t <= 4)
		e1 = 1;
	    else if (t <= 7)
		e1 = 5;
	    else
		e1 = 2;
	    battle ();
	}
	else if (e == 2)
	    shop ();
	else
	    //genral encounter
	    encounter ();

	g++;
	play = IO.inputChar ("keep going? (y/n)");
    }


    public void school ()
    {
	System.out.println ("\tyou arive at school");
	int e = (int) (Math.random () * 4);
	if (e == 1)
	{
	    int t = (int) (Math.random () * 8) + 1;
	    if (t <= 4)
		e1 = 3;
	    else if (t <= 7)
		e1 = 1;
	    else
		e1 = 4;
	    battle ();
	}
	else if (e == 2)
	    shop ();
	else
	    encounter ();
	sc++;
	play = IO.inputChar ("keep going? (y/n) ");
    }


    public void park ()
    {
	System.out.println ("\tyou arive at park");
	int e = (int) (Math.random () * 4);
	if (e == 1)
	{
	    int t = (int) (Math.random () * 8) + 1;
	    if (t <= 4)
		e1 = 2;
	    else if (t <= 7)
		e1 = 3;
	    else
		e1 = 5;
	    battle ();
	}
	else if (e == 2)
	    shop ();
	else
	    encounter ();
	p++;
	play = IO.inputChar ("keep going? (y/n)");
    }


    public void sewer ()
    {
	System.out.println ("\tyou arive at sewer");
	int e = (int) (Math.random () * 4);
	if (e == 1)
	{
	    int t = (int) (Math.random () * 8) + 1;
	    if (t <= 4)
		e1 = 5;
	    else if (t <= 7)
		e1 = 2;
	    else
		e1 = 1;
	    battle ();
	}
	else if (e == 2)
	    shop ();
	else
	    encounter ();
	sw++;
	play = IO.inputChar ("keep going? (y/n)");
    }


    public void train_tracks ()
    {
	System.out.println ("\tyou arive at train tracks");
	int e = (int) (Math.random () * 4);
	if (e == 1)
	{
	    int t = (int) (Math.random () * 8) + 1;
	    if (t <= 4)
		e1 = 4;
	    else if (t <= 7)
		e1 = 1;
	    else
		e1 = 2;
	    battle ();
	}
	else if (e == 2)
	    shop ();
	else
	    encounter ();
	t++;
	play = IO.inputChar ("keep going? (y/n)");
    }


    public void factory ()
    {
	//curestly disabuld maby as a secret area
	System.out.println ("\tyou arive at factory");
	int e = (int) (Math.random () * 4);
	if (e == 1)
	{
	    int t = (int) (Math.random () * 8) + 1;
	    if (t <= 4)
		e1 = 0;
	    else if (t <= 7)
		e1 = 1;
	    else
		e1 = 4;
	    battle ();
	}
	else if (e == 2)
	    shop ();
	else
	    encounter ();
	f++;
	play = IO.inputChar ("keep going? (y/n)");
    }


    public void battle ()
    {
	//print battle start
	System.out.println ("you are attacked by " + Cname [e1]);
	if (pc >= 2)
	    System.out.println (" and " + Cname [e2]);
	else if (pc >= 3)
	    System.out.println (" and " + Cname [e3]);
	else if (pc >= 4)
	    System.out.println (" and " + Cname [e4]);
	System.out.println ();
	System.out.println ("your HP equal to " + p1hp);
	if (pc >= 2)
	    System.out.println (Cname [p2] + "'s hp is " + p2hp);
	else if (pc >= 3)
	    System.out.println (Cname [p3] + "'s hp is " + p3hp);
	else if (pc >= 4)
	    System.out.println (Cname [p4] + "'s hp is " + p4hp);
	System.out.println ();


	//battle loop
	while (p1hp > 0 && e1hp > 0)
	{
	    System.out.println ();
	    System.out.println ("your HP equal to " + p1hp);
	    if (pc >= 2)
		System.out.println (Cname [p2] + "'s hp is " + p2hp);
	    else if (pc >= 3)
		System.out.println (Cname [p3] + "'s hp is " + p3hp);
	    else if (pc >= 4)
		System.out.println (Cname [p4] + "'s hp is " + p4hp);
	    System.out.println ();
	    System.out.println ("enemy " + Cname [e1] + "'s HP equal to " + e1hp);
	    if (pc >= 2)
		System.out.println (Cname [e2] + "'s hp is " + e2hp);
	    else if (pc >= 3)
		System.out.println (Cname [e3] + "'s hp is " + e3hp);
	    else if (pc >= 4)
		System.out.println (Cname [e4] + "'s hp is " + e4hp);
	    System.out.println ();
	    if (p1hp > 0) // the player/enmey can not take there tern if they ar dead or not present
		playerChoice1 ();
	    if (pc >= 2 && p2hp > 0)
		playerChoice2 ();
	    else if (pc >= 3 && p3hp > 0)
		playerChoice3 ();
	    else if (pc >= 4 && p4hp > 0)
		playerChoice4 ();
	    if (e1hp > 0)
		EnemyChoice (e1, e1statN);
	    if (pc >= 2 && e2hp > 0)
		EnemyChoice (e2, e2statN);
	    else if (pc >= 3 && e3hp > 0)
		EnemyChoice (e3, e3statN);
	    else if (pc >= 4 && e4hp > 0)
		EnemyChoice (e4, e4statN);
	}
	//who won
	if (e1hp <= 0)
	{
	    System.out.println ("the " + Cname [e1] + " runs away");
	    if (pc >= 2)
		System.out.println ("the " + Cname [e2] + " runs away");
	    Money += (Math.random () * 10);
	    poisontimerE1 = 0;
	    poisontimerE2 = 0;
	    poisontimerE3 = 0;
	    poisontimerE4 = 0;
	}
	else
	{
	    System.out.println ("\tyou have been defeated");
	    play = 'n';
	}
    }


    public void playerChoice1 ()
    {
	System.out.println ("it is your tern");
	//afraid
	if (p1statN == "afraid")
	{
	    System.out.println ("you are to sacred to move");
	    p1statN = "";
	}
	else
	{
	    System.out.println ("what should you do");
	    System.out.println ("a) " + Cmove1 [p1]);
	    System.out.println ("b) " + Cmove2 [p1]);
	    System.out.println ("c) " + Cmove3 [p1]);
	    System.out.println ("d) item");
	    char select = IO.inputChar ("");
	    //process my choice
	    if (select == 'a')
	    {
		if (pc > 1)
		{
		    if (CmoveT1 [p1] == N)
		    {
			System.out.println ("who to you atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println ("you " + Cmove1 [p1] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove1 [p1] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove1 [p1] + " enemy " + Cname [e3]);
			else
			    System.out.println ("you " + Cmove1 [p1] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT1 [p1] == p)
		    {
			System.out.println ("who to you help?");
			System.out.println ("a) your self");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println ("you " + Cmove1 [p1] + Cname [p1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove1 [p1] + Cname [p2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove1 [p1] + Cname [p3]);
			else
			    System.out.println ("you " + Cmove1 [p1] + Cname [p4]);
		    }
		    else
			target = 'a';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove1type [p1], Cmove1Dam [p1], target);
	    }

	    else if (select == 'b')
	    {
		if (pc > 1)
		{
		    if (CmoveT2 [p1] == N)
		    {
			System.out.println ("who to you atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e3]);
			else
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT2 [p1] == p)
		    {
			System.out.println ("who to you help?");
			System.out.println ("a) your self");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println ("you " + Cmove2 [p1] + Cname [p1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove2 [p1] + Cname [p2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove2 [p1] + Cname [p3]);
			else
			    System.out.println ("you " + Cmove2 [p1] + Cname [p4]);
		    }
		    else
			target = 'a';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove2Type [p1], Cmove2Dam [p1], target);
	    }

	    else if (select == 'c')
	    {
		if (pc > 1)
		{
		    if (CmoveT3 [p1] == N)
		    {
			System.out.println ("who to you atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e3]);
			else
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT2 [p1] == p)
		    {
			System.out.println ("who to you help?");
			System.out.println ("a) your self");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println ("you " + Cmove3 [p1] + Cname [p1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove3 [p1] + Cname [p2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove3 [p1] + Cname [p3]);
			else
			    System.out.println ("you " + Cmove3 [p1] + Cname [p4]);
		    }
		    else
			target = 'a';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove3type [p1], Cmove3Dam [p1]);
	    }


	    else
		item ();
	}
    }


    public void playerChoice2 ()
    {
	System.out.println ("it is " + Cname [p2] + "'s tern");
	//afraid
	if (p2statN == "afraid")
	{
	    System.out.println (Cname [p2] + " is to sacred to move");
	    p2statN = "";
	}
	else
	{
	    System.out.println ("what should " + Cname [p2] + " do");
	    System.out.println ("a) " + Cmove1 [p2]);
	    System.out.println ("b) " + Cmove2 [p2]);
	    System.out.println ("c) " + Cmove3 [p2]);
	    System.out.println ("d) item");
	    char select = IO.inputChar ("");
	    //process my choice
	    if (select == 'a')
	    {
		if (pc > 1)
		{
		    if (CmoveT1 [p2] == N)
		    {
			System.out.println ("who should " + Cname [p2] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println ("you " + Cmove1 [p2] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove1 [p2] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove1 [p2] + " enemy " + Cname [e3]);
			else
			    System.out.println ("you " + Cmove1 [p2] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT1 [p1] == p)
		    {
			System.out.println ("who should " + Cname [p2] + " help?");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println ("you " + Cmove1 [p2] + Cname [p1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove1 [p2] + Cname [p2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove1 [p2] + Cname [p3]);
			else
			    System.out.println ("you " + Cmove1 [p2] + Cname [p4]);
		    }
		    else
			target = 'a';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove1type [p2], Cmove1Dam [p2], target);
	    }

	    else if (select == 'b')
	    {
		if (pc > 1)
		{
		    if (CmoveT2 [p2] == N)
		    {
			System.out.println ("who should " + Cname [p2] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e3]);
			else
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT2 [p1] == p)
		    {
			System.out.println ("who should " + Cname [p2] + " help?");
			System.out.println ("a) your self");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println ("you " + Cmove2 [p1] + Cname [p1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove2 [p1] + Cname [p2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove2 [p1] + Cname [p3]);
			else
			    System.out.println ("you " + Cmove2 [p1] + Cname [p4]);
		    }
		    else
			target = 'a';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove2Type [p1], Cmove2Dam [p1], target);
	    }
	    else if (select == 'c')
	    {
		if (pc > 1)
		{
		    if (CmoveT3 [p1] == N)
		    {
			System.out.println ("who should " + Cname [p2] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e3]);
			else
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT2 [p1] == p)
		    {
			System.out.println ("who should " + Cname [p2] + " help?");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println ("you " + Cmove3 [p1] + Cname [p1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove3 [p1] + Cname [p2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove3 [p1] + Cname [p3]);
			else
			    System.out.println ("you " + Cmove3 [p1] + Cname [p4]);
		    }
		    else
			target = 'a';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove3type [p1], Cmove3Dam [p1]);
	    }
	    else
		item ();
	}
    }


    public void playerChoice2 ()
    {
	System.out.println ("it is " + Cname [p2] + " tern");
	//afraid
	if (p2statN == "afraid")
	{
	    System.out.println (Cname [p2] + " is to sacred to move");
	    p2statN = "";
	}
	else
	{
	    System.out.println ("what should " + Cname [p2] + " do");
	    System.out.println ("a) " + Cmove1 [p2]);
	    System.out.println ("b) " + Cmove2 [p2]);
	    System.out.println ("c) " + Cmove3 [p2]);
	    System.out.println ("d) item");
	    char select = IO.inputChar ("");
	    //process my choice
	    if (select == 'a')
	    {
		if (pc > 1)
		{
		    if (CmoveT1 [p2] == N)
		    {
			System.out.println ("who shound " + Cname [p2] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p2] + Cmove1 [p2] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p2] + Cmove1 [p2] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p2] + Cmove1 [p2] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p2] + Cmove1 [p2] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT1 [p2] == p)
		    {
			System.out.println ("who shound " + Cname [p2] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p2] + Cmove1 [p2] + Cname [p1]);
			else if (target == 'b')
			    System.out.println (Cname [p2] + Cmove1 [p2] + Cname [p2]);
			else if (target == 'c')
			    System.out.println (Cname [p2] + Cmove1 [p2] + Cname [p3]);
			else
			    System.out.println (Cname [p2] + Cmove1 [p2] + Cname [p4]);
		    }
		    else
			target = 'b';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove1type [p2], Cmove1Dam [p2], target);
	    }

	    else if (select == 'b')
	    {
		if (pc > 1)
		{
		    if (CmoveT2 [p2] == N)
		    {
			System.out.println ("who shound " + Cname [p2] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT2 [p2] == p)
		    {
			System.out.println ("who shound " + Cname [p2] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p2] + Cmove2 [p2] + Cname [p1]);
			else if (target == 'b')
			    System.out.println (Cname [p2] + Cmove2 [p2] + Cname [p2]);
			else if (target == 'c')
			    System.out.println (Cname [p2] + Cmove2 [p2] + Cname [p3]);
			else
			    System.out.println (Cname [p2] + Cmove2 [p2] + Cname [p4]);
		    }
		    else
			target = 'b';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove2Type [p2], Cmove2Dam [p2], target);
	    }

	    else if (select == 'c')
	    {
		if (pc > 1)
		{
		    if (CmoveT3 [p2] == N)
		    {
			System.out.println ("who shound " + Cname [p2] + " atack?");
			System.out.println ("a)" + e1);
			System.out.println ("b)" + e2);
			if (pc >= 3)
			    System.out.println ("c)" + e3);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT2 [p2] == p)
		    {
			System.out.println ("who shound " + Cname [p2] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p2] + Cmove3 [p2] + Cname [p1]);
			else if (target == 'b')
			    System.out.println (Cname [p2] + Cmove3 [p2] + Cname [p2]);
			else if (target == 'c')
			    System.out.println (Cname [p2] + Cmove3 [p2] + Cname [p3]);
			else
			    System.out.println (Cname [p2] + Cmove3 [p2] + Cname [p4]);
		    }
		    else
			target = 'b';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove3type [p2], Cmove3Dam [p2]);
	    }


	    else
		item ();
	}
    }


    public void playerChoice3 ()
    {
	System.out.println ("it is " + Cname [p3] + " tern");
	//afraid
	if (p3statN == "afraid")
	{
	    System.out.println (Cname [p3] + " is to sacred to move");
	    p3statN = "";
	}
	else
	{
	    System.out.println ("what should " + Cname [p3] + " do");
	    System.out.println ("a) " + Cmove1 [p3]);
	    System.out.println ("b) " + Cmove2 [p3]);
	    System.out.println ("c) " + Cmove3 [p3]);
	    System.out.println ("d) item");
	    char select = IO.inputChar ("");
	    //process my choice
	    if (select == 'a')
	    {
		if (pc > 1)
		{
		    if (CmoveT1 [p3] == N)
		    {
			System.out.println ("who shound " + Cname [p3] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p3] + Cmove1 [p3] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p3] + Cmove1 [p3] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p3] + Cmove1 [p3] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p3] + Cmove1 [p3] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT1 [p3] == p)
		    {
			System.out.println ("who shound " + Cname [p3] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p3]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p3] + Cmove1 [p3] + Cname [p1]);
			else if (target == 'b')
			    System.out.println (Cname [p3] + Cmove1 [p3] + Cname [p2]);
			else if (target == 'c')
			    System.out.println (Cname [p3] + Cmove1 [p3] + Cname [p3]);
			else
			    System.out.println (Cname [p3] + Cmove1 [p3] + Cname [p4]);
		    }
		    else
			target = 'c';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove1type [p3], Cmove1Dam [p3], target);
	    }

	    else if (select == 'b')
	    {
		if (pc > 1)
		{
		    if (CmoveT2 [p3] == N)
		    {
			System.out.println ("who shound " + Cname [p3] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT2 [p1] == p)
		    {
			System.out.println ("who shound " + Cname [p3] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p3]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p3] + Cmove2 [p3] + Cname [p1]);
			else if (target == 'b')
			    System.out.println (Cname [p3] + Cmove2 [p3] + Cname [p2]);
			else if (target == 'c')
			    System.out.println (Cname [p3] + Cmove2 [p3] + Cname [p3]);
			else
			    System.out.println (Cname [p3] + Cmove2 [p3] + Cname [p4]);
		    }
		    else
			target = 'c';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove2Type [p3], Cmove2Dam [p3], target);
	    }

	    else if (select == 'c')
	    {
		if (pc > 1)
		{
		    if (CmoveT3 [p3] == N)
		    {
			System.out.println ("who shound " + Cname [p3] + " atack?");
			System.out.println ("a)" + e1);
			System.out.println ("b)" + e2);
			if (pc >= 3)
			    System.out.println ("c)" + e3);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT2 [p1] == p)
		    {
			System.out.println ("who shound " + Cname [p3] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p3]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p3] + Cmove3 [p3] + Cname [p1]);
			else if (target == 'b')
			    System.out.println (Cname [p3] + Cmove3 [p3] + Cname [p2]);
			else if (target == 'c')
			    System.out.println (Cname [p3] + Cmove3 [p3] + Cname [p3]);
			else
			    System.out.println (Cname [p3] + Cmove3 [p3] + Cname [p4]);
		    }
		    else
			target = 'c';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove3type [p3], Cmove3Dam [p3]);
	    }


	    else
		item ();
	}
    }


    public void playerChoice4 ()
    {
	System.out.println ("it is " + Cname [p4] + " tern");
	//afraid
	if (p4statN == "afraid")
	{
	    System.out.println (Cname [p4] + " is to sacred to move");
	    p4statN = "";
	}
	else
	{
	    System.out.println ("what should " + Cname [p4] + " do");
	    System.out.println ("a) " + Cmove1 [p4]);
	    System.out.println ("b) " + Cmove2 [p4]);
	    System.out.println ("c) " + Cmove3 [p4]);
	    System.out.println ("d) item");
	    char select = IO.inputChar ("");
	    //process my choice
	    if (select == 'a')
	    {
		if (pc > 1)
		{
		    if (CmoveT1 [p4] == N)
		    {
			System.out.println ("who shound " + Cname [p4] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p4] + Cmove1 [p4] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p4] + Cmove1 [p4] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p4] + Cmove1 [p4] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p4] + Cmove1 [p4] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT1 [p4] == p)
		    {
			System.out.println ("who shound " + Cname [p3] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p4] + Cmove1 [p4] + Cname [p1]);
			else if (target == 'b')
			    System.out.println (Cname [p4] + Cmove1 [p4] + Cname [p2]);
			else if (target == 'c')
			    System.out.println (Cname [p4] + Cmove1 [p4] + Cname [p3]);
			else
			    System.out.println (Cname [p4] + Cmove1 [p4] + Cname [p4]);
		    }
		    else
			target = 'd';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove1type [p4], Cmove1Dam [p4], target);
	    }

	    else if (select == 'b')
	    {
		if (pc > 1)
		{
		    if (CmoveT2 [p4] == N)
		    {
			System.out.println ("who shound " + Cname [p4] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT2 [p1] == p)
		    {
			System.out.println ("who shound " + Cname [p4] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p4] + Cmove2 [p4] + Cname [p1]);
			else if (target == 'b')
			    System.out.println (Cname [p4] + Cmove2 [p4] + Cname [p2]);
			else if (target == 'c')
			    System.out.println (Cname [p4] + Cmove2 [p4] + Cname [p3]);
			else
			    System.out.println (Cname [p4] + Cmove2 [p4] + Cname [p4]);
		    }
		    else
			target = 'd';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove2Type [p4], Cmove2Dam [p4], target);
	    }

	    else if (select == 'c')
	    {
		if (pc > 1)
		{
		    if (CmoveT3 [p4] == N)
		    {
			System.out.println ("who shound " + Cname [p4] + " atack?");
			System.out.println ("a)" + e1);
			System.out.println ("b)" + e2);
			if (pc >= 3)
			    System.out.println ("c)" + e3);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e4]);
		    }
		    else if (CmoveT2 [p1] == p)
		    {
			System.out.println ("who shound " + Cname [p4] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ();
			if (target == 'a')
			    System.out.println (Cname [p4] + Cmove3 [p4] + Cname [p1]);
			else if (target == 'b')
			    System.out.println (Cname [p4] + Cmove3 [p4] + Cname [p2]);
			else if (target == 'c')
			    System.out.println (Cname [p4] + Cmove3 [p4] + Cname [p3]);
			else
			    System.out.println (Cname [p4] + Cmove3 [p4] + Cname [p4]);
		    }
		    else
			target = 'd';
		}
		else
		{
		    target = 'a';
		}
		processPlayerChoice (Cmove3type [p4], Cmove3Dam [p3]);
	    }


	    else
		item ();
	}
    }


    public void item ()
    {
	System.out.println (" what item do you use");
	if (treat < 0)
	    System.out.println ("a) treat (heal 5 hp) " + treat + " in bag");
	if (big_treat < 0)
	    System.out.println ("b) Big treat (heal 10 hp) " + big_treat + " in bag");
	if (rusty_knife < 0)
	    System.out.println ("c) Rusty kife (deal 10 damage and poison " + rusty_knife + " in bag");
	if (air_horn < 0)
	    System.out.println ("d) air horn (end battle) " + air_horn + " in bag");
	char i = IO.inputChar ("");
	if (i == 'a' && treat < 0)
	{
	    System.out.println ("who do you give it to you");
	    System.out.println ("a) you");
	    if (pc >= 2)
		System.out.println ("b)" + Cname [p2]);
	    if (pc >= 3)
		System.out.println ("c) " + Cname [p3]);
	    if (pc >= 4)
		System.out.println ("d) " + Cname [p4]);
	    char target = IO.inputChar ();
	    if (target == 'a')
	    {
		System.out.println ("you eat the treat and heal 5 hp");
		p1hp += 5;
	    }
	    else if (target == 'b')
	    {
		System.out.println (Cname [p2] + " eat the treat and heal 5 hp");
		p2hp += 5;
	    }
	    else if (target == 'c')
	    {
		System.out.println (Cname [p3] + " eat the treat and heal 5 hp");
		p3hp += 5;
	    }
	    else if (target == 'd')
	    {
		System.out.println (Cname [p4] + " eat the treat and heal 5 hp");
		p4hp += 5;
	    }
	    treat--;
	}
	else if (i == 'b' && big_treat < 0)
	{
	    System.out.println ("who do you give it to you");
	    System.out.println ("a) you");
	    if (pc >= 2)
		System.out.println ("b)" + Cname [p2]);
	    if (pc >= 3)
		System.out.println ("c) " + Cname [p3]);
	    if (pc >= 4)
		System.out.println ("d) " + Cname [p4]);
	    char target = IO.inputChar ();
	    if (target == 'a')
	    {
		System.out.println ("you eat the big treat and heal 10 hp");
		p1hp += 10;
	    }
	    else if (target == 'b')
	    {
		System.out.println (Cname [p2] + " eat the treat and heal 10 hp");
		p2hp += 10;
	    }
	    else if (target == 'c')
	    {
		System.out.println (Cname [p3] + " eat the treat and heal 10 hp");
		p3hp += 10;
	    }
	    else if (target == 'd')
	    {
		System.out.println (Cname [p4] + " eat the treat and heal 10 hp");
		p4hp += 10;
	    }
	    big_treat--;
	}


	else if (i == 'c' && rusty_knife < 0)
	{
	    System.out.println ("atack who");
	    System.out.println ("a) " + Cname [e1]);
	    if (pc >= 2)
		System.out.println ("b)" + Cname [e2]);
	    if (pc >= 3)
		System.out.println ("c) " + Cname [e3]);
	    if (pc >= 4)
		System.out.println ("d) " + Cname [e4]);
	    char target = IO.inputChar ();
	    if (target == 'a')
	    {
		System.out.println ("you stab " + e1 + " with the kife " + e1 + " takes 10 damage and is poisoned");
		e1hp -= 10;
		e1statN = "poison";
	    }
	    else if (target == 'b')
	    {
		e2hp -= 10;
		e2statN = "poison";
	    }
	    else if (target == 'c')
	    {
		e3hp -= 10;
		e3statN = "poison";
	    }
	    else if (target == 'd')
	    {
		e4hp -= 10;
		e4statN = "poison";
	    }
	    rusty_knife--;
	}

	else if (i == 'd' && air_horn < 0)
	{
	    System.out.println ("you blow the air horn");
	    e1hp = 0;
	    e2hp = 0;
	    e3hp = 0;
	    e4hp = 0;
	}
    }


    public void processPlayerChoice (String pickedtype, int pickedDam, char target)
    { //your choice of action id applied
	if (pickedtype.equals ("damage"))
	{
	    if (target == 'a' && e1statP != "hide")
	    {
		System.out.println ("enmay " + Cname [e1] + " takes " + pickedDam + " damage");
		e1hp -= pickedDam;
	    }
	    else if (target == 'b' && e2statP != "hide")
	    {
		System.out.println ("enmay " + Cname [e2] + " takes " + pickedDam + " damage");
		e2hp -= pickedDam;
	    }
	    else if (target == 'c'&& e3statP != "hide")
	    {
		System.out.println ("enmay " + Cname [e3] + " takes " + pickedDam + " damage");
		e3hp -= pickedDam;
	    }
	    else if (target == 'd'&& e4statP != "hide")
	    {
		System.out.println ("enmay " + Cname [e4] + " takes " + pickedDam + " damage");
		e3hp -= pickedDam;
	    }
	    else
	    System.out.println ("but it doesn't hit them");
	}
	else if (pickedtype.equals ("hide"))
	{
	    if (target == 'a')
	    {
		System.out.println ("until you next turn you can not be hit");
		p1statP = "hide";
	    }
	    else if (target == 'b')
	    {
		System.out.println ("until " + Cname [p2] + "'s next turn they can not be hit");
		p2statP = "hide";
	    }
	    else if (target == 'c')
	    {
		System.out.println ("until " + Cname [p3] + "'s next turn they can not be hit");
		p3statP = "hide";
	    }
	    else
	    {
		System.out.println ("until " + Cname [p4] + "'s next turn they can not be hit");
		p4statP = "hide";
	    }
	}
	else if (pickedtype.equals ("afraid"))
	{
	    if (target == 'a'&& e1statP != "hide")
	    {
		System.out.println ("it sacres " + "enmay " + Cname [e1] + " strat");
		e1statN = "afraid";
	    }
	    else if (target == 'b'&& e2statP != "hide")
	    {
		System.out.println ("it sacres " + "enmay " + Cname [e2] + " strat");
		e2statN = "afraid";
	    }
	    else if (target == 'c'&& e3statP != "hide")
	    {
		System.out.println ("it sacres " + "enmay " + Cname [e3] + " strat");
		e3statN = "afraid";
	    }
	    else if(target == 'd'&& e4statP != "hide")
	    {
		System.out.println ("it sacres " + "enmay " + Cname [e4] + " strat");
		e4statN = "afraid";
	    }
	    else
	    System.out.println ("it can't scare them"); 
	}
	else if (pickedtype.equals ("heal"))
	{
	    if (target == 'a')
	    {
		System.out.println ("you heal " + pickedDam);
		p1hp += pickedDam;
	    }
	    else if (target == 'b')
	    {
		System.out.println (Cname [p2] + " heals " + pickedDam);
		p2hp += pickedDam;
	    }
	    else if (target == 'c')
	    {
		System.out.println (Cname [p3] + " heals " + pickedDam);
		p3hp += pickedDam;
	    }
	    else
	    {
		System.out.println (Cname [p4] " heals " + pickedDam);
		p4hp += pickedDam;
	    }
	    else if (pickedtype.equals ("cast"))
	    {
		int c = (int) Math.random () * 4;
		if (c == 1)
		{
		    if (target == 'a'&& e1statP != "hide")
		    {
			System.out.println ("enmay " + Cname [e1] + " is greatly hurt by the attack");
			e1hp -= (pickedDam + buffE1 - debuffE1);
		    }
		    else if (target == 'b'&& e2statP != "hide")
		    {
			System.out.println ("enmay " + Cname [e2] + " is greatly hurt by the attack");
			e2hp -= (pickedDam + buffE1 - debuffE1);
		    }
		    if (target == 'c'&& e3statP != "hide")
		    {
			System.out.println ("enmay " + Cname [e3] + " is greatly hurt by the attack");
			e3hp -= (pickedDam + buffE1 - debuffE1);
		    }
		    else (target=='d'&& e4statP != "hide")
		    {
			System.out.println ("enmay " + Cname [e4] + " is greatly hurt by the attack");
			e4hp -= (pickedDam + buffE1 - debuffE1);
		    }
		   else 
		   System.out.println ("in cant target them"); 
		}
		else
		    System.out.println ("but nothing happened");
	    }
	    else if (pickedtype.equals ("poison"))
	    {
		if (target == 'a'&& e1statP != "hide")
		{
		    System.out.println ("it hits enmay " + Cname [e1] + " and " + "enmay " + Cname [e1] + " is poisoned");
		    e1statN = "poison";
		    e1hp -= (pickedDam + buffE);
		    poisontimerE1 = 3;
		}
		else if (target == 'b'&& e2statP != "hide")
		{
		    System.out.println ("it hits enmay " + Cname [e2] + " and " + "enmay " + Cname [e2] + " is poisoned");
		    e2statN = "poison";
		    e2hp -= (pickedDam + buffE);
		    poisontimerE2 = 3;
		}
		else if (target == 'c'&& e3statP != "hide")
		{
		    System.out.println ("it hits enmay " + Cname [e3] + " and " + "enmay " + Cname [e3] + " is poisoned");
		    e3statN = "poison";
		    e3hp -= (pickedDam + buffE);
		    poisontimerE3 = 3;
		}
		else if (target == 'd'&& e4statP != "hide")
		{
		    System.out.println ("it hits enmay " + Cname [e4] + " and " + "enmay " + Cname [e4] + " is poisoned");
		    e4statN = "poison";
		    e4hp -= (pickedDam + buffE);
		    poisontimerE4 = 3;
		}
		else 
		System.out.println ("but it cant poison them");
	    }
	    else if (pickedtype.equals ("buff"))
	    {
	    System.out.println ("it buffs your party");
		bufftimerP = 3;
		buffP = 3;
	    }


	    else if (pickedtype.equals ("debuff"))
	    {
		p1statN = "debuff";
		p2statN = "debuff";
		p3statN = "debuff";
		p4statN = "debuff";
		debufftimerE = 3;
		debuffE = 3;
	    }


	    if (e1statP == "hide")
		e1statP = "";
	    if (p1statN == "poison")
	    {
		if (poisontimerP < 0)
		{
		    p1hp -= 3;
		    poisontimerP--;
		}
		else
		    p1statN = "";
	    }


	    if (buffP>0)
	    {
		if (bufftimerP < 0)
		    bufftimerP--;
		else
		    p1statP = "";
	    }


	    if (e1statN == "debuff")
	    {
		if (debufftimerE < 0)
		    debufftimerE--;
		else
		    e1statN = "";
	    }
	}
    }


    public void EnemyChoice (int en, String enstatN)
    {
	if (enstatN == "afraid")
	{
	    System.out.println (Cname [en] + " is to sacred to move");
	    enstatN = "";
	}


	else
	{
	    int Eselect = (int) (Math.random () * 3);
	    if (Eselect == 1)
	    {
		if (pc > 1)
		{
		    boolean cm = false;
		    if (CmoveT1 [en] == N)
		    {

			while (cm == false)
			{
			    int targetE = Math.random () * 4;
			    if (targetE == 1)
			    {
				System.out.println (Cname [en] + Cmove1 [en] + "'s you");
				cm = true;
			    }
			    else if (targetE == 2)
			    {
				System.out.println (Cname [en] + Cmove1 [en] + "'s " + Cname [p2]);
				cm = true;
			    }
			    else if (targetE == 3 && pc >= 3)
			    {
				System.out.println (Cname [en] + Cmove1 [en] + "'s " + Cname [p3]);
				cm = true;
			    }
			    else if (targetE == 3 && pc >= 4)
				System.out.println (Cname [en] + Cmove1 [en] + "'s " + Cname [p4]);
			}
			cm = false;
		    }
		    else if (CmoveT1 [en] == p)
		    {
			while (cm == false)
			{
			    int targetE = Math.random () * 4;
			    if (targetE == 1)
			    {
				System.out.println (Cname [en] + Cmove1 [en] + Cname [e1]);
				cm = true;
			    }
			    else if (targetE == 2)
			    {
				System.out.println (Cname [en] + Cmove1 [en] + Cname [e2]);
				cm = true;
			    }
			    else if (targetE == 3 && pc >= 3)
			    {
				System.out.println (Cname [en] + Cmove1 [en] + Cname [e3]);
				cm = true;
			    }
			    else if (targetE == 4 && pc >= 4)
			    {
				System.out.println (Cname [en] + Cmove1 [en] + Cname [e4]);
				cm = true;
			    }
			}
			cm = false;
		    }
		    else
		    {
			if (en == e1)
			    target = 1;
			else if (en == e2)
			    target = 2;
			else if (en == e3)
			    target = 3;
			else
			    target = 4;
		    }
		    else
		    {
			target = 'a';
			System.out.println (e1 + Cmove1 [e1] + "'s you");
		    }
		    processEnemyChoice (Cmove1type [en], Cmove1Dam [en], tatgetE);
		}
	    }
	    else if (Eselect == 2)
	    {
		if (pc > 1)
		{
		    boolean cm = false;
		    if (CmoveT2 [en] == N)
		    {

			while (cm == false)
			{
			    int targetE = Math.random () * 4;
			    if (targetE == 1)
			    {
				System.out.println (Cname [en] + Cmove2 [en] + "'s you");
				cm = true;
			    }
			    else if (targetE == 2)
			    {
				System.out.println (Cname [en] + Cmove2 [en] + "'s " + Cname [p2]);
				cm = true;
			    }
			    else if (targetE == 3 && pc >= 3)
			    {
				System.out.println (Cname [en] + Cmove2 [en] + "'s " + Cname [p3]);
				cm = true;
			    }
			    else if (targetE == 3 && pc >= 4)
				System.out.println (Cname [en] + Cmove2 [en] + "'s " + Cname [p4]);
			}
			cm = false;
		    }
		    else if (CmoveT2 [en] == p)
		    {
			while (cm == false)
			{
			    int targetE = Math.random () * 4;
			    if (targetE == 1)
			    {
				System.out.println (Cname [en] + Cmove2 [en] + Cname [e1]);
				cm = true;
			    }
			    else if (targetE == 2)
			    {
				System.out.println (Cname [en] + Cmove2 [en] + Cname [e2]);
				cm = true;
			    }
			    else if (targetE == 3 && pc >= 3)
			    {
				System.out.println (Cname [en] + Cmove2 [en] + Cname [e3]);
				cm = true;
			    }
			    else if (targetE == 4 && pc >= 4)
			    {
				System.out.println (Cname [en] + Cmove2 [en] + Cname [e4]);
				cm = true;
			    }
			}
			cm = false;
		    }
		    if (en == e1)
			target = 1;
		    else if (en == e2)
			target = 2;
		    else if (en == e3)
			target = 3;
		    else
			target = 4;
		}
		else
		{
		    target = 'a';
		    System.out.println (Cname [en] + Cmove2 [en] + "'s you");
		}
		processEnemyChoice (Cmove2Type [en], Cmove2Dam [en], tatgetE);
	    }
	    else if (Eselect == 3)
	    {
		if (pc > 1)
		{
		    boolean cm = false;
		    if (CmoveT3 [en] == N)
		    {

			while (cm == false)
			{
			    int targetE = Math.random () * 4;
			    if (targetE == 1)
			    {
				System.out.println (Cname [en] + Cmove3 [en] + "'s you");
				cm = true;
			    }
			    else if (targetE == 2)
			    {
				System.out.println (Cname [en] + Cmove3 [en] + "'s " + Cname [p2]);
				cm = true;
			    }
			    else if (targetE == 3 && pc >= 3)
			    {
				System.out.println (Cname [en] + Cmove3 [en] + "'s " + Cname [p3]);
				cm = true;
			    }
			    else if (targetE == 3 && pc >= 4)
				System.out.println (Cname [en] + Cmove3 [en] + "'s " + Cname [p4]);
			}
			cm = false;
		    }
		    else if (CmoveT3 [en] == p)
		    {
			while (cm == false)
			{
			    int targetE = Math.random () * 4;
			    if (targetE == 1)
			    {
				System.out.println (Cname [en] + Cmove3 [en] + Cname [e1]);
				cm = true;
			    }
			    else if (targetE == 2)
			    {
				System.out.println (Cname [en] + Cmove3 [en] + Cname [e2]);
				cm = true;
			    }
			    else if (targetE == 3 && pc >= 3)
			    {
				System.out.println (Cname [en] + Cmove3 [en] + Cname [e3]);
				cm = true;
			    }
			    else if (targetE == 4 && pc >= 4)
			    {
				System.out.println (Cname [en] + Cmove3 [en] + Cname [e4]);
				cm = true;
			    }
			}
			cm = false;
		    }
		    if (en == e1)
			target = 1;
		    else if (en == e2)
			target = 2;
		    else if (en == e3)
			target = 3;
		    else
			target = 4;
		}
		else
		{
		    target = 'a';
		    System.out.println (Cname [en] + Cmove2 [en] + "'s you");
		}
		processEnemyChoice (Cmove2Type [en], Cmove2Dam [en], tatgetE);
	    }
	}
    }
}



public void processEnemyChoice (String pickedtype, int pickedDam, tatgetE)
{ //Enemy choice of action id applied
    if (pickedtype.equals ("damage"))
    {
	if (tatgetE == 1 && p1statP != "hide")
	{
	    System.out.println ("you take " + (pickedDam + buffE1 - debuffE1) + " hp.");
	    p1hp -= (pickedDam + buffE1 - debuffE1);
	}
	else if (tatgetE == 2)
	{
	    System.out.println (Cname [p2] + " takes " + (pickedDam + buffE1 - debuffE1) + " hp.");
	    p2hp -= (pickedDam + buffE1 - debuffE1);
	}
	else if (tatgetE == 3)
	{
	    System.out.println (Cname [p3] + " takes " + (pickedDam + buffE1 - debuffE1) + " hp.");
	    p3hp -= (pickedDam + buffE1 - debuffE1);
	}
	else if (tatgetE == 4)
	{
	    System.out.println (Cname [p4] + " takes " + (pickedDam + buffE1 - debuffE1) + " hp.");
	    p4hp -= (pickedDam + buffE1 - debuffE1);
	}
	else
	    System.out.println ("but it dosent hit");
    }


    else if (pickedtype.equals ("hide"))
    {
	System.out.println ("until " + e1 + "'s next turn it can not be hit");
	e1statP = "hide";
    }


    else if (pickedtype.equals ("afraid"))
    {
	System.out.println (e1 + " scare's you strat");
	p1statN = "afraid";
    }


    else if (pickedtype.equals ("afraid") && p1statP.equals ("hide"))
	System.out.println ("but " + e1 + " is unable to scare you");
    else if (pickedtype.equals ("heal"))
    {
	e1hp += (pickedDam + buffE1 - debuffE1);

    }


    else if (pickedtype.equals ("cast"))
    {
	int c = (int) Math.random () * 4;
	if (c == 1)
	{
	    System.out.println ("you are greatly hurt by " + e1 + "'s attack");
	    p1hp -= (pickedDam + buffE1 - debuffE1);
	}
	else
	    System.out.println ("but nothing happened");
    }


    else if (pickedtype.equals ("cast") && p1statP.equals ("hide"))
	System.out.println ("but " + e1 + " cold not hit its targent");
    else if (pickedtype.equals ("poison"))
    {
	System.out.println (" hits you and you are poisoned");
	p1statN = "poison";
	p1hp -= (pickedDam + buffE);

	poisontimerE = 3;
    }


    else if (pickedtype.equals ("poison") && p1statP.equals ("hide"))
	System.out.println ("but " + e1 + " can not poison you");
    else if (pickedtype.equals ("buff"))
    {
	e1statP = "buff";
	bufftimerE = 3;
	buffE = 3;
    }


    else if (pickedtype.equals ("debuff"))
    {
	p1statN = "debuff";
	debufftimerE = 3;
	debuffE = 3;
    }


    if (p1statP == "hide")
	p1statP = "";
    if (e1statN == "poison")
    {
	if (poisontimerE < 0)
	{
	    e1hp -= 3;
	    poisontimerE--;
	}
	else
	    e1statN = "";
    }


    if (e1statN == "buff")
    {
	if (bufftimerE < 0)
	    bufftimerE--;
	else
	    e1statP = "";
    }


    if (e1statN == "debuff")
    {
	if (debufftimerE < 0)
	    debufftimerE--;
	else
	    e1statN = "";
    }
}


public void encounter ()
{
}


public void shop ()
{
    System.out.println ("a fredndly crow greats you");
    System.out.println ("                                                     .:%@%##@@-.+%@@@=.                             ");
    System.out.println ("                                                    .%%#*###%@%#####%@@%%%*..                       ");
    System.out.println ("                                                    -@######%######%%%%@%##@:            .          ");
    System.out.println ("                                                    =@@%####%#####%%%%%%##%%@.          ..          ");
    System.out.println ("                                                  .*@%%%%@@@@%%%%#%%%%%##%%%@-         ...          ");
    System.out.println ("                                                  .#@@@@%%%%%@@@@@@@@@%%%%%%@-           .          ");
    System.out.println ("                                                  .=%@@@@@@@@@@@@@@@@@@@%%%%@*            ...       ");
    System.out.println ("                                                  .@@%@@@@@@@@@@@@@@@@@%#%%%%@-.            ...     ");
    System.out.println ("                                                  :@@%##@@%@@@@@@%#@@@@##%%%%%@@@@@@@%#=:.          ");
    System.out.println ("             .::.                                .@@@@%#*####%@@%##@@@@##%%%%%%%*****###@@-.        ");
    System.out.println ("            +@%@@+.                            ..:#@@*+*#**###%##%#@@@%###%@%%%%%++***####@@.       ");
    System.out.println ("           .@%%%%@@:                         :@@@@@%++****####%%#%@@@@%###%%%%%%%#++****##%@@.      ");
    System.out.println ("           -@%%%%%@@:                     ..:@@@@%%+**%*#@%###%@@@@@@@%###%%##%@#%%+**###%%#@@.     ");
    System.out.println ("          :@%%%%%%%@@:    .:.  .::. .-%@@@@@@@@%#%#**%%@####@%@@@@@@@@%###%%####%#%@**###%%#%@=     ");
    System.out.println ("          .+@%%%%%%%@@:  .%%%@@%#@+@@@%%%@@@@@@%#@#*#%#*#%@%%%%@@%%%%%%###%%####%###%#####%#%@#     ");
    System.out.println ("          .%@%%%%@@@@@@. .@#=*%+=@@%%%@@@@@%%%@#%@#%#%%%%%%@%%%%%%@@@%@@%%@%####%%%%######@#%%@.    ");
    System.out.println ("          *@%%%%@%##%%%@: +@*+=+##*%@@@@@@@%%@%%@@@@%%%%%@%%###@@@@%@@@@@@#*%%#%%########%%#%%@-    ");
    System.out.println ("         -@%%%%@%####%%%@=%#*##*#%%%@%%@*#%%%%@@@@%%@@@@%####%@@@%%@@@@@@@%*****#########%##%%@+    ");
    System.out.println ("        .%@%%%@@#####%%%%@=..-@#%%%@%%%@#@%%@@@@@%%@@@@@@%#%@@@%%%@@@@@@@@@*******######@##%%%@*    ");
    System.out.println ("        =@%%@%@@###%#%%%%%@*=@%%%@%%%%%%%%@%#%%%@@@@%@@@%@@@@@%%@@%@%%%%%@@*+*****#####%##%%%%@#    ");
    System.out.println ("       :@%@@@@%@@@%@%%%#%%%%%%%%%%%%%%%%%%@@%##%%@@%%@%@@@@@@%@@@%#%%%@%%@@#+*****####%%#%%%%%@#.   ");
    System.out.println ("       *@###%##@%%%%%%@%%%%%%%%%%%%@%@%%%%@%%%@@@@@%%@@@@@@@@@@@@%#%#%@#%@@#+*##*#####%#%%%%%%@%.   ");
    System.out.println ("      -@####%##%%#%%%%%@%%%%%@@%%%%%%%%@@@@@@%@@@%%%@@@@@@@@@@@@@%#%#%@##@%#+#**#####%%#%%%%%%@%.   ");
    System.out.println ("     .@%####%##%@%##%%%%%%%%%%%%@%%%%@@%%@@%%%@@@@@@@@%%@@@@@@@@@%#%#%@##@%#+*###*####@%##%%%%%@.   ");
    System.out.println ("     +@#####%##%@%@@%%%%%%@%%%@@@@%%%%%%%%@@@@@@#%@@%@%%%%%@%%@@@##%#%@##@%#+*****###%@@@@%%%@+@:   ");
    System.out.println ("   .-@%#####%##%%%##%%@%@%%%%%%#%@%%@%@%#*@%%%@%#%%%%%@@@%@@@@%%%#%%#%%#%@%#+***#*####%@..:#@@@#.   ");
    System.out.println ("   .%%%####%###%%@%#%%%%@%##%@%%%@@@@#%%*+#%%%@%#%%%%#@@@@%@%%%%##@%#%%#%@%%%@@@@@#####@*           ");
    System.out.println ("   +@#%####@###%##@#%%##%%%##%%#%%%%@*+%@@@@%@@###%%%#%%%%%%%%%%%%@%#@@%@%%%%@@@@%%####%@.          ");
    System.out.println ("  .@%#@###%%###%##@%##%*%@@%#%%**@%%@##%@%@%%@%##%%%%#%%%%%%@##%@%%@%@@@%@@%%%%%%%%####%@.          ");
    System.out.println ("  ..-*@%#%%@%#%%#%@@%@#*++*%%%%%#@%%@*==@%%@%@%###%%%##%%##%@##%%%%%%%%@%@@%#%%%%%%####%@.          ");
    System.out.println ("     :@%%%%%%@%@%%%@@#####%+*%%%#@%%%%*#%%%@%@%#%##%%##%%##%%##%@%%%%%%@%%%#%%%%%%%####%@.          ");
    System.out.println ("     .#@#%%%%%%##%%%@@*+++++@%%@%%%%%%%%%%@@%@%###%%%#%%@###%%#@@%%@%%%@%@%#%%%%%%%####%@.          ");
    System.out.println ("      .@%#%%%%@##%%%@%%%##%%%%%@%%%@%%%%@@%%%@%###%@%#%%@%##%@%@@%%@%%%%@@##%%%%%@#####%@.   .      ");
    System.out.println ("       *@##%%%@%##%%%%%%%%%%%%%@%%@@@@@#@%%%%%%###%@%##%%@%#%%@%@%%@%%@@#+%%##%%%#####%@:    ...    ");
    System.out.println ("       :@%##%%%%##%%%@%%%%@%%%%@@@+....#@%%%%%%###%@@%#@%%%@@@%%@@@@@@@@@@*+#%%%#***#@%:.   ..      ");
    System.out.println ("        +@##%%%@##%%%%%%%%%%#%%@=   .=@@%%%%%%%###%@%@@@%%%%%@%%@@@@@%%%%%@%*+++***%@+..            ");
    System.out.println ("        .%%##%%@##%%%%@%%%%%##%@+  .#@###@**@@@%##%%%%%@%%%%%%@%@@%%%%%%%%@%+**+*#@#....  ..        ");
    System.out.println ("        .*@###%%%##%%%@%#%%%%#%@:  .@%###%@@%#%@@@%%%%%@%%%%%%@%@@@%##%%%%@@#**#@%:                 ");
    System.out.println ("         :@%##%%###%%%%%##%%@%@=   -@@%#%#**%%%%%%%%%%%%@%%%%%@%@@#%%##%%%%%%@@#:....               ");
    System.out.println ("          #%###%%##%%%%@##%%@@:.   %@##%#+***%##@%%%%%%%%@%%%%%@@@#+*%@%@###%%%@@=....              ");
    System.out.println ("          =@###%%###%%%@%#%%@-    .@@%##*+****#@@@%#%%%%%@%%%%%@@@%++*****##@%%%%%@@+..             ");
    System.out.println ("          :@%##%@####%%@%#%%@:     #%%@++++****%%%@%#%%%%%@%%%%@@@@++++++++*@%%%%%%%%@@%:.          ");
    System.out.println ("          .@%##%@%####%%%#%@:.     .+@@%++++++%%%%%@%#%%%%@%%%%@@%@@@@@@@@@%%@@%%%%%%%%%%@@#.       ");
    System.out.println ("          .#@#%@-#@###%%@@-.         ..%@%@%%%%%%%%%@%%%%%%%%%%@@%%@@@@@@@@@%%%@%%%%%%%%%%%%@:      ");
    System.out.println ("           +@#@+..+@%##%@%.           .=@%%@@%%%%%%%%%%%%%%@%%%@@%%%@@@@@@%%@%%%@@%%%%%%%%%%@@.     ");
    System.out.println ("           :@@:   .=@%#%%%.            .=@%%%@%%#%%%%%%@%%%%%%%@@%%%%@@@@%%%@@%%%%@%%%%%%%%%%@=     ");
    System.out.println ("            ..      -@%%@*.            .+@@%%%%@@%%%%%%%%@%%@%%@@%%%%@@@@%%%%@%%%%%@%%%%%%%%%@#..   ");
    System.out.println ("                     .++:.             .-=@#%%%%%@@%%%%%%%%@@%%@%%%%%%@@%%%%%%@%%%%%%@%%%%%%%%@. .  ");
    System.out.println ("                                          +##%@@%@@@@@@@@@%%%%@@%%%%%@@@@%%%%%%@%%%%%%@%%%%%%%@:    ");
    System.out.println ("                                          +%*##%@@@%%%%%%%%%%@@@@%%%%#@%@%%%%%%%@%%%%%%@%%%%%%@=    ");
    System.out.println ("                                          *%**#@%@@%%%%%%%%%%%%%@#*###%%%@%%%%%%@%%%%%%%@@%%%%@*.   ");
    System.out.println ("                                          #%**#@%@%%%%#%%%%%%%@%%@****#@%%%%%%%%%@%%%%%%%%@%%%@%.   ");
    System.out.println ("                                          #%***#@@##%%#%%%%%%%@%%%@*+**#@%@%%%%%%%@%%%%%%%%@@@@@.   ");
    System.out.println ("                                         .@#***%#@##%%##%%%#%%%@%%%@*+**#@%@%%%%%%%@%%%%%%%%%@@#.   ");
    System.out.println ("                                         =@***#@.@##%%##%%@##%%%%%%%@#+**#@%%%%%%%%%@%%%%%%%%@%.    ");
    System.out.println ("                                        .@#**#@*.%%#%%###%@%#%%%%#%%%@#+**#%@%%%%%%%@@%%%%%%%@+     ");
    System.out.println ("                                       .@%***#@-.+@#%@###%%%#%%%@%#%%%%%***#%@%%%%%%%@@%%%%%@@.     ");
    System.out.println ("                                      .@#****#@. .-%*@%##%%@##%%%@#%%%%%%**##@@%#%%%%@@@%%%%@:      ");
    System.out.println ("                                ..+#%%@****#*#@:...  :@%#%@#@%#%%%%#%%%%@#*##@%@%%%%%@-%@%%@+       ");
    System.out.println ("                              .*@#*+*+*****####%%%@. .:@@%: .%@%%%@%#%%%@**##@%@@%%%%@=.#@@#.       ");
    System.out.println ("                             :@@@%**#%%###########%#.  ...    :@@%@@%%%%@**##@%@@@@%%@= ....        ");
    System.out.println ("                                :@#%###**###%+*@@#@@.          ..==-*%%@%**##@%@%%%@%=.             ");
    System.out.println ("                                 .:..@*%%%@%:     :+.                 :@*####@@#%@=::               ");
    System.out.println ("                                    .@@.  .                      .#@#=@###%##%#%@.                  ");
    System.out.println ("                                     :.                        .=@*******#%#*#@*.                   ");
    System.out.println ("                                                               :@****#%%%@#***##                    ");
    System.out.println ("                                                              .@%#*##@:..+%**#@+                    ");
    System.out.println ("                                                              :#:#@@#.   .%#*@-                     ");
    System.out.println ("                                                                         .+@%*                      ");
    System.out.println ("                                                                           -%: ");
    System.out.println ("Welcome to my shop. would you like to buy");
    char shop = 'y';
    while (shop == 'y')
    {
	System.out.println ("you have " + Money + " shineineys. trade all shineineys please ");
	System.out.println ("you look in your bag. you have " + treat + " treat(s)" + big_treat + " big treat(s) " + rusty_knife + " rusty knife(s) and " + air_horn + " air horn(s)");
	System.out.println ("1.treat 10$, 2.big treat 20$,3. rusty knife 25$,4. air horn 50$");
	int SC = IO.inputInt ();
	if (SC == 1 && Money >= 10)
	{
	    Money -= 10;
	    treat++;
	    System.out.println ("lost 10 shineineys, gained a treat");
	}
	else if (SC == 2 && Money >= 20)
	{
	    Money -= 20;
	    big_treat++;
	    System.out.println ("lost 20 shineineys, gained a big treat");
	}
	else if (SC == 3 && Money >= 25)
	{
	    Money -= 25;
	    rusty_knife++;
	    System.out.println ("lost 25 shineineys, gained a rusty knife");
	}
	else if (SC == 4 && Money >= 50)
	{
	    Money -= 50;
	    air_horn++;
	    System.out.println ("lost 50 shineineys, gained a air horn");
	}
	else
	    System.out.println (" you dont have enough shineineys for that");
	shop = IO.inputChar ("continue shoping (y/n)");
    }
}
}


