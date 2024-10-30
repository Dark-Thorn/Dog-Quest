//Griffin Tattongeyer
//2024 oct 20-30
//dog quest RPG
public class RPG2
{
    //caricer sheets
    String Cname[] = {"dog", "cat", "snake", "toad", "bird", "rat"};
    int Chp[] = {25, 25, 25, 15, 15, 25};
    String Cmove1[] = {"bite", "scratch", "soothe", "tonic", "shoot", "poison bite"};
    String Cmove1type[] = {"damage", "damage", "heal", "buff", "damage", "poison"};
    int Cmove1Dam[] = {10, 5, 10, 0, 10, 3};
    String Cmove2[] = {"guard", "cast", "trap", "jump", "fly", "tall wip"};
    String Cmove2Type[] = {"hide", "cast", "afraid", "hide", "hide", "debuff"};
    int Cmove2Dam[] = {0, 20, 0, 0, 0, 3};
    String Cmove3[] = {"bark", "lick", "poison bite", "soothe", "gust", "stealth claw"};
    String Cmove3type[] = {"afraid", "buff", "poison", "heal", "debuff", "cast"};
    int Cmove3Dam[] = {0, 0, 3, 10, 3, 20};
    //player vars
    int p1 = 0;
    int p1hp = 50;
    String p1statP = "";
    String p1statN = "";
    int poisontimerP = 0;
    int bufftimerP = 0;
    int buffP = 0;
    int debufftimerP = 0;
    int debuffP = 0;
    //enemy vars
    int e1 = 0;
    int e1hp = 0;
    String e1statP = "";
    String e1statN = "";
    int poisontimerE = 0;
    int bufftimerE = 0;
    int buffE = 0;
    int debufftimerE = 0;
    int debuffE = 0;
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
	play = IO.inputChar ("play game? (y/n)");
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
		System.out.println ("play end credits");
		play = 'n';
	    }
	}
    }


    public void road ()
    {
	System.out.println ("\tyou arive at long road");
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
		re++;
	    }
	    else
		//genral encounter
		encounter ();
	}
	//boss fight
	int np = (int) (Math.random () * 2);
	//new pary meber:
	r++;
	play = IO.inputChar ("keep going? (y/n)");
    }


    public void garbage_dump ()
    {
	System.out.println ("\tyou arive at garbage dump");
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
	play = IO.inputChar ("keep going? (y/n)");
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
	System.out.println ("you are attacked by " + e1);
	System.out.println ();
	System.out.println (p1 + "'s HP equal to " + p1hp);
	System.out.println ("enemy " + e1 + "'s HP equal to " + e1hp);
	System.out.println ();


	//battle loop
	while (p1hp > 0 && e1hp > 0)
	{
	    System.out.println ();
	    System.out.println ("your HP equal to " + p1hp);
	    System.out.println ("enemy " + e1 + "'s HP equal to " + e1hp);
	    System.out.println ();
	    playerChoice ();
	    EnemyChoice ();
	}
	//who won
	if (e1hp <= 0)
	{
	    System.out.println ("the " + e1 + " runs away");
	    Money += (Math.random () * 10);
	    poisontimerE = 0;
	}
	else
	{
	    System.out.println ("\tyou have been defeated");
	    play = 'n';
	}
    }


    public void playerChoice ()
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
		processPlayerChoice (Cmove1type [p1], Cmove1Dam [p1]);
	    else if (select == 'b')
		processPlayerChoice (Cmove2Type [p1], Cmove2Dam [p1]);
	    else if (select == 'c')
		processPlayerChoice (Cmove3type [p1], Cmove3Dam [p1]);
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
	    System.out.println ("you eat the treat and heal 5 hp");
	    p1hp += 5;
	}
	else if (i == 'b' && rusty_knife < 0)
	{
	    System.out.println ("you eat the big treat and heal 10 hp");
	    p1hp += 10;
	}
	else if (i == 'c' && air_horn < 0)
	{
	    System.out.println ("you stab " + e1 + " with the kife " + e1 + " takes 10 damage and is poisoned");
	    e1hp -= 10;
	    e1statN = "poison";
	}

	{
	    System.out.println ("you blow the air horn");
	    e1hp = 0;
	}
    }


    public void processPlayerChoice (String pickedtype, int pickedDam)
    { //your choice of action id applied
	if (pickedtype.equals ("damage"))
	{
	    System.out.println (e1 + " takes " + pickedDam + " hp.");
	    e1hp -= pickedDam;
	}
	else if (pickedtype.equals ("damage") && e1statP.equals ("hide"))
	    System.out.println ("you are unable to hit " + e1);
	else if (pickedtype.equals ("hide"))
	{
	    System.out.println ("until your next turn you can not be hit");
	    p1statP = "hide";
	}
	else if (pickedtype.equals ("afraid"))
	{
	    System.out.println ("you sacre " + e1 + " strat");
	    e1statN = "afraid";
	}
	else if (pickedtype.equals ("afraid") && e1statP.equals ("hide"))
	    System.out.println ("you are unable to hit " + e1);
	else if (pickedtype.equals ("heal"))
	{
	    p1hp += pickedDam;
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
	if (p1statN == "buff")
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



    public void EnemyChoice ()
    {
	if (e1statN == "afraid")
	{
	    System.out.println (e1 + " is to sacred to move");
	    e1statN = "";
	}


	else
	{
	    int Eselect = (int) (Math.random () * 3);

	    if (Eselect == 1)
	    {
		processEnemyChoice (Cmove1type [e1], Cmove1Dam [e1]);
		System.out.println (e1 + Cmove1 [e1] + "'s you");
	    }
	    else if (Eselect == 2)
	    {
		processEnemyChoice (Cmove2Type [e1], Cmove2Dam [e1]);
		System.out.println (e1 + Cmove2 [e1] + "'s you");
	    }
	    else if (Eselect == 3)
	    {
		processEnemyChoice (Cmove3type [e1], Cmove3Dam [e1]);
		System.out.println (e1 + Cmove2 [e1] + "'s you");
	    }
	}
    }


    public void processEnemyChoice (String pickedtype, int pickedDam)
    { //Enemy choice of action id applied
	if (pickedtype.equals ("damage"))
	{
	    System.out.println (e1 + " takes " + pickedDam + " hp.");
	    e1hp -= (pickedDam + buffE);
	}


	else if (pickedtype.equals ("damage") && p1statP.equals ("hide"))
	    System.out.println ("but " + e1 + " is unable to hit you");
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
	    e1hp += (pickedDam + buffE);

	}


	else if (pickedtype.equals ("cast"))
	{
	    int c = (int) Math.random () * 4;
	    if (c == 1)
	    {
		System.out.println ("you are greatly hurt by " + e1 + "'s attack");
		p1hp -= (pickedDam + buffE);
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


