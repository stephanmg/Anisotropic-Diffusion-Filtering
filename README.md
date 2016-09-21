Anisotropic-Diffusion-Filtering
========

# Project description
The purpose of this project is to reduce noise and preserve structure in images of human tumour stroma cells acquired by Opal-dye staining multiplexed biomarker imaging. As a prerequisite for further image segmentation and analysis of the cancerogenous tissue sections the noise has to be reduced while structure has to be preserved. The latter is most crucial for further analysis. Therefore an anistropic diffusion equation should be employed, since applying the isotropic diffusion equation to an image is equivalent to a convolution with a Gaussian kernel and thus the edges of the images may not be preserved satisfyingly. Thus the isotropic diffusion equation will be replaced by an anistropic. This should balance between edge preservation and smoothing. At a first glance equations should be solved by a central finite difference scheme and forward Euler time marching method (FTCS). However, since parabolic PDEs incur rather restrictive time steps with explicit schemes it should be investigated if implicit time marching methods will be more efficient (depending on the amount of smoothing which will be required for the images) and if different image filters are applicable respectively will be more appropriate.

# Development

[![Dependency Status](https://www.versioneye.com/user/projects/57e2c990bd6fa6004e11e923/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/57e2c990bd6fa6004e11e923)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/200fa01cf5c0495baffd515c7de66883)](https://www.codacy.com/app/stephan_5/Anisotropic-Diffusion-Filtering?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=stephanmg/Anisotropic-Diffusion-Filtering&amp;utm_campaign=Badge_Grade)
[!Linux / OSX Build Status](https://travis-ci.org/stephanmg/Anisotropic-Diffusion-Filtering.svg?branch=master)](https://travis-ci.org/stephanmg/Anisotropic-Diffusion-Filtering)
[![Windows Build status](https://ci.appveyor.com/api/projects/status/03r2i9tp7rlu2spr/branch/ci?svg=true)](https://ci.appveyor.com/project/stephanmg/Anisotropic-Diffusion-Filtering/branch/master)

## How To Build The Project

## 1. Dependencies

- JDK >= 1.7
- Internet Connection (other dependencies will be downloaded automatically)
- Optional: IDE with [Gradle](http://www.gradle.org/) support

## 2. Build & Install

### IDE

To build the project from an IDE do the following:

- open the  [Gradle](http://www.gradle.org/) project
- call the `build` Gradle task to build
- or: call `clean and build` in your IDE

### Command Line

Building the project from the command line is also possible.

Navigate to the project folder and call either
`./gradle.sh` or CALL `gradlew.bat`

### 3. Run
Execute `Client.java`'s main method.

## Further tasks and ideas
- integrate into VRL-Studio for a GUI
