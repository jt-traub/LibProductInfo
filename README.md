### LibProductInfo

#### Build status
[![Build status](https://ci.appveyor.com/api/projects/status/yi9vojl7q4d8bobn?svg=true)](https://ci.appveyor.com/project/jt-traub/libproductinfo)

#### Overview
This library parses a flat-file fixed column input and produces a
list of product records for use by other systems.  The specification
for the input/output records is [here](https://github.com/Swiftly-Systems/code-exercise-services/blob/master/ProductInformationIntegrationSpec.md)

#### Usage
This library contains a driver app/main program in order to allow
demonstration of it's functionality.

The library expects a stream of strings, each string conforming to
a well-formed line of input as defined in the spec.  It will return
a list of ProductRecords.

To use run:
```java -jar LibProductInfo-<version>.jar <filename>```

If no filename is provided, the driver will prompt for a file to
use for input and will process that given file.

After converting the file, the driver will output the list of
records in textual form to the console.

#### Documentation
// TODO

#### License & Copyright
This code is copyright (c) 2019-2020 Joseph L Traub

This code is licensed under the public domain.

#### Fitness for use
The author makes no warranty, express or implied, on this code for any use or application.