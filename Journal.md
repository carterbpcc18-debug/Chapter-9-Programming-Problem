Divine Forge Journal
Phase 1: The Divine Blueprint

What did I accomplish?
I created the Artifact class with a String field called material and a constructor that initializes the material when an object is created. I also added a temporary main method to instantiate an artifact using Silver as its material.

Why is it important to use a constructor?
Using a constructor allows the material field to be initialized as soon as the object is created. This makes sure that the artifact receives its material immediately instead of requiring me to assign it separately afterward. It also allows the forging message to be printed automatically when the object is instantiated.

Testing and challenges
I compiled the program and ran it to test the Artifact constructor. The expected output was:
A relic of Silver is being forged.
The output confirms that the constructor received the material argument, assigned it to the material field, and printed the correct forging message. One important part of this phase was understanding how constructors initialize objects automatically.



Phase 2: Legendary Armaments

What did I accomplish?
I created a DivineWeapon subclass that extends the Artifact class. I added a private String field called essenceType and a constructor that accepts an essence type as an argument. I used super("Celestial Bronze") to call the superclass constructor and initialize the weapon's material.

What happens if I do not call the base class constructor?
The Artifact class has a parameterized constructor that requires a material argument. If I do not explicitly call an appropriate superclass constructor, Java attempts to insert a call to super() with no arguments. Since the Artifact class does not have a no-argument constructor, the code will not compile. Calling super("Celestial Bronze") provides the required material and initializes the inherited part of the object.

Testing and challenges
I compiled and ran the program to test the custom DivineWeapon constructor using Storm as the essence type. The expected output was:
A relic of Celestial Bronze is being forged.
Its essence is now glowing with Storm energy.
The output confirms that the superclass constructor executes first and prints the material message before the subclass constructor prints the essence message. This phase helped me understand how inheritance and constructor calls work together in Java.



Phase 3: The Master's Shortcuts

What did I accomplish?
I added a no-argument constructor to the DivineWeapon class. Instead of repeating the initialization code, I used this("Pure Sunlight") to call the existing parameterized constructor with a default essence type. I also updated the main method to test both a custom weapon and a default weapon.

How does using this() help in the future?
Using this() allows one constructor to call another constructor in the same class. This prevents me from duplicating initialization logic and makes the code easier to maintain. If I decide to change the default essence type in the future, I can change the argument in the no-argument constructor without rewriting the rest of the initialization code.

Testing and challenges
I compiled and ran the program to test both the custom Storm weapon and the default weapon. The expected output was:
A relic of Celestial Bronze is being forged.
Its essence is now glowing with Storm energy.
A relic of Celestial Bronze is being forged.
Its essence is now glowing with Pure Sunlight energy.
The output confirms that both constructors initialize the weapon correctly. The custom constructor uses Storm, while the no-argument constructor uses Pure Sunlight. In both cases, the superclass material message appears before the essence message. This phase helped me understand how constructor chaining reduces code duplication.