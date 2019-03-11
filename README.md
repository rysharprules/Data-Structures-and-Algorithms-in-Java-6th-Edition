# <a href="https://www.amazon.com/Data-Structures-Algorithms-Java-6th-ebook/dp/B00JDRQF8C">Data Structures and Algorithms in Java, 6th Edition</a>
Code extracts and notes from the book by Michael T. Goodrich, Roberto Tamassia and Michael H. Goldwasser

<img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/cover.jpg" />

## Book Description
ISBN: 978-1-118-80857-3<br />
Aug 2014<br />
<i>The design and analysis of efficient data structures has long been recognized as a key component of the Computer Science curriculum. Goodrich and Tomassia's approach to this classic topic is based on the object-oriented paradigm as the framework of choice for the design of data structures. For each ADT presented in the text, the authors provide an associated Java interface. Concrete data structures realizing the ADTs are provided as Java classes implementing the interfaces. The Java code implementing fundamental data structures in this book is organized in a single Java package, net.datastructures. This package forms a coherent library of data structures and algorithms in Java specifically designed for educational purposes in a way that is complimentary with the Java Collections Framework.</i>

## Book Review
`TODO // Review this book once complete`

## Chapters
Language introductory chapters 01 (Java Primer) and 02 (Object Oriented Design) notes not required.
<table>
<thead>
    <tr>
        <th>Chapter</th>
        <th>Title</th>
        <th>Code extracts / notes</th>
    </tr>
</thead>
<tbody>
    <tr><td valign="top">03</td><td valign="top">Fundamental Data Structures</td>
        <td>
        Using Arrays:<br /><br />
            <ul>
                <li>Storing game entries in an array: <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_03/GameEntry.java">Game Entry</a> and <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_03/Scoreboard.java">Scoreboard</a></li>
                <li>Sorting an array using <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#sort-java.lang.Object:A-"><code>Arrays.sort</code></a>: <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_03/ArraysSort.java">Arrays Sort</a></li>
                <li><a href="https://en.wikipedia.org/wiki/Insertion_sort"><strong>Insertion sort algorithm</strong></a>:
                    <ul>
                        <li><a href="http://bigocheatsheet.com/">Complexity:</a> O(n^2)</li>
                        <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_03/InsertionSort.java">Insertion Sort example</a></li>
                    </ul>
                    <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/03_insertionSort.png" height="500" />
                </li>
                <li>Simple cryptography with <code>char</code> arrays: <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_03/CaesarCipher.java">Caesar Cipher</a> - <a href="https://en.wikipedia.org/wiki/Caesar_cipher">Wikipedia explanation of the Caesar cipher</a></li>
                <li>Two dimensional arrays: <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_03/TicTacToe.java">Tic Tac Toe</a></li>
            </ul>
        Linked Lists:<br /><br />
            <ul>
                <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_03/SinglyLinkedList.java">Singly Linked List</a> including example of implementing the <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Cloneable.html"><code>Cloneable</code></a> interface and a clone method</li>
                <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_03/CircularlyLinkedList.java">Circularly Linked List</a></li>
                <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_03/DoublyLinkedList.java">Doubly Linked List</a></li>
            </ul>
        </td>
    </tr>
    <tr><td valign="top">04</td><td valign="top">Algorithm Analysis</td>
    <td>
        Functions:<br />
        <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/04_functions.png" /><br />
        <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/04_comparingGrowthRates.png" /><br />
        Seven functions commonly used in the analysis of algorithms. Note, <i>logn = log<sub>2</sub>n</i>. Also, we denote with a <i>a</i> constant greater than 1.<br /><br />
        <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/04_functionRunningTimes.png" /><br />
        Example growth rates to show order of asymptotically betters algorithms.<br /><br />
        <ul>
            <li>A <a href="https://en.wikipedia.org/wiki/Constant_function"><strong>constant function</strong></a> is a function whose (output) value is the same for every input value.<br />
            <i>f(n) = c</i><br />
            <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_04/Constant.java">Example code</a></li>
            <li>The <a href="https://en.wikipedia.org/wiki/Logarithm"><strong>logarithm function</strong></a> is the inverse function to exponentiation (power).<br />
            <i>x = log<sub>b</sub>n</i> if and only if <i>b<sup>x</sup> = n</i>.<br />
            The value <i>b</i> is known as the base of the logarithm. The most common base for the logarithm function in computer science is 2 as computers store integers in binary. In fact, this base is so common that we will typically omit it from the notation when it is 2:<br />
            <i>log<sub>n</sub> = log<sub>2</sub>n</i><br />
            <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_04/Logarithmic.java">Example code</a></li>
            <li>The <a href="https://en.wikipedia.org/wiki/Linear_function"><strong>linear function</strong></a>:<br />
            <i>f(n) = n</i><br />
            Given an input value <i>n</i>, the linear function <i>f</i> assigns the value <i>n</i> itself. <br />
            This function arises in algorithm analysis any time we have to do a single basic operation for each of <i>n</i> elements. For example, comparing a number <i>x</i> to each element of an array of size <i>n</i> will require <i>n</i> comparisons. The linear function also represents the best running time we can hope to achieve for any algorithm that processes each of <i>n</i> objects that are not already in the computer’s memory, because reading in the <i>n</i> objects already requires <i>n</i> operations.<br />
            <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_04/Linear.java">Example code</a></li>
            <li>The <strong>N-Log-N function</strong><br />
            <i>f(n) = nlogn</i><br />
            Assigns to an input <i>n</i> the value of <i>n</i> times the logarithm base-two of <i>n</i>. This function grows a little more rapidly than the linear function and a lot less rapidly than the quadratic function; therefore, we would greatly prefer an algorithm with a running time that is proportional to <i>nlogn</i>, than one with quadratic running time.<br />
            <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_04/NLogN.java">Example code</a></li>
            <li><a href="https://en.wikipedia.org/wiki/Quadratic_function"><strong>Quadratic function</strong></a><br />
            <i>f(n) = n<sup>2</sup></i><br />
            Given an input value <i>n</i>, the function <i>f</i> assigns the product of <i>n</i> with itself (i.e., n squared).<br />
            There are many algorithms that have nested loops, where the inner loop performs a linear number of operations and the outer loop is performed a linear number of times. Thus, in such cases, the algorithm performs <i>n</i> * <i>n</i> = <i>n<sup>2</sup></i> operations
            </li>
            <li>The <a href="https://en.wikipedia.org/wiki/Cubic_function"><strong>cubic function</strong></a><br />
            <i>f(n) = n<sup>3</sup></i><br />
            Assigns an input value <i>n</i> the product of <i>n</i> with itself three times. The cubic function appears less frequently in the context of algorithm analysis than the constant, linear, and quadratic functions, but it does appear from time to time.
            </li>
            <li>The linear, quadratic and cubic functions can each be viewed as being part of a larger class of functions, the <a href="https://en.wikipedia.org/wiki/Polynomial"><strong>polynomials</strong></a>.  A polynomial function has the form:<br />
            <i>f(n) = a<sub>0</sub> + a<sub>1</sub>n + a<sub>2</sub>n<sup>2</sup> + a<sub>3</sub>n<sup>3</sup> +···+ a<sub>d</sub>n<sup>d</sup></i><br />
            where <i>a<sub>0</sub>,a<sub>1</sub>,...,a<sub>d</sub></i> are constants, called the <a href="https://en.wikipedia.org/wiki/Coefficient"><strong>coefficients</strong></a> of the polynomial, and <i>a<sub>d</sub> ≠ 0</i>. Integer <i>d</i>, which indicates the highest power in the polynomial, is called the <a href="https://en.wikipedia.org/wiki/Degree_of_a_polynomial"><strong>degree</strong></a> of the polynomial.<br />
            <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_04/Polynomial.java">Example code</a></li>
            <li><a href="https://en.wikipedia.org/wiki/Summation"><strong>Summations</strong></a> (denoted with an enlarged capital Greek sigma symbol) gives us a shorthand way of expressing sums of increasing terms that have a regular structure<br />
            Examples: For a sequence of consecutive integers:<br />
            <i>b∑i=a f(i) = f(a) + f(a+1) + f(a+2) +···+ f(b)</i><br />
            If the the integers in question were 1 to 100, using a summation, we can rewrite the formula:<br />
            <i>100∑i=1 i</i><br />
            The value of this summation is 5050. It can be found without performing 99 additions, since it can be shown (for instance by mathematical induction) that<br />
            <i>n∑i=1 i = n(n+1) / 2</i>
            </li>
            <li>The <a href="https://en.wikipedia.org/wiki/Exponential_function"><strong>Exponential function</strong></a><br />
            <i>f(n) = b<sup>n</sup></i><br />
            where <i>b</i> is a positive constant, called the base, and the argument <i>n</i> is the exponent. That is, function <i>f(n)</i> assigns to the input argument <i>n</i> the value obtained by multiplying the base <i>b</i> by itself <i>n</i> times.<br /> 
            <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_04/Exponential.java">Example code</a></li>
            <li><a href="https://en.wikipedia.org/wiki/Geometric_series"><strong>Geometric series</strong></a> is a series with a constant ratio between successive terms. E.g.: <i>1/2 + 1/4 + 1/8 + 1/16 + ...</i> is geometric, because each successive term can be obtained by multiplying the previous term by 1/2.</li>
        </ul>
        <a href="https://en.wikipedia.org/wiki/Asymptotic_analysis">Asymptotic Analysis</a>:<br /><br />
        <ul>
            <li>
                <strong>primitive operations</strong> such as the following:
                <ul>
                    <li>Assigning a value to a variable</li>
                    <li>Following an object reference</li>
                    <li>Performing an arithmetic operation (for example, adding two numbers)</li>
                    <li>Comparing two numbers</li>
                    <li>Accessing a single element of an array by index</li>
                    <li>Calling a method</li>
                    <li>Returning from a method</li>
                </ul>
            </li>
            <li><a href="https://en.wikipedia.org/wiki/Big_O_notation"><strong>“Big-Oh” Notation</strong></a> is used to describe the performance or complexity of an algorithm. Big O specifically describes the worst-case scenario, and can be used to describe the execution time required or the space used (e.g. in memory or on disk).<br />
            Let <i>f(n)</i> and <i>g(n)</i> be functions mapping positive integers to positive real numbers. We say that <strong><i>f(n)</i> is <i>O(g(n))</i></strong> (or <strong><i>f(n)</i> is big-Oh of <i>g(n)</i></strong>) if there is a real constant <i>c > 0</i> and an integer constant <i>n<sub>0</sub> ≥ 1</i> such that:
            <i>f(n) ≤ cg(n)</i>, for <i>n ≥ n<sub>0</sub></i><br />
            <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/04_bigO.png" /><br />
            It is considered poor taste to include constant factors and lower-order terms in the big-Oh notation. The seven functions are the most common.</li>
            <li><strong>Big-Omega</strong> (Ω) provides an asymptotic way of saying that a function grows at a rate that is “greater than or equal to” (rather tha big-Oh's “less than or equal to”)<br />
            We say that <i>f(n)</i> is <i>Ω(g(n))</i>, pronounced “<i>f(n)</i> is big-Omega of <i>g(n)</i>,” if <i>g(n)</i> is <i>O(f(n))</i>, that is, there is a real constant <i>c > 0</i> and an integer constant <i>n<sub>0</sub> ≥ 1</i> such that:<br />
            <i>f(n) ≥ cg(n)</i>, for <i>n ≥ n<sub>0</sub></i></li>
            <li><strong>Big-Theta</strong> (Θ) allows us to say that two functions grow at the same rate, up to constant factors.<br />
            <i>f(n)</i> is <i>Θ(g(n))</i>, pronounced “<i>f(n)</i> is big-Theta of <i>g(n)</i>,” if <i>f(n)</i> is <i>O(g(n))</i> and <i>f(n)</i> is <i>Ω(g(n))</i>, that is, there are real constants <i>c′ > 0</i> and <i>c′′ > 0</i>, and an integer constant <i>n<sub>0</sub> ≥ 1</i> such that <i>c′g(n) ≤ f(n) ≤ c′′g(n)</i>, for <i>n ≥ n<sub>0</sub></i></li>
        </ul>
        Simple Justification Techniques:<br /><br />
        <ul>
            <li>A <a href="https://en.wikipedia.org/wiki/Counterexample"><strong>counterexample</strong></a> is a special kind of example that disproves a statement or proposition. 
                <ul><li>Example: The proposition "all students are lazy". Because this statement makes the claim that a certain property (laziness) holds for all students, even a single example of a diligent student will prove it false. Thus, any hard-working student is a counterexample to "all students are lazy".</li></ul></li>
            <li><a href="https://en.wikipedia.org/wiki/Contraposition"><strong>Contraposition</strong></a>  is an inference that says that a conditional statement is logically equivalent to its contrapositive. The contrapositive of the statement has its antecedent and consequent inverted and flipped: the contrapositive of <code>P == Q</code> is thus <code>!P == !Q</code>. 
                <ul><li>Example: The proposition "All cats are mammals" can be restated as the conditional "If something is a cat, then it is a mammal". Now, the law says that statement is identical to the contrapositive "If something is not a mammal, then it is not a cat."</li></ul></li>
            <li><a href="https://en.wikipedia.org/wiki/De_Morgan%27s_laws"><strong>De Morgan's laws</strong></a> - justification by contradiction; Regardless of whether applying to sets, propositions, or logic gates, the structure is always the same:
            <br />Not (A and B) is the same as Not A or Not B.
            <br />Not (A or B) is the same as Not A and Not B.</li>
            <li><a href="https://en.wikipedia.org/wiki/Mathematical_induction"><strong>Mathematical induction</strong></a> is a mathematical proof technique. It is essentially used to prove that a property P(n) holds for every natural number n, i.e. for n = 0, 1, 2, 3, and so on. The method of induction requires two cases to be proved. The first case, called the base case (or, sometimes, the basis), proves that the property holds for the number 0. The second case, called the induction step, proves that, if the property holds for one natural number n, then it holds for the next natural number n + 1. These two steps establish the property P(n) for every natural number n = 0, 1, 2, 3, ... The base step need not begin with zero. Often it begins with the number one, and it can begin with any natural number, establishing the truth of the property for all natural numbers greater than or equal to the starting number.</li>
            <li>A <a href="https://en.wikipedia.org/wiki/Loop_invariant"><strong>loop invarient</strong></a> is a property of a program loop that is true before (and after) each iteration. </li>
        </ul>
    </td></tr>
    <tr><td valign="top">05</td><td valign="top">Recursion</td><td>
        Examples:<br /><br />
        <ul>
            <li>The <a href="https://en.wikipedia.org/wiki/Factorial"><strong>factorial</strong></a> function, <i>n!</i><br />
            <i>n! = <br />
            { 1</i> if <i>n = 0</i><br />
            <i>{ n * (n−1)</i> if <i>n ≥ 1</i><br />
            <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_05/Factorial.java">Example code</a><br />
            Recursion tree: <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/05_factorial.png" /><br />
            In Java, each time a method (recursive or otherwise) is called, a structure known as an activation record or activation frame is created to store information about the progress of that invocation of the method. This frame stores the parameters and local variables specific to a given call of the method, and information about which command in the body of the method is currently executing.</li>
            <li><a href="https://en.wikipedia.org/wiki/Fibonacci_number"><strong>Fibonacci numbers</strong></a><br />
            <i>F0 = 0<br />F1 = 1<br />Fn = Fn−2 +Fn−1</i> for <i>n > 1.</i><br />
            <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_05/Fibonacci.java">Example code</a> (good and bad examples)               
            </li>
            <li>An English ruler has a recursive pattern that is a simple example of a fractal structure. Below is an example of a 2 inch ruler with major tick length of 3:<br />
            --- 0<br />-<br />--<br />-<br />--- 1<br />-<br />--<br />-<br />--- 2<br />
            We denote the length of the tick designating a whole inch as the major tick length. Between the marks for whole inches, the ruler contains a series of minor ticks, placed at intervals of 1/2 inch, 1/4 inch, and so on. As the size of the interval decreases by half, the tick length decreases by one. In general, an interval with a central tick length L ≥ 1 is composed of:
            <ul><li>An interval with a central tick length L−1</li>
            <li>A single tick of length L</li>
            <li>An interval with a central tick length L−1</li></ul>
            <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_05/Factorial.java">Example code</a><br />
            Example code recursion trace: <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/05_englishRuler.png" />
            </li>
            <li>The <a href="https://en.wikipedia.org/wiki/Binary_search_algorithm"><strong>binary search algorithm</strong></a> is used to efficiently locate a target value within a sorted (indexable) sequence of <i>n</i> elements stored in an array.<br />
            Complexity: O(log n)<br />
            <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_05/BinarySearch.java">Example code</a><br /><br />
            Note, when the sequence is <u>unsorted</u>, the standard approach to search for a target value is to use a loop to examine every element, until either finding the target or exhausting the data set. This algorithm is known as <u>linear</u> or <u>sequential</u> search, and it runs in O(n) time (i.e., linear time) since every element is inspected in the worst case.<br /><br />    
            Terms:
            <ul><li><strong>Candidate</strong>: an element of the sequence which at the current stage of the search, may match the target</li>
            <li><strong>Low</strong>: candidate element has the index of at least low; Initially set to 0</li>
            <li><strong>High</strong>: candidate element has the index of at most high; Initially set to <i>n-1</i> or <code>n.length - 1</code></li>
            <li><strong>Median candidate</strong>: <i>mid = (low + high)/2</i> - Initially set as the median of the array</li></ul>
            <br />
            Three cases considered:
            <ol><li>If the target equals the median candidate, then we have found the item we are looking for, and the search terminates successfully.</li>
            <li>If the target is less than the median candidate, then we recur on the first half of the sequence, that is, on the interval of indices from <i>low</i> to <i>mid−1</i>.</li>
            <li>If the target is greater than the median candidate, then we recur on the second half of the sequence, that is, on the interval of indices from <i>mid+1</i> to <i>high</i></li></ol>
            <br />
            Binary search example where target value 22 on a sorted array with 16 elements:
            <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/05_binarySearch.png" />
            </li>
            <li>File systems - Recursively inspect a tree structure, in this instance a file system of an arbitrary depth to discover the cumulative disk size.<br />
            <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_05/FileSystems.java">Example code</a></li>
        </ul>
        Types of recursion:<br /><br />
        <ul>
            <li>If a recursive call starts at most one other, we call this a <strong>linear recursion</strong> - <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_05/Linear.java">Example code</a></li>
            <li>If a recursive call may start two others, we call this a <strong>binary recursion</strong> - <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_05/Binary.java">Example code</a></li>
            <li>If a recursive call may start three or more others, this is <strong>multiple recursion</strong></li>
        </ul>
    </td></tr>
    <tr><td valign="top">06</td><td valign="top">Stacks, Queues, and Deques</td><td>
    <strong>Stacks</strong>:<br /><br />
    <ul>
        <li>A collection of objects that are inserted and removed via <strong>last-in, first-out (LIFO)</strong></li>
        <li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html">Java 8 Stack<E> class API:</a>
            <ul>
                <li><code>boolean empty()</code> - Tests if this stack is empty.</li>
                <li><code>E peek()</code> - Looks at the object at the top of this stack without removing it from the stack.</li>
                <li><code>E pop()</code> - Removes the object at the top of this stack and returns that object as the value of this function.</li>
                <li><code>E push(E item)</code> - Pushes an item onto the top of this stack.</li>
            </ul>
        </li>
        <li>Current documentation for the Stack class recommends that it not be used, as LIFO functionality (and more) is provided by a more general data structure known as a <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html">double-ended queue (deque)</a> - <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html">ArrayDeque documentation</a>: <quote><i>This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.</i></li>
        <li>Example code:<ul>    
            <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_06/Stack.java">Stack interface</a></li>
            <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_06/ArrayStack.java">Simple Array-Based Stack</a></li>
            <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_06/LinkedStack.java">Stack with a Singly Linked List</a></li>
            <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_06/Reverse.java">Reverse array using Stack</a></li>
            <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_06/Matcher.java">Matching Delimiters and Tags</a></li>
        </ul></li>
    </ul>
    <strong>Queues</strong> and Double-Ended Queues (<strong>Deques</strong>):<br /><br />
    <ul>
        <li>A collection of objects that are inserted and removed via <strong>first-in, first-out (FIFO)</strong></li>
        <li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html">Java 8 Queue interface API</a>
            <table><tr><th></th><th><i>Throws exception</i></th><th><i>Returns special value</i></th></tr>
            <tr><td><strong>Insert</strong></td><td><code>add(e)</code></td><td><code>offer(e)</code></td></tr>
            <tr><td><strong>Remove</strong></td><td><code>remove()</code></td><td><code>poll()</code></td></tr>
            <tr><td><strong>Examine</strong></td><td><code>element()</code></td><td><code>peek()</code></td></tr></table>
        </li>
        <li>Example code:<ul>    
            <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_06/Queue.java">Queue interface</a></li>
            <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_06/ArrayQueue.java">Array-Based Queue</a></li>
            <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_06/LinkedQueue.java">Queue with a Singly Linked List</a></li>
            <li><a href="https://en.wikipedia.org/wiki/Josephus_problem">Josephus problem</a> - <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_06/Josephus.java">using circular linked list</a></li>
            <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_06/Deque.java">Deque interface</a></li>
        </ul></li>
    </ul></td></tr>
    <tr><td valign="top">07</td><td valign="top">List and Iterator Abstract Data Types (ADTs)</td><td>
    The <strong>List</strong> ADT:<br /><br />
    <ul>
        <li>Simple ArrayList class with bounded capacity: <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_07/ArrayList.java">Array List</a></li>
        <li>A dynamically sized ArrayList, utilizing a resize method which doubles the array size once limit reached: <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_07/DynamicArrayList.java">Dynamic Array List</a><br />
            <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/07_arrayResize.png" /><br />
            Resize logic: (a) Create new array B; (b) Store elements of A in B; (c) Reassign reference A to the new array
        </li>
        <li><strong><a href="https://en.wikipedia.org/wiki/Amortized_analysis">Amortized Analysis</a></strong> of dynamic arrays shows that performing a sequence of push operations on a dynamic array is actually quite efficient as over time the resize method is only called when the array is size of 2, 4, 8, 16 etc. So, every time the resize method is not called, we gain <i>'credit'</i> for the later call.</li>
        <li>For dyanamic arrays, a <strong><a href="https://en.wikipedia.org/wiki/Arithmetic_progression">arithmetic progression</a></strong> strategy is significantly worse for overall performance.</li>
        <li>Positional Lists: Indices are not a good abstraction for describing a more local view of a position in a sequence, because the index of an entry changes over time, e.g. a persons position in a queue waiting for tickets. Example code: <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_07/PositionalList.java">Positional List</a></li>
        <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_07/PositionalListSorter.java">Sorting of a positional list example</a> using a marker to indicate at what (right most) point elements have been sorted, the position after the marker as the pivot, and walk, to move leftward from the marker, as long as there remains a preceding element with value larger than the pivot’s.</li>
        <li><strong><a href="https://en.wikipedia.org/wiki/Move-to-front_transform">Move-to-Front Heuristic</a></strong> -  In many real-life access sequences (e.g., Web pages visited by a user), once an element is accessed it is more likely to be accessed again in the near future. Such scenarios are said to possess locality of reference. A heuristic, or rule of thumb, that attempts to take advantage of the locality of reference that is present in an access sequence is the move-to-front heuristic. To apply this heuristic, each time we access an element we move it all the way to the front of the list</li>
    </ul>
    <strong><a href="https://en.wikipedia.org/wiki/Iterator">Iterators</a></strong>:<br /><br />
    <ul>
        <li>A software design pattern that abstracts the process of scanning through a sequence of elements, one element at a time. It plays a fundamental role in support of the “for-each” loop syntax</li>
        <li>See example code in <a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_07/ArrayList.java">Array List</a>, inner class <code>ArrayIterator</code></li>
        <li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html">Java 8 docs</a></li>
    </ul>
    <strong><a href="https://en.wikipedia.org/wiki/Java_collections_framework">The Java Collections Framework</a></strong><br /><br />
    <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/07_javaCollectionsFramework.png" /><br />
    <ul><li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html">Java 8 Collections (utility class) docs</a></li></ul>
    </td></tr>
    <tr><td valign="top">08</td><td valign="top">Trees</td><td>
    <strong>Trees</strong>:<br /><br />
    <ul>
        <li>A <a href="https://en.wikipedia.org/wiki/Tree_(data_structure)" />tree</a> is an abstract data type that stores elements hierarchically with a root value and subtrees of <strong>children</strong> with a <strong>parent</strong> node, represented as a set of linked nodes.</li>
        <li>Two nodes that are children of the same parent are <strong>siblings</strong>. A node <i>v</i> is <strong>external</strong> if v has no children. A node <i>v</i> is <strong>internal</strong> if it has one or more children. External nodes are also known as <strong>leaves</strong>.</li>
        <li>A node <i>u</i> <strong>subtree</strong> of <i>T</i> <strong>rooted</strong> at a node <i>v</i> is the tree consisting of all the descendants of <i>v</i> in <i>T</i> (including <i>v</i> itself)</li>
        <li>An <strong>edge</strong> of tree <i>T</i> is a pair of nodes (<i>u</i>,<i>v</i>) such that <i>u</i> is the parent of <i>v</i>, or vice versa. A <strong>path</strong> of <i>T</i> is a sequence of nodes such that any two consecutive nodes in the sequence form an edge.</li>
    </ul>
    The <strong>Tree Abstract Data Type</strong>:<br /><br />
    <ul>
        <li></li>
        <li></li>
        <li></li>
    </ul>
    </td></tr>
</tbody>
</table>