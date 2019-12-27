### LibProductInfo

#### Build status
[![Build status](https://ci.appveyor.com/api/projects/status/yi9vojl7q4d8bobn?svg=true)](https://ci.appveyor.com/project/jt-traub/libproductinfo)

#### Overview
This library parses a flat-file fixed column input and produces a
list of product records for use by other systems.

#### License & Copyright
This code is copyright (c) 2019-2020 Joseph L Traub

This code is licensed under the public domain.

#### Usage
This library contains a driver app/main program in order to allow
demonstration of it's functionality.

To use run:
```java -jar LibProductInfo-<version>.jar <filename>```

If no filename is provided, the driver will prompt for a file to
use for input and will process that given file.

On output, the library will return a list of ProductRecord objects
and will dump them to the console in JSON format

#### Fitness for use
The author makes no warranty on this code for any use or application.