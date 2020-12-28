/*
 * Copyright 2020 Fabio Labella
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dynosaur

import dynosaur.{DynamoValue => V}
import munit.FunSuite

class DynamoValueSuite extends FunSuite {
  def renderCheck(v: V, s: String) =
    assertEquals(v.print.render(40), s)

  test("foo")(assertEquals(true, true))
  // test("Renders numbers") {
  //   val v = V.n(42)

  //   val expected = """
  //      |"N" : { "42" }
  //      """.trim.stripMargin

  //   renderCheck(v, expected)
  // }

  // test("Renders strings") {
  //   val v = V.s("forty-two")

  //   val expected = s"""
  //      |"S" : { "forty-two" }
  //      """.trim.stripMargin

  //   renderCheck(v, expected)
  // }

  // test("Renders bools") {
  //   val v1 = V.bool(true)
  //   val v2 = V.bool(false)

  //   val expected1 = s"""
  //      |{ "BOOL" : true }
  //      """.trim.stripMargin

  //   val expected2 = s"""
  //      |{ "BOOL" : false }
  //      """.trim.stripMargin

  //   renderCheck(v1, expected1)
  //   renderCheck(v2, expected2)
  // }

  // test("Renders null") {
  //   val v = V.nul
  //   val expected = """{ "NULL" : true }"""

  //   renderCheck(v, expected)
  // }
}

// top-level has {}
// each record field is "name" : { } (even if the contents are maps)
// each element of a list is enclosed { }

// An attribute of type String. For example:
// "S": "Hello"

// An attribute of type Number. For example:

// "N": "123.45"

// An attribute of type Binary. For example:
// "B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"

// An attribute of type Null. For example:
// "NULL": true

// An attribute of type String Set. For example:
// "SS": ["Giraffe", "Hippo" ,"Zebra"]

// An attribute of type Number Set. For example:
// "NS": ["42.2", "-19", "7.5", "3.14"]

// An attribute of type Binary Set. For example:
// "BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]

// An attribute of type Map. For example:
// "M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}

// An attribute of type List. For example:
// "L": [{"S": "Cookies"}, {"S": "Coffee"}, {"N": "3.14159"}]

// An attribute of type Boolean. For example:
// "BOOL": true

// composite
// {
//   "id": {
//     "N": "10"
//   },
//   "food": {
//     "SS": ["Rice", "Noodles"]
//    },
//   "age": {"N": "1"},
//   "isThatYou": {"BOOL": true},
//   "attachments": {
//     "L": [
//       {
//         "M": {
//           "fileName": {
//             "S": "myfile.pdf"
//           },
//           "uri": {
//             "S": "https://mything.co.uk/123454"
//           }
//         }
//       }
//     ]
//   },
//   "day": {"S": "Tuesday"},
//   "options": { "NULL": true }
// }
