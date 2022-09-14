# TDOSCA-TC13-PLAINHW / release <#1.0.0#>

Copyright (C) 2022 Karsten Reincke / Deutsche Telekom AG

## Content
1. [Purpose](#pur)
2. [Prerequisites](#prq)
3. [Download](#dlo)
4. [Installation](#ins)
5. [Usage](#use)
6. [Licensing](#lic)

## 1. Purpose <a id="pur"></a>
One task of the project [Test-Driven Open Source Compliance Automation](https://github.com/Open-Source-Compliance/tdosca) is to define test cases consisting of program sources and reference compliance artifacts which - added to the program package - would ensure to distribute the open source program compliantly.

The project TDOSCA-TC13-PLAINHW is the software input of the test case no. 13. It is part of the repository *tdosca-tc13-plainhw* and is a ***very plaine hello world*** program.

## 2. Prerequisites <a id="prq"></a>
* operating system
* javare
* gradle


## 3. Download <a id="dlo"></a>

You have tow options to get this test case:

* Clone the respective repository by using the command ``git clone https://github.com/Open-Source-Compliance/tdosca-tc13-plainhw``.
* Download the respective zip file by using the GitHub commands in the [tdosca-tc13-plainhw repository](https://github.com/Open-Source-Compliance/tdosca-tc13-plainhw).

## 4. Installation <a id="ins"></a>
To compile and install the program itself, do this:
* Download and unzip test case package or clone the test case repository
* Change into the directory *input-sources*
* Call
  - ``gradle build`` or  ``gradlew build``

## 5. Usage <a id="use"></a>
* Change into the directory *input-sources*
* Call
  - ``gradle build`` or  ``gradlew build``
  - ``gradle run`` or  ``gradlew run``
  - or
    - ``gradle build``
    - ``unzip build/distributions/tdosca-tc11-plainhw.zip`` and
    - ``tdosca-tc11-plainhw/bin/tdosca-tc11``

## 6. Licensing <a id="lic"></a>

In general, the *input* the project *tdosca-tc13-plainhw* is licensed under the terms of the MIT license (See the file LICENSE in the top directory). But other licenses are also used:
- the gradle scripts (gradle/... gradlw gradlew.bat) which are created by `gradle wrapper` are licensed under the Apache-v2 license (see the file LICENSE.apache-v2 in the top directory).
- the Greeter.java is licensed under the Apache-v2 license (see the file LICENSE.apache-v2 in the top directory)
- the Tipster.java is licensed under the BSD-3Clause license.
