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
<table>
<thead>
    <tr>
        <th>Chapter</th>
        <th>Title</th>
        <th>Code extracts / notes</th>
    </tr>
</thead>
<tbody>
    <tr><td>01</td><td>Java Primer</td><td></td></tr>
    <tr><td>02</td><td>Object Oriented Design</td><td></td></tr>
    <tr><td>03</td><td>Fundamental Data Structures</td>
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
    <tr><td>04</td><td>Algorithm Analysis</td>
    <td>
        Functions:<br /><br />
        <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/04_functions.png" /><br />
        <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/04_comparingGrowthRates.png" /><br />
        Seven functions commonly used in the analysis of algorithms. Note, <i>logn = log<sub>2</sub>n</i>. Also, we denote with a <i>a</i> constant greater than 1.<br /><br />
        <ul>
            <li>A <a href="https://en.wikipedia.org/wiki/Constant_function"><strong>constant function</strong></a> is a function whose (output) value is the same for every input value.<br />
            <i>f(n) = c</i></li>
            <li>The <a href="https://en.wikipedia.org/wiki/Logarithm"><strong>logarithm function</strong></a> is the inverse function to exponentiation (power).<br />
            <i>x = log<sub>b</sub>n</i> if and only if <i>b<sup>x</sup> = n</i>.<br />
            The value <i>b</i> is known as the base of the logarithm. The most common base for the logarithm function in computer science is 2 as computers store integers in binary. In fact, this base is so common that we will typically omit it from the notation when it is 2:<br />
            <i>log<sub>n</sub> = log<sub>2</sub>n</i></li>
            <li>The <a href="https://en.wikipedia.org/wiki/Linear_function"><strong>linear function</strong></a>:<br />
            <i>f(n) = n</i><br />
            Given an input value <i>n</i>, the linear function <i>f</i> assigns the value <i>n</i> itself. <br />
            This function arises in algorithm analysis any time we have to do a single basic operation for each of <i>n</i> elements. For example, comparing a number <i>x</i> to each element of an array of size <i>n</i> will require <i>n</i> comparisons. The linear function also represents the best running time we can hope to achieve for any algorithm that processes each of <i>n</i> objects that are not already in the computer’s memory, because reading in the <i>n</i> objects already requires <i>n</i> operations.</li>
            <li>The <strong>N-Log-N function</strong><br />
            <i>f(n) = nlogn</i><br />
            Assigns to an input <i>n</i> the value of <i>n</i> times the logarithm base-two of <i>n</i>. This function grows a little more rapidly than the linear function and a lot less rapidly than the quadratic function; therefore, we would greatly prefer an algorithm with a running time that is proportional to <i>nlogn</i>, than one with quadratic running time.
            </li>
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
            where <i>a<sub>0</sub>,a<sub>1</sub>,...,a<sub>d</sub></i> are constants, called the <a href="https://en.wikipedia.org/wiki/Coefficient"><strong>coefficients</strong></a> of the polynomial, and <i>a<sub>d</sub> ≠ 0</i>. Integer <i>d</i>, which indicates the highest power in the polynomial, is called the <a href="https://en.wikipedia.org/wiki/Degree_of_a_polynomial"><strong>degree</strong></a> of the polynomial.</li>
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
            where <i>b</i> is a positive constant, called the base, and the argument <i>n</i> is the exponent. That is, function <i>f(n)</i> assigns to the input argument <i>n</i> the value obtained by multiplying the base <i>b</i> by itself <i>n</i> times. 
            </li>
            <li><a href="https://en.wikipedia.org/wiki/Geometric_series"><strong>Geometric series</strong></a> is a series with a constant ratio between successive terms. E.g.: <i>1/2 + 1/4 + 1/8 + 1/16 + ...</i> is geometric, because each successive term can be obtained by multiplying the previous term by 1/2.</li>
        </ul>
        <br />
        Asymptotic Analysis:<br /><br />
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
        </ul>
        //////////////////////////////// TODO: Finish notes on this section /////////////////////////////////
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
    <tr><td>04</td><td>Recursion</td><td></td></tr>
</tbody>
</table>