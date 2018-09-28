# <a href="https://www.amazon.com/Data-Structures-Algorithms-Java-6th-ebook/dp/B00JDRQF8C">Data Structures and Algorithms in Java, 6th Edition</a>
Code extracts and notes from the book by Michael T. Goodrich, Roberto Tamassia and Michael H. Goldwasser

<img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/cover.jpg" />

## Book Description
ISBN: 978-1-118-80857-3<br />
Aug 2014<br />
The design and analysis of efficient data structures has long been recognized as a key component of the Computer Science curriculum. Goodrich and Tomassia's approach to this classic topic is based on the object-oriented paradigm as the framework of choice for the design of data structures. For each ADT presented in the text, the authors provide an associated Java interface. Concrete data structures realizing the ADTs are provided as Java classes implementing the interfaces. The Java code implementing fundamental data structures in this book is organized in a single Java package, net.datastructures. This package forms a coherent library of data structures and algorithms in Java specifically designed for educational purposes in a way that is complimentary with the Java Collections Framework.

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
                <li>Insertion sort algorithm:
                    <ul>
                        <li><a href="http://bigocheatsheet.com/">Complexity:</a> O(n^2)</li>
                        <li><a href="https://github.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/blob/master/src/dsa6/chapter_03/InsertionSort.java">Insertion Sort example</a></li>
                        <li>
                            <img src="https://raw.githubusercontent.com/rysharprules/Data-Structures-and-Algorithms-in-Java-6th-Edition/master/img/03_insertionSort.png" />
                        </li>
                        <li><a href="https://en.wikipedia.org/wiki/Insertion_sort">Insertion Sort on Wikipedia</a></li>
                    </ul>
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
    <tr><td>04</td><td>Algorithm Analysis</td><td></td></tr>
</tbody>
</table>