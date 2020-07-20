# Calculator
	Simple calculator, based on two classes: Calculator and AdvancedCalculator. AdvancedCalculator class inherit from Calculator and append new features.
## Features, which are contained in app: 
*public **add** method,
*public **multiply** method,
*public **subtract** method,
*public **divide** method,
*public **pow** method,
*public **root** method,
*public static **computeCircleArea** method,
	Each of these methods, after every done operation adds description to **global history array** for every class instance and **operation history array** for Calculator class instances. Operation history and global operations history can be printed by **printOperations** method and overloaded static **printGlobalOperations** method. You can also erase all history by **clearOperation** method and static **clearGlobalHistory** method.
