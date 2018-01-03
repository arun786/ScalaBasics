# While Loop

	var i = 0;
	while(i< args.length()){
		println(args(i))
		i += 1;
	}
	
# For Loop

one way

	for(arg <- args)
	println(arg)
	
second way

	args.foreach(arg => println(arg))

third way

	args.foreach(println)

Fourth way
	
	args foreach println