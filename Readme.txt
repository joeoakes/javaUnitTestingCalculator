assertEquals(expected, actual): Asserts that two values are equal. It uses the equals method for comparison.
assertNotEquals(unexpected, actual): Asserts that two values are not equal.
assertTrue(condition): Asserts that a condition is true.
assertFalse(condition): Asserts that a condition is false.
assertNull(object): Asserts that an object is null.
assertNotNull(object): Asserts that an object is not null.
assertSame(expected, actual): Asserts that two objects reference the same object in memory.
assertNotSame(unexpected, actual): Asserts that two objects do not reference the same object in memory.
assertArrayEquals(expectedArray, actualArray): Asserts that two arrays are equal.
assertIterableEquals(expectedIterable, actualIterable): Asserts that two Iterable objects are equal in terms of elements.
assertLinesMatch(expected, actual): Asserts that two lists of strings match line by line.
assertThrows(exceptionType, executable): Asserts that a specific exception is thrown when the provided executable is executed.
assertTimeout(duration, executable): Asserts that the provided executable completes within the specified duration.