# Compliance Traps of TDOSCA-TC13-PLAINHW

* This app uses internal classes licensed under different licenses:
  - Default License: M.I.T
  - Main.java :-
    - licensed under the M.I.T
    - only a licensing statement in the file header
    - NO SPDX identifier
  - Greeter.java :-
    - licensed under the A.p.a.c.h.e-2.0
    - license text is LICENSE.A.p.a.c.h.e-2.0 on the top level
    - file contains a licensing statement without SPDX identifier
  - GreeterTest.java :- A.p.a.c.h.e-2.0 (see SPDX id in file header)
  - Tipster.java :- B.S.D-3-Clause (see License text in the header)
  - TipsterTest.java :- B.S.D-3-Clause (no license text, but an SPDX tag)

* On the toplevel the App delivers two license files which must not be confound by the scanning tools
  - named LICENSE (M.I.T = Default License)
  - named LICENSE.A.p.a.c.h.e-2.0 (= valid for Greeter)

* The file LICENSE contains the text of the MIT license but does not explicitly declare that the content is the text of the MIT license

**To sum it up**: *Here we have an irritating overall situation. There is a master license (M.I.T) but only one file (main) falls under it. And there is a 'competing' main license (Apache), which is not a main license, just the license text for one of the files.*

* On the top level, the source repo (= input-sources) offers a NOTICE.md file valid for Greeter

* Additionally the software depends on the external 3rd party components
  * apache-log4j:
    - repository: https://logging.apache.org/log4j/2.x/download.html
    - license: Apache-2.0
    - NOTICE.txt: yes
  * joda-time
    - repository: https://github.com/JodaOrg/joda-time/releases
    - license: Apache-2.0
    - NOTICE.txt: yes
  - The graddle wrapper elements are licensed under the the Apache-v2 license

* Finally the software contains the gradle wrapper script, created by 'gradle wrapper' and the gradle-wrapper.jar  both licensed under the Apache-v2 license (= LICENSE.gradle) => A tool which automatically generates the sufficient compliance artifacts must/should create
  - the artifacts for the repository (= including the gradle artifacts)
  - the artifacts for the tdosca-tc13.jar file (= excluding the gradle artifacts)
* does not contain the gradle-NOTICE-file due to the fact, that the repository [https://github.com/gradle/gradle](https://github.com/gradle/gradle) itself does not contain such a file named NOTICE
