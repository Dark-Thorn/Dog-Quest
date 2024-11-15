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
    String Cmove2type[] = {"hide", "cast", "afraid", "hide", "hide", "debuff"};
    int Cmove2Dam[] = {0, 20, 0, 0, 0, 3};
    String Cmove3[] = {"bark", "lick", "poison bite", "soothe", "gust", "stealth claw"};
    char Cmove3T[] = {'n', 'p', 'n', 'p', 'n', 'p'};
    String Cmove3type[] = {"afraid", "buff", "poison", "heal", "debuff", "cast"};
    int Cmove3Dam[] = {0, 0, 3, 10, 3, 20};
    //player vars
    int pc = 1;
    int p1 = 0;
    int p1hp = 50;
    String p1statP = "";
    String p1statN = "";
    int poisontimerP1 = 0;
    int bufftimerP = 0;
    int buffP = 0;
    int debufftimerP = 0;
    int debuffP = 0;
    int p2 = -1;
    int p2hp = 50;
    String p2statP = "";
    String p2statN = "";
    int poisontimerP2 = 0;
    int p3 = -1;
    int p3hp = 50;
    String p3statP = "";
    String p3statN = "";
    int poisontimerP3 = 0;
    int p4 = -1;
    int p4hp = 50;
    String p4statP = "";
    String p4statN = "";
    int poisontimerP4 = 0;
    char target = 'f';
    //enemy vars
    int e1 = -1;
    int e1hp = 0;
    String e1statP = "";
    String e1statN = "";
    int poisontimerE1 = 0;
    int bufftimerE = 0;
    int buffE = 0;
    int debufftimerE = 0;
    int debuffE = 0;
    int e2 = -1;
    int e2hp = 0;
    String e2statP = "";
    String e2statN = "";
    int poisontimerE2 = 0;
    int e3 = -1;
    int e3hp = 0;
    String e3statP = "";
    String e3statN = "";
    int poisontimerE3 = 0;
    int e4 = -1;
    int e4hp = 0;
    String e4statP = "";
    String e4statN = "";
    int poisontimerE4 = 0;
    int targetE = 0;
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
    int buff_fruit = 0;
    int heal_fruit = 0;
    int shock_fruit = 0;
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


    public void health ()
    {
	System.out.println ("you rest before moving on. all hp restord to max");
	p1hp = Chp [p1];
	p2hp = Chp [p2];
	p3hp = Chp [p3];
	p4hp = Chp [p4];
    }


    public void road ()
    { // no atomatic party meber
	System.out.println ("\tyou arive at long road");
	for (int i = 0 ; i >= 5 ; i++)
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
		if (pc > 1)
		{
		    int p = (int) (Math.random () * 8) + 1;
		    if (p <= 4)
			e2 = 0;
		    else if (p <= 7)
			e2 = 1;
		    else
			e2 = 4;
		}
		if (pc > 2)
		{
		    int o = (int) (Math.random () * 8) + 1;
		    if (o <= 4)
			e3 = 0;
		    else if (o <= 7)
			e3 = 1;
		    else
			e3 = 4;
		}
		if (pc > 3)
		{
		    int u = (int) (Math.random () * 8) + 1;
		    if (u <= 4)
			e4 = 0;
		    else if (u <= 7)
			e4 = 1;
		    else
			e4 = 4;
		}
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
		    char c = IO.inputChar ("");
		    if (c == 'a' && big_treat < 0)
		    {
			pc++;
			big_treat--;
			System.out.println ("the dog stands up, thanks you and disids to join your quest");
			if (pc == 1)
			{
			    p2 = 0;
			    p2hp = Chp [p2];
			}
			else if (pc == 2)
			{
			    p3 = 0;
			    p3hp = Chp [p3];
			}
			else if (pc == 3)
			{
			    p4 = 0;
			    p4hp = Chp [p4];
			}
			else
			    System.out.println ("your party is full");
		    }
		    else
		    {
			System.out.println ("you giltaly eat and heal 20");
			p1hp += 10;
			if (pc > 1)
			    p2hp += 10;
			if (pc > 2)
			    p3hp += 10;
			if (pc > 3)
			    p4hp += 10;
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
	health ();
    }


    public void garbage_dump ()
    {
	System.out.println ("\tyou arive at garbage dump");
	int i = (int) Math.random () * 4;
	if (i == 4)
	{
	    if (pc != 4)
	    {
		System.out.println ("a well gromed cat joins you on your quest");
		int p = (int) Math.random () * 4;
		if (p == 4)
		{
		    if (p2 == -1)
		    {
			p2 = 1;
			p2hp = Chp [p2];
		    }
		    else if (p3 == -1)
		    {
			p3 = 1;
			p3hp = Chp [p3];
		    }
		    else if (p4 == -1)
		    {
			p4 = 1;
			p4hp = Chp [p4];
		    }
		    else
			System.out.println ("but your party is full");
		}
	    }
	}
	for (i = 0 ; i >= 5 ; i++)
	{
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
		if (pc > 1)
		{
		    int p = (int) (Math.random () * 8) + 1;
		    if (p <= 4)
			e2 = 1;
		    else if (p <= 7)
			e2 = 5;
		    else
			e2 = 2;
		}
		if (pc > 2)
		{
		    int o = (int) (Math.random () * 8) + 1;
		    if (o <= 4)
			e3 = 1;
		    else if (o <= 7)
			e3 = 5;
		    else
			e3 = 2;
		}
		if (pc > 3)
		{
		    int u = (int) (Math.random () * 8) + 1;
		    if (u <= 4)
			e4 = 1;
		    else if (u <= 7)
			e4 = 5;
		    else
			e4 = 2;
		}
		battle ();
	    }
	    else if (e == 2)
		shop ();
	    else
	    {
		int a = (int) Math.random () * 2;
		if (a == 1 && re == 0)
		{
		    System.out.println ("you see somthing poking out of a garbage pile");
		    System.out.println ("do you:");
		    System.out.println ("a) try to pull it out");
		    System.out.println ("b) leave it alone");
		    char c = IO.inputChar ("");
		    if (c == 'a')
		    {
			int s = (int) Math.random () * 8;
			if (s <= 7)
			{
			    System.out.println ("you cut your self on the blade");
			    p1hp -= 3;
			}
			else
			{
			    System.out.println ("you pull out the stick excalber");
			    Cmove1 [p1] = "stab";
			    Cmove1Dam [p1] = 15;
			    ge++;
			}
		    }
		    else //genral encounter
			encounter ();
		}
	    }
	    g++;
	    play = IO.inputChar ("keep going? (y/n)");
	    health ();
	}
    }


    public void school ()
    {
	System.out.println ("\tyou arive at school");
	int i = (int) Math.random () * 4;
	if (i == 4)
	{
	    if (pc != 4)
	    {
		System.out.println ("a jolly toad joins you quest");
		int p = (int) Math.random () * 4;
		if (p == 4)
		{
		    if (p2 == -1)
		    {
			p2 = 3;
			p2hp = Chp [p2];
		    }
		    else if (p3 == -1)
		    {
			p3 = 3;
			p3hp = Chp [p3];
		    }
		    else if (p4 == -1)
		    {
			p4 = 3;
			p4hp = Chp [p4];
		    }
		    else
			System.out.println ("but your party is full");
		}
	    }
	}
	for (i = 0 ; i >= 5 ; i++)
	{
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
		if (pc > 1)
		{
		    int p = (int) (Math.random () * 8) + 1;
		    if (p <= 4)
			e2 = 3;
		    else if (p <= 7)
			e2 = 1;
		    else
			e2 = 4;
		}
		if (pc > 2)
		{
		    int o = (int) (Math.random () * 8) + 1;
		    if (o <= 4)
			e3 = 3;
		    else if (o <= 7)
			e3 = 1;
		    else
			e3 = 4;
		}
		if (pc > 3)
		{
		    int u = (int) (Math.random () * 8) + 1;
		    if (u <= 4)
			e4 = 3;
		    else if (u <= 7)
			e4 = 1;
		    else
			e4 = 4;
		}
		battle ();
	    }
	    else if (e == 2)
		shop ();
	    else
	    {
		int a = (int) Math.random () * 2;
		if (a == 1 && re == 0 && pc > 1)
		{
		    System.out.println ("a small child approaches you wanting to adopt one of your party");
		    System.out.println ("who should get adopted");
		    System.out.println ("a) " + Cname [p2]);
		    if (pc > 2)
			System.out.println ("b) " + Cname [p3]);
		    if (pc > 3)
			System.out.println ("c) " + Cname [p4]);
		    System.out.println ("d) the partys not interested");
		    char c = IO.inputChar ("");
		    if (c == 'a')
		    {
			p2 = -1;
			pc--;
			if (pc == 3)
			{
			    p2 = p3;
			    p3 = -1;
			}
			if (pc == 4)
			{
			    p3 = p4;
			    p4 = -1;
			}
		    }
		    if (c == 'b')
		    {
			p3 = -1;
			pc--;
			if (pc == 4)
			{
			    p3 = p4;
			    p4 = -1;
			}
		    }
		    if (c == 'c')
		    {
			p4 = -1;
			pc--;
		    }
		    else
			System.out.println ("the child walks sadly away");
		}
		else
		    encounter ();
	    }
	    sc++;
	    play = IO.inputChar ("keep going? (y/n) ");
	    health ();
	}
    }


    public void park ()
    {
	System.out.println ("\tyou arive at park");
	int i = (int) Math.random () * 4;
	if (i == 4)
	{
	    if (pc != 4)
	    {
		System.out.println ("a chill snake joins you quest");
		int p = (int) Math.random () * 4;
		if (p == 4)
		{
		    if (p2 == -1)
		    {
			p2 = 2;
			p2hp = Chp [p2];
		    }
		    else if (p3 == -1)
		    {
			p3 = 2;
			p3hp = Chp [p3];
		    }
		    else if (p4 == -1)
		    {
			p4 = 2;
			p4hp = Chp [p4];
		    }
		    else
			System.out.println ("but your party is full");
		}
	    }
	}
	for (i = 0 ; i >= 5 ; i++)
	{
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
		if (pc > 1)
		{
		    int p = (int) (Math.random () * 8) + 1;
		    if (p <= 4)
			e2 = 2;
		    else if (p <= 7)
			e2 = 3;
		    else
			e2 = 5;
		}
		if (pc > 2)
		{
		    int o = (int) (Math.random () * 8) + 1;
		    if (o <= 4)
			e3 = 2;
		    else if (o <= 7)
			e3 = 3;
		    else
			e3 = 5;
		}
		if (pc > 3)
		{
		    int u = (int) (Math.random () * 8) + 1;
		    if (u <= 4)
			e4 = 2;
		    else if (u <= 7)
			e4 = 3;
		    else
			e4 = 5;
		}
		battle ();
	    }
	    else if (e == 2)
		shop ();
	    else
	    {
		int h = (int) Math.random () * 4;
		if (h == 4)
		{
		    System.out.println ("you find a small wild garden. a sine nearby says take one");
		    System.out.println ("what do you take?");
		    System.out.println ("a) buff fruit");
		    System.out.println ("b) heal fruit");
		    System.out.println ("c) shock fruit");
		    char c = IO.inputChar ("");
		    if (c == 'a')
			buff_fruit = 5;
		    else if (c == 'b')
			heal_fruit = 5;
		    else
			shock_fruit = 5;
		    pe++;
		}
		else
		    encounter ();
	    }
	}


	p++;
	play = IO.inputChar ("keep going? (y/n)");
	health ();
    }


    public void sewer ()
    {
	System.out.println ("\tyou arive at sewer");
	int i = (int) Math.random () * 4;
	if (i == 4)
	{
	    if (pc != 4)
	    {
		System.out.println ("a crafty rat joins you quest");
		int p = (int) Math.random () * 4;
		if (p == 4)
		{
		    if (p2 == -1)
		    {
			p2 = 5;
			p2hp = Chp [p2];
		    }
		    else if (p3 == -1)
		    {
			p3 = 5;
			p3hp = Chp [p3];
		    }
		    else if (p4 == -1)
		    {
			p4 = 5;
			p4hp = Chp [p4];
		    }
		    else
			System.out.println ("but your party is full");
		}
	    }
	}


	for (i = 0 ; i >= 5 ; i++)
	{
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
		if (pc > 1)
		{
		    int p = (int) (Math.random () * 8) + 1;
		    if (p <= 4)
			e2 = 5;
		    else if (p <= 7)
			e2 = 2;
		    else
			e2 = 1;
		}
		if (pc > 2)
		{
		    int o = (int) (Math.random () * 8) + 1;
		    if (o <= 4)
			e3 = 5;
		    else if (o <= 7)
			e3 = 2;
		    else
			e3 = 1;
		}
		if (pc > 3)
		{
		    int u = (int) (Math.random () * 8) + 1;
		    if (u <= 4)
			e4 = 5;
		    else if (u <= 7)
			e4 = 2;
		    else
			e4 = 1;
		}
		battle ();
	    }
	    else if (e == 2)
		shop ();
	    else
	    {
		int h = (int) Math.random () * 4;
		if (h == 4)
		{
		    System.out.println ("you find an abandoned rat lab with three vials left on the table");
		    System.out.println ("which potion do you take");
		    if (p2 == 5 || p3 == 5 || p4 == 5)
		    {
			System.out.println ("a) strength potion");
			System.out.println ("b) health potion");
			System.out.println ("c) poison potion");
			System.out.println ("d) don't take any");
		    }
		    else
		    {
			System.out.println ("a) red potion");
			System.out.println ("b) green potion");
			System.out.println ("c) purple potion");
			System.out.println ("d) don't take any");
		    }
		    char p = IO.inputChar ("");
		    System.out.println ("who do you give it to");
		    System.out.println ("a) yourself");
		    if (pc > 1)
			System.out.println ("b) " + Cname [p2]);
		    if (pc > 2)
			System.out.println ("c) " + Cname [p3]);
		    if (pc > 3)
			System.out.println ("d) " + Cname [p4]);
		    char t = IO.inputChar ("");
		    if (p == 'a' && t == 'a')
		    {
			Cmove1Dam [p1] += 5;
			Cmove2Dam [p1] += 5;
			Cmove3Dam [p1] += 5;
		    }
		    else if (p == 'a' && t == 'b')
		    {
			Cmove1Dam [p2] += 5;
			Cmove2Dam [p2] += 5;
			Cmove3Dam [p2] += 5;
		    }
		    else if (p == 'a' && t == 'c')
		    {
			Cmove1Dam [p3] += 5;
			Cmove2Dam [p3] += 5;
			Cmove3Dam [p3] += 5;
		    }
		    else if (p == 'a' && t == 'd')
		    {
			Cmove1Dam [p2] += 5;
			Cmove2Dam [p2] += 5;
			Cmove3Dam [p2] += 5;
		    }
		    else if (p == 'b' && t == 'a')
		    {
			Chp [p1] += 15;
			p1hp = Chp [p1];
		    }
		    else if (p == 'b' && t == 'b')
		    {
			Chp [p2] += 15;
			p2hp = Chp [p2];
		    }
		    else if (p == 'b' && t == 'c')
		    {
			Chp [p3] += 15;
			p3hp = Chp [p3];
		    }
		    else if (p == 'b' && t == 'd')
		    {
			Chp [p4] += 15;
			p4hp = Chp [p4];
		    }
		    else if (p == 'c' && t == 'a')
		    {
			p1statN = "poison";
			p1hp -= 5;
		    }
		    else if (p == 'c' && t == 'b')
		    {
			p2statN = "poison";
			p2hp -= 5;
		    }
		    else if (p == 'c' && t == 'c')
		    {
			p3statN = "poison";
			p3hp -= 5;
		    }
		    else if (p == 'c' && t == 'd')
		    {
			p4statN = "poison";
			p4hp -= 5;
		    }
		    else
			System.out.println ("you diside its best not to risk it");
		}
		else
		    encounter ();
	    }
	}


	sw++;
	play = IO.inputChar ("keep going? (y/n)");
	health ();
    }



    public void train_tracks ()
    {
	System.out.println ("\tyou arive at train tracks");
	int i = (int) Math.random () * 4;
	if (i == 4)
	{
	    if (pc != 4)
	    {
		System.out.println ("a inventive burd joins you quest");
		int p = (int) Math.random () * 4;
		if (p == 4)
		{
		    if (p2 == -1)
		    {
			p2 = 4;
			p2hp = Chp [p2];
		    }
		    else if (p3 == -1)
		    {
			p3 = 4;
			p3hp = Chp [p3];
		    }
		    else if (p4 == -1)
		    {
			p4 = 4;
			p4hp = Chp [p4];
		    }
		    else
			System.out.println ("but your party is full");
		}
	    }
	}


	for (i = 0 ; i >= 5 ; i++)
	{
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
		if (pc > 1)
		{
		    int p = (int) (Math.random () * 8) + 1;
		    if (p <= 4)
			e2 = 4;
		    else if (p <= 7)
			e2 = 1;
		    else
			e2 = 2;
		}
		if (pc > 2)
		{
		    int o = (int) (Math.random () * 8) + 1;
		    if (o <= 4)
			e3 = 4;
		    else if (o <= 7)
			e3 = 1;
		    else
			e3 = 2;
		}
		if (pc > 3)
		{
		    int u = (int) (Math.random () * 8) + 1;
		    if (u <= 4)
			e4 = 4;
		    else if (u <= 7)
			e4 = 1;
		    else
			e4 = 2;
		}
		battle ();
	    }


	    else if (e == 2)
		shop ();
	    else
	    {
		int h = (int) Math.random () * 4;
		if (h == 4)
		{
		    System.out.println ("you find an old disused train");
		    if (p2 == 4 || p3 == 4 || p4 == 4)
			System.out.println ("a) have the burd repair it");
		    System.out.println ("b) take its supplys and leve");
		    char tc = IO.inputChar ("");
		    if (tc == 'a')
		    {
			e = 5;
			sc = 1;
		    }
		    else
			treat += 5;

		}
		else
		    encounter ();
	    }
	}


	t++;
	play = IO.inputChar ("keep going? (y/n)");
	health ();
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
	e1hp = Chp [e1];
	if (pc >= 2)
	{
	    System.out.println (" and " + Cname [e2]);
	    e2hp = Chp [e2];
	}


	else if (pc >= 3)
	{
	    System.out.println (" and " + Cname [e3]);
	    e3hp = Chp [e3];
	}


	else if (pc >= 4)
	{
	    System.out.println (" and " + Cname [e4]);
	    e4hp = Chp [e4];
	}


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
		    if (Cmove1T [p1] == 'n')
		    {
			System.out.println ("who to you atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ("");
			if (target == 'a')
			    System.out.println ("you " + Cmove1 [p1] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove1 [p1] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove1 [p1] + " enemy " + Cname [e3]);
			else
			    System.out.println ("you " + Cmove1 [p1] + " enemy " + Cname [e4]);
		    }
		    else if (Cmove1T [p1] == p)
		    {
			System.out.println ("who to you help?");
			System.out.println ("a) your self");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ("");
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
		    if (Cmove2T [p1] == 'n')
		    {
			System.out.println ("who to you atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ("");
			if (target == 'a')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e3]);
			else
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e4]);
		    }
		    else if (Cmove2T [p1] == p)
		    {
			System.out.println ("who to you help?");
			System.out.println ("a) your self");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ("");
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
		processPlayerChoice (Cmove2type [p1], Cmove2Dam [p1], target);
	    }

	    else if (select == 'c')
	    {
		if (pc > 1)
		{
		    if (Cmove3T [p1] == 'n')
		    {
			System.out.println ("who to you atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ("");
			if (target == 'a')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e3]);
			else
			    System.out.println ("you " + Cmove2 [p1] + " enemy " + Cname [e4]);
		    }
		    else if (Cmove2T [p1] == p)
		    {
			System.out.println ("who to you help?");
			System.out.println ("a) your self");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ("");
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
		processPlayerChoice (Cmove3type [p1], Cmove3Dam [p1], target);
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
		    if (Cmove1T [p2] == 'n')
		    {
			System.out.println ("who shound " + Cname [p2] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ("");
			if (target == 'a')
			    System.out.println (Cname [p2] + Cmove1 [p2] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p2] + Cmove1 [p2] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p2] + Cmove1 [p2] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p2] + Cmove1 [p2] + " enemy " + Cname [e4]);
		    }
		    else if (Cmove1T [p2] == p)
		    {
			System.out.println ("who shound " + Cname [p2] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ("");
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
		    if (Cmove2T [p2] == 'n')
		    {
			System.out.println ("who shound " + Cname [p2] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ("");
			if (target == 'a')
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e4]);
		    }
		    else if (Cmove2T [p2] == p)
		    {
			System.out.println ("who shound " + Cname [p2] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ("");
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
		processPlayerChoice (Cmove2type [p2], Cmove2Dam [p2], target);
	    }

	    else if (select == 'c')
	    {
		if (pc > 1)
		{
		    if (Cmove3T [p2] == 'n')
		    {
			System.out.println ("who shound " + Cname [p2] + " atack?");
			System.out.println ("a)" + e1);
			System.out.println ("b)" + e2);
			if (pc >= 3)
			    System.out.println ("c)" + e3);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ("");
			if (target == 'a')
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p2] + Cmove2 [p2] + " enemy " + Cname [e4]);
		    }
		    else if (Cmove2T [p2] == p)
		    {
			System.out.println ("who shound " + Cname [p2] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ("");
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
		processPlayerChoice (Cmove3type [p2], Cmove3Dam [p2], target);
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
		    if (Cmove1T [p3] == 'n')
		    {
			System.out.println ("who shound " + Cname [p3] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ("");
			if (target == 'a')
			    System.out.println (Cname [p3] + Cmove1 [p3] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p3] + Cmove1 [p3] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p3] + Cmove1 [p3] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p3] + Cmove1 [p3] + " enemy " + Cname [e4]);
		    }
		    else if (Cmove1T [p3] == p)
		    {
			System.out.println ("who shound " + Cname [p3] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p3]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ("");
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
		    if (Cmove2T [p3] == 'n')
		    {
			System.out.println ("who shound " + Cname [p3] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ("");
			if (target == 'a')
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e4]);
		    }
		    else if (Cmove2T [p1] == p)
		    {
			System.out.println ("who shound " + Cname [p3] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p3]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ("");
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
		processPlayerChoice (Cmove2type [p3], Cmove2Dam [p3], target);
	    }

	    else if (select == 'c')
	    {
		if (pc > 1)
		{
		    if (Cmove3T [p3] == 'n')
		    {
			System.out.println ("who shound " + Cname [p3] + " atack?");
			System.out.println ("a)" + e1);
			System.out.println ("b)" + e2);
			if (pc >= 3)
			    System.out.println ("c)" + e3);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ("");
			if (target == 'a')
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p3] + Cmove2 [p3] + " enemy " + Cname [e4]);
		    }
		    else if (Cmove2T [p1] == p)
		    {
			System.out.println ("who shound " + Cname [p3] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p3]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ("");
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
		processPlayerChoice (Cmove3type [p3], Cmove3Dam [p3], target);
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
		    if (Cmove1T [p4] == 'n')
		    {
			System.out.println ("who shound " + Cname [p4] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + Cname [e4]);
			char target = IO.inputChar ("");
			if (target == 'a')
			    System.out.println (Cname [p4] + Cmove1 [p4] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p4] + Cmove1 [p4] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p4] + Cmove1 [p4] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p4] + Cmove1 [p4] + " enemy " + Cname [e4]);
		    }
		    else if (Cmove1T [p4] == p)
		    {
			System.out.println ("who shound " + Cname [p3] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ("");
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
		    if (Cmove2T [p4] == 'n')
		    {
			System.out.println ("who shound " + Cname [p4] + " atack?");
			System.out.println ("a)" + Cname [e1]);
			System.out.println ("b)" + Cname [e2]);
			if (pc >= 3)
			    System.out.println ("c)" + Cname [e3]);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ("");
			if (target == 'a')
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e4]);
		    }
		    else if (Cmove2T [p1] == p)
		    {
			System.out.println ("who shound " + Cname [p4] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ("");
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
		processPlayerChoice (Cmove2type [p4], Cmove2Dam [p4], target);
	    }

	    else if (select == 'c')
	    {
		if (pc > 1)
		{
		    if (Cmove3T [p4] == 'n')
		    {
			System.out.println ("who shound " + Cname [p4] + " atack?");
			System.out.println ("a)" + e1);
			System.out.println ("b)" + e2);
			if (pc >= 3)
			    System.out.println ("c)" + e3);
			else if (pc >= 4)
			    System.out.println ("d)" + e4);
			char target = IO.inputChar ("");
			if (target == 'a')
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e1]);
			else if (target == 'b')
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e2]);
			else if (target == 'c')
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e3]);
			else
			    System.out.println (Cname [p4] + Cmove2 [p4] + " enemy " + Cname [e4]);
		    }
		    else if (Cmove2T [p1] == p)
		    {
			System.out.println ("who shound " + Cname [p4] + " help?");
			System.out.println ("a) you");
			if (pc >= 2)
			    System.out.println ("b)" + Cname [p2]);
			if (pc >= 3)
			    System.out.println ("c) " + Cname [p3]);
			if (pc >= 4)
			    System.out.println ("d) " + Cname [p4]);
			char target = IO.inputChar ("");
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
		processPlayerChoice (Cmove3type [p4], Cmove3Dam [p3], target);
	    }


	    else
		item ();
	}
    }


    public void item ()
    {
	System.out.println (" what item do you use");
	if (treat > 0)
	    System.out.println ("a) treat (heal 5 hp) " + treat + " in bag");
	if (big_treat > 0)
	    System.out.println ("b) Big treat (heal 10 hp) " + big_treat + " in bag");
	if (rusty_knife > 0)
	    System.out.println ("c) Rusty kife (deal 10 damage and poison " + rusty_knife + " in bag");
	if (air_horn > 0)
	    System.out.println ("d) air horn (end battle) " + air_horn + " in bag");
	if (buff_fruit > 0)
	    System.out.println ("e) buff fruit (buff allys) " + buff_fruit + " in bag");
	if (heal_fruit > 0)
	    System.out.println ("f) heal fruit (heal 15 hp) " + heal_fruit + " in bag");
	if (shock_fruit > 0)
	    System.out.println ("g) shock fruit (skip enemy turn) " + shock_fruit + " in bag");
	char i = IO.inputChar ("");
	if (i == 'a' && treat > 0)
	{
	    System.out.println ("who do you give it to you");
	    System.out.println ("a) you " + p1hp + " hp");
	    if (pc >= 2)
		System.out.println ("b)" + Cname [p2] + p2hp + " hp");
	    if (pc >= 3)
		System.out.println ("c) " + Cname [p3] + p3hp + " hp");
	    if (pc >= 4)
		System.out.println ("d) " + Cname [p4] + p4hp + " hp");
	    char target = IO.inputChar ("");
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


	else if (i == 'b' && big_treat > 0)
	{
	    System.out.println ("who do you give it to");
	    System.out.println ("a) you " + p1hp + " hp");
	    if (pc >= 2)
		System.out.println ("b)" + Cname [p2] + p2hp + " hp");
	    if (pc >= 3)
		System.out.println ("c) " + Cname [p3] + p3hp + " hp");
	    if (pc >= 4)
		System.out.println ("d) " + Cname [p4] + p4hp + " hp");
	    char target = IO.inputChar ("");
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


	else if (i == 'c' && rusty_knife > 0)
	{
	    System.out.println ("atack who");
	    System.out.println ("a) " + Cname [e1]);
	    if (pc >= 2)
		System.out.println ("b)" + Cname [e2]);
	    if (pc >= 3)
		System.out.println ("c) " + Cname [e3]);
	    if (pc >= 4)
		System.out.println ("d) " + Cname [e4]);
	    char target = IO.inputChar ("");
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


	else if (i == 'd' && air_horn > 0)
	{
	    System.out.println ("you blow the air horn");
	    e1hp = 0;
	    e2hp = 0;
	    e3hp = 0;
	    e4hp = 0;
	}


	else if (i == 'e' && buff_fruit > 0)
	{
	    if (pc == 1)
		System.out.println ("you eat the fruit and feel stronger");
	    else
		System.out.println ("you share the fruit with your pary, you all feel stronger");
	    buffP = 5;
	    bufftimerP = 3;
	    buff_fruit--;
	}


	else if (i == 'f' && heal_fruit > 0)
	{
	    System.out.println ("who do you give it to");
	    System.out.println ("a) you " + p1hp + " hp");
	    if (pc >= 2)
		System.out.println ("b)" + Cname [p2] + p2hp + " hp");
	    if (pc >= 3)
		System.out.println ("c) " + Cname [p3] + p3hp + " hp");
	    if (pc >= 4)
		System.out.println ("d) " + Cname [p4] + p4hp + " hp");
	    char target = IO.inputChar ("");
	    if (target == 'a')
	    {
		System.out.println ("you eat the heal fruit and heal 15 hp");
		p1hp += 15;
	    }
	    else if (target == 'b')
	    {
		System.out.println (Cname [p2] + " eat the heal fruit and heal 15 hp");
		p2hp += 15;
	    }
	    else if (target == 'c')
	    {
		System.out.println (Cname [p3] + " eat the heal fruit and heal 15 hp");
		p3hp += 15;
	    }
	    else if (target == 'd')
	    {
		System.out.println (Cname [p4] + " eat the heal fruit and heal 10 hp");
		p4hp += 15;
	    }
	    heal_fruit--;
	}


	else if (i == 'g' && shock_fruit > 0)
	{
	    System.out.println ("you throw it and the enemys and it pararlizes them for a turn");
	    e1statN = "afraid";
	    if (pc > 1)
		e2statN = "afraid";
	    if (pc > 2)
		e3statN = "afraid";
	    if (pc > 3)
		e4statN = "afraid";
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
	    else if (target == 'c' && e3statP != "hide")
	    {
		System.out.println ("enmay " + Cname [e3] + " takes " + pickedDam + " damage");
		e3hp -= pickedDam;
	    }
	    else if (target == 'd' && e4statP != "hide")
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
	    if (target == 'a' && e1statP != "hide")
	    {
		System.out.println ("it sacres " + "enmay " + Cname [e1] + " strat");
		e1statN = "afraid";
	    }
	    else if (target == 'b' && e2statP != "hide")
	    {
		System.out.println ("it sacres " + "enmay " + Cname [e2] + " strat");
		e2statN = "afraid";
	    }
	    else if (target == 'c' && e3statP != "hide")
	    {
		System.out.println ("it sacres " + "enmay " + Cname [e3] + " strat");
		e3statN = "afraid";
	    }
	    else if (target == 'd' && e4statP != "hide")
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
		System.out.println (Cname [p4] + " heals " + pickedDam);
		p4hp += pickedDam;
	    }
	}


	else if (pickedtype.equals ("cast"))
	{
	    int c = (int) Math.random () * 4;
	    if (c == 1)
	    {
		if (target == 'a' && e1statP != "hide")
		{
		    System.out.println ("enmay " + Cname [e1] + " is greatly hurt by the attack");
		    e1hp -= (pickedDam + buffE - debuffE);
		}
		else if (target == 'b' && e2statP != "hide")
		{
		    System.out.println ("enmay " + Cname [e2] + " is greatly hurt by the attack");
		    e2hp -= (pickedDam + buffE - debuffE);
		}
		if (target == 'c' && e3statP != "hide")
		{
		    System.out.println ("enmay " + Cname [e3] + " is greatly hurt by the attack");
		    e3hp -= (pickedDam + buffE - debuffE);
		}
		else if (target == 'd' && e4statP != "hide")
		{
		    System.out.println ("enmay " + Cname [e4] + " is greatly hurt by the attack");
		    e4hp -= (pickedDam + buffE - debuffE);
		}
		else
		    System.out.println ("it cant target them");
	    }
	    else
		System.out.println ("but nothing happened");
	}


	else if (pickedtype.equals ("poison"))
	{
	    if (target == 'a' && e1statP != "hide")
	    {
		System.out.println ("it hits enmay " + Cname [e1] + " and " + "enmay " + Cname [e1] + " is poisoned");
		e1statN = "poison";
		e1hp -= (pickedDam + buffE);
		poisontimerE1 = 3;
	    }
	    else if (target == 'b' && e2statP != "hide")
	    {
		System.out.println ("it hits enmay " + Cname [e2] + " and " + "enmay " + Cname [e2] + " is poisoned");
		e2statN = "poison";
		e2hp -= (pickedDam + buffE);
		poisontimerE2 = 3;
	    }
	    else if (target == 'c' && e3statP != "hide")
	    {
		System.out.println ("it hits enmay " + Cname [e3] + " and " + "enmay " + Cname [e3] + " is poisoned");
		e3statN = "poison";
		e3hp -= (pickedDam + buffE);
		poisontimerE3 = 3;
	    }
	    else if (target == 'd' && e4statP != "hide")
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
	    debufftimerE = 3;
	    debuffE = 3;
	}


	//hide expiers
	if (e1statP == "hide")
	    e1statP = "";
	if (e2statP == "hide")
	    e2statP = "";
	if (e3statP == "hide")
	    e3statP = "";
	if (e4statP == "hide")
	    e4statP = "";
	//poison efect
	if (p1statN == "poison")
	{
	    if (poisontimerP1 > 0)
	    {
		p1hp -= 3;
		poisontimerP1--;
	    }
	    else
		p1statN = "";
	}


	if (p2statN == "poison")
	{
	    if (poisontimerP2 > 0)
	    {
		p2hp -= 3;
		poisontimerP2--;
	    }
	    else
		p2statN = "";
	}


	if (p3statN == "poison")
	{
	    if (poisontimerP3 > 0)
	    {
		p3hp -= 3;
		poisontimerP3--;
	    }
	    else
		p3statN = "";
	}


	if (p4statN == "poison")
	{
	    if (poisontimerP4 > 0)
	    {
		p4hp -= 3;
		poisontimerP4--;
	    }
	    else
		p4statN = "";
	}


	if (buffP > 0)
	{
	    if (bufftimerP < 0)
		bufftimerP--;
	    else
		buffP = 0;
	}


	if (debuffP > 0)
	{
	    if (debufftimerE < 0)
		debufftimerE--;
	    else
		debuffP = 0;
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
		    if (Cmove1T [en] == 'n')
		    {

			while (cm == false)
			{
			    int targetE = (int) Math.random () * 4;
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
		    else if (Cmove1T [en] == p)
		    {
			while (cm == false)
			{
			    int targetE = (int) Math.random () * 4;
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
		}
		else
		{
		    target = 'a';
		    System.out.println (e1 + Cmove1 [e1] + "'s you");
		}
		processEnemyChoice (Cmove1type [en], Cmove1Dam [en], targetE);
	    }
	    else if (Eselect == 2)
	    {
		if (pc > 1)
		{
		    boolean cm = false;
		    if (Cmove2T [en] == 'n')
		    {

			while (cm == false)
			{
			    int targetE = (int) Math.random () * 4;
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
		    else if (Cmove2T [en] == p)
		    {
			while (cm == false)
			{
			    int targetE = (int) Math.random () * 4;
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
		processEnemyChoice (Cmove2type [en], Cmove2Dam [en], targetE);
	    }
	    else if (Eselect == 3)
	    {
		if (pc > 1)
		{
		    boolean cm = false;
		    if (Cmove3T [en] == 'n')
		    {

			while (cm == false)
			{
			    int targetE = (int) Math.random () * 4;
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
		    else if (Cmove3T [en] == p)
		    {
			while (cm == false)
			{
			    int targetE = (int) Math.random () * 4;
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
		    System.out.println (Cname [en] + Cmove3 [en] + "'s you");
		}
		processEnemyChoice (Cmove3type [en], Cmove3Dam [en], targetE);
	    }
	}
    }


    public void processEnemyChoice (String pickedtype, int pickedDam, int tatgetE)
    { //Enemy choice of action id applied
	if (pickedtype.equals ("damage"))
	{
	    if (tatgetE == 1 && p1statP != "hide")
	    {
		System.out.println ("you take " + (pickedDam + buffE - debuffE) + " hp.");
		p1hp -= (pickedDam + buffE - debuffE);
	    }
	    else if (tatgetE == 2)
	    {
		System.out.println (Cname [p2] + " takes " + (pickedDam + buffE - debuffE) + " hp.");
		p2hp -= (pickedDam + buffE - debuffE);
	    }
	    else if (tatgetE == 3)
	    {
		System.out.println (Cname [p3] + " takes " + (pickedDam + buffE - debuffE) + " hp.");
		p3hp -= (pickedDam + buffE - debuffE);
	    }
	    else if (tatgetE == 4)
	    {
		System.out.println (Cname [p4] + " takes " + (pickedDam + buffE - debuffE) + " hp.");
		p4hp -= (pickedDam + buffE - debuffE);
	    }
	    else
		System.out.println ("but it dosent hit");
	}


	else if (pickedtype.equals ("hide"))
	{
	    if (tatgetE == 1)
	    {
		System.out.println ("until enemy " + Cname [e1] + "'s next turn it can not be hit");
		e1statP = "hide";
	    }
	    else if (targetE == 2)
	    {
		System.out.println ("until enemy " + Cname [e2] + "'s next turn it can not be hit");
		e2statP = "hide";
	    }
	    else if (targetE == 3)
	    {
		System.out.println ("until enemy " + Cname [e3] + "'s next turn it can not be hit");
		e3statP = "hide";
	    }
	    else if (targetE == 4)
	    {
		System.out.println ("until enemy " + Cname [e4] + "'s next turn it can not be hit");
		e4statP = "hide";
	    }
	}


	else if (pickedtype.equals ("afraid"))
	{
	    if (tatgetE == 1 && p1statP != "hide")
	    {
		System.out.println ("they scare you strat");
		p1statN = "afraid";
	    }
	    else if (tatgetE == 2 && p2statP != "hide")
	    {
		System.out.println ("they scare " + Cname [p2] + " strat");
		p2statN = "afraid";
	    }
	    else if (tatgetE == 3 && p3statP != "hide")
	    {
		System.out.println ("they scare " + Cname [p3] + " strat");
		p3statN = "afraid";
	    }
	    else if (tatgetE == 4 && p4statP != "hide")
	    {
		System.out.println ("they scare " + Cname [p4] + " strat");
		p4statN = "afraid";
	    }
	    else if (tatgetE == 1)
		System.out.println ("they can't scarce you");
	    else if (tatgetE == 2)
		System.out.println ("they can't scarce " + Cname [p2]);
	    else if (tatgetE == 3)
		System.out.println ("they can't scarce " + Cname [p3]);
	    else if (tatgetE == 4)
		System.out.println ("they can't scarce " + Cname [p4]);

	}


	else if (pickedtype.equals ("heal"))
	{
	    if (tatgetE == 1)
	    {
		System.out.println (Cname [e1] + "was healed " + pickedDam + " hp");
		e1hp += pickedDam;

	    }
	    else if (tatgetE == 2)
	    {
		System.out.println (Cname [e2] + "was healed " + pickedDam + " hp");
		e2hp += pickedDam;

	    }
	    else if (tatgetE == 3)
	    {
		System.out.println (Cname [e3] + "was healed " + pickedDam + " hp");
		e3hp += pickedDam;

	    }
	    else if (tatgetE == 4)
	    {
		System.out.println (Cname [e4] + "was healed " + pickedDam + " hp");
		e4hp += pickedDam;

	    }
	}


	else if (pickedtype.equals ("cast"))
	{
	    if (tatgetE == 1 && p1statP != "hide")
	    {
		int c = (int) Math.random () * 4;
		if (c == 1)
		{
		    System.out.println ("you are greatly hurt by the attack");
		    p1hp -= (pickedDam + buffE - debuffE);
		}
		else
		    System.out.println ("but nothing happened");
	    }
	    else if (tatgetE == 2 && p2statP != "hide")
	    {
		int c = (int) Math.random () * 4;
		if (c == 1)
		{
		    System.out.println (Cname [p2] + " is greatly hurt by the attack");
		    p2hp -= (pickedDam + buffE - debuffE);
		}
		else
		    System.out.println ("but nothing happened");
	    }
	    else if (tatgetE == 3 && p3statP != "hide")
	    {
		int c = (int) Math.random () * 4;
		if (c == 1)
		{
		    System.out.println (Cname [p2] + " is greatly hurt by the attack");
		    p3hp -= (pickedDam + buffE - debuffE);
		}
		else
		    System.out.println ("but nothing happened");
	    }
	    else if (tatgetE == 4 && p4statP != "hide")
	    {
		int c = (int) Math.random () * 4;
		if (c == 1)
		{
		    System.out.println (Cname [p2] + " is greatly hurt by the attack");
		    p2hp -= (pickedDam + buffE - debuffE);
		}
		else
		    System.out.println ("but nothing happened");
	    }
	    else
		System.out.println ("but it can't target them");
	}


	else if (pickedtype.equals ("poison"))
	{
	    if (tatgetE == 1 && p1statP != "hide")
	    {
		System.out.println ("it hits you and you are poisoned");
		p1statN = "poison";
		p1hp -= (pickedDam + buffE - debuffE);

		poisontimerE1 = 3;
	    }
	    else if (tatgetE == 2 && p2statP != "hide")
	    {
		System.out.println ("it hits " + Cname [p2] + " and you are poisoned");
		p2statN = "poison";
		p2hp -= (pickedDam + buffE - debuffE);

		poisontimerE2 = 3;
	    }
	    else if (tatgetE == 3 && p4statP != "hide")
	    {
		System.out.println ("it hits " + Cname [p3] + " and you are poisoned");
		p3statN = "poison";
		p3hp -= (pickedDam + buffE - debuffE);

		poisontimerE3 = 3;
	    }
	    else if (tatgetE == 4 && p3statP != "hide")
	    {
		System.out.println ("it hits " + Cname [p4] + " and you are poisoned");
		p4statN = "poison";
		p4hp -= (pickedDam + buffE - debuffE);

		poisontimerE4 = 3;
	    }
	    else
		System.out.println ("it can not poison them");
	}


	else if (pickedtype.equals ("buff"))
	{
	    bufftimerE = 3;
	    buffE = 3;
	}


	else if (pickedtype.equals ("debuff"))
	{
	    debufftimerP = 3;
	    debuffP = 3;
	}


	if (p1statP == "hide")
	    p1statP = "";
	if (p2statP == "hide")
	    p2statP = "";
	if (p3statP == "hide")
	    p3statP = "";
	if (p4statP == "hide")
	    p4statP = "";
	if (e1statN == "poison")
	{
	    if (poisontimerE1 < 0)
	    {
		e1hp -= 3;
		poisontimerE1--;
	    }
	    else
		e1statN = "";
	}


	if (e2statN == "poison")
	{
	    if (poisontimerE2 < 0)
	    {
		e2hp -= 3;
		poisontimerE2--;
	    }
	    else
		e2statN = "";
	}


	if (e3statN == "poison")
	{
	    if (poisontimerE3 < 0)
	    {
		e3hp -= 3;
		poisontimerE3--;
	    }
	    else
		e3statN = "";
	}


	if (e4statN == "poison")
	{
	    if (poisontimerE4 < 0)
	    {
		e4hp -= 3;
		poisontimerE4--;
	    }
	    else
		e4statN = "";
	}


	if (buffE > 0)
	{
	    if (bufftimerE < 0)
		bufftimerE--;
	    else
		buffE = 0;
	}


	if (debuffE > 0)
	{
	    if (debufftimerE < 0)
		debufftimerE--;
	    else
		debuffE = 0;
	}
    }


    public void encounter ()
    {
	int i = (int) Math.random () * 6;
	if (i == 1)
	{
	    System.out.println ("you find a clean pool to drink from");
	    p1hp += 10;
	    if (pc > 1)
		p2hp += 10;
	    if (pc > 2)
		p3hp += 10;
	    if (pc > 3)
		p4hp += 10;
	}


	else if (i == 2)
	{
	    System.out.println ("you step on a rusty nail");
	    p1statN = "poison";
	    if (pc > 1)
		p2statN = "poison";
	    if (pc > 2)
		p3statN = "poison";
	    if (pc > 3)
		p4statN = "poison";
	}


	else if (i == 3)
	{
	    System.out.println ("you find a knife");
	    rusty_knife++;
	}


	else if (i == 4)
	{
	    System.out.println ("a mist kicks up");
	    p1statP = "hide";
	    if (pc > 1)
		p2statP = "hide";
	    if (pc > 2)
		p3statP = "hide";
	    if (pc > 3)
		p4statP = "hide";
	}
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


