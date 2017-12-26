# Stream Simple ML [![Build Status](https://travis-ci.org/StreamSimple/ssml.svg?branch=master)](https://travis-ci.org/StreamSimple/ssml)

The project provides simple machine learning helper libraries.

# Dev Setup

Please follow the instructions [here](https://github.com/StreamSimple/uber-poms/wiki/Building-Projects).

# TODO

 - The model reader writes the model to a temp file which is only deleted when the JVM exits. This should be fixed so that a temp file is either never written or is deleted immediately after a model is read and reated.

