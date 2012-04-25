/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.bric.swing.ColorPicker
import net.java.dev.colorchooser.ColorChooser

/**
 * @author Andres Almiray
 */
class ColorchooserGriffonPlugin {
    // the plugin version
    String version = '0.1'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '0.9.5']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, qt
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-colorchooser-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Color chooser/picker components'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Delivers color chooser/picker components provided by with [ColorChooser][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*       | *Type*                                   |
| ------------ | ---------------------------------------- |
| colorChooser | `net.java.dev.colorchooser.ColorChooser` |
| colorPicker  | `com.bric.swing.ColorPicker`             |

Refer to the Javadocs found in the plugin's distribution to learn more about the properties that can be set on these nodes.

[1]: http://java.net/projects/colorchooser
'''
}
