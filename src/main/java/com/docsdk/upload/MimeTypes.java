package com.docsdk.upload;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MimeTypes {

	private static HashMap<String, Object> mimeTypeMapping;
	private static HashMap<String, Object> extNameMapping;

	static {
		mimeTypeMapping = new HashMap<String, Object>(200) {
			private void put1(String key, Object value) {
				if (put(key, value) != null) {
					throw new IllegalArgumentException("Duplicated extension: "
							+ key);
				}
			}

			{
				put1("application/acad",
						Arrays.asList(new String[] { "dwg", "dws", "dwt" }));

				put1("application/applixware", "aw");
				put1("application/arj", "arj");
				put1("application/atom+xml", "xml");
				put1("application/atomcat+xml", "atomcat");
				put1("application/atomsvc+xml", "atomsvc");
				put1("application/base64",
						Arrays.asList(new String[] { "mm", "mme" }));
				put1("application/binhex", "hqx");
				put1("application/binhex4", "hqx");
				put1("application/book",
						Arrays.asList(new String[] { "book", "boo" }));
				put1("application/ccxml+xml);", "ccxml");
				put1("application/cdf", "cdf");
				put1("application/cdmi-capability", "cdmia");
				put1("application/cdmi-container", "cdmic");
				put1("application/cdmi-domain", "cdmid");
				put1("application/cdmi-object", "cdmio");
				put1("application/cdmi-queue", "cdmiq");
				put1("application/clariscad", "ccad");
				put1("application/commonground", "dp");
				put1("application/cu-seeme", "cu");
				put1("application/davmount+xml", "davmount");
				put1("application/drafting", "drw");
				put1("application/dsptype", "tsp");
				put1("application/dssc+der", "dssc");
				put1("application/dssc+xml", "xdssc");
				put1("application/dxf", "dxf");
				put1("application/ecmascript",
						Arrays.asList(new String[] { "js", "es" }));
				put1("application/emma+xml", "emma");
				put1("application/envoy", "evy");
				put1("application/epub+zip", "epub");
				put1("application/excel",
						Arrays.asList(new String[] { "xls", "xl", "xla", "xlb",
								"xlc", "xld", "xlk", "xll", "xlm", "xlt",
								"xlv", "xlw" }));
				put1("application/exi", "exi");
				put1("application/font-tdpfr", "pfr");
				put1("application/fractals", "fif");
				put1("application/freeloader", "frl");
				put1("application/futuresplash", "spl");
				put1("application/gnutar", "tgz");
				put1("application/groupwise", "vew");
				put1("application/hlp", "hlp");
				put1("application/hta", "hta");
				put1("application/hyperstudio", "stk");
				put1("application/i-deas", "unv");
				put1("application/iges",
						Arrays.asList(new String[] { "iges", "igs" }));
				put1("application/inf", "inf");
				put1("application/internet-property-stream", "acx");
				put1("application/ipfix", "ipfix");
				put1("application/java", "class");
				put1("application/java-archive", "jar");
				put1("application/java-byte-code", "class");
				put1("application/java-serialized-object", "ser");
				put1("application/java-vm", "class");
				put1("application/javascript", "js");
				put1("application/json", "json");
				put1("application/lha", "lha");
				put1("application/lzx", "lzx");
				put1("application/mac-binary", "bin");
				put1("application/mac-binhex", "hqx");
				put1("application/mac-binhex40", "hqx");
				put1("application/mac-compactpro", "cpt");
				put1("application/macbinary", "bin");
				put1("application/mads+xml", "mads");
				put1("application/marc", "mrc");
				put1("application/marcxml+xml", "mrcx");
				put1("application/mathematica", "ma");
				put1("application/mathml+xml", "mathml");
				put1("application/mbedlet", "mbd");
				put1("application/mbox", "mbox");
				put1("application/mcad", "mcd");
				put1("application/mediaservercontrol+xml", "mscml");
				put1("application/metalink4+xml", "meta4");
				put1("application/mets+xml", "mets");
				put1("application/mime", "aps");
				put1("application/mods+xml", "mods");
				put1("application/mp21", "m21");
				put1("application/mp4", "mp4");
				put1("application/mspowerpoint", Arrays.asList(new String[] {
						"ppt", "pot", "pps", "ppz" }));
				put1("application/msword",
						Arrays.asList(new String[] { "doc", "dot", "w6w",
								"wiz", "word" }));
				put1("application/mswrite", "wri");
				put1("application/mxf", "mxf");
				put1("application/netmc", "mcp");
				put1("application/octet-stream",
						Arrays.asList(new String[] { "*" }));
				put1("application/oda", "oda");
				put1("application/oebps-package+xml", "opf");
				put1("application/ogg", "ogx");
				put1("application/olescript", "axs");
				put1("application/onenote", "onetoc");
				put1("application/patch-ops-error+xml", "xer");
				put1("application/pdf", "pdf");
				put1("application/pgp-encrypted", "asc");
				put1("application/pgp-signature", "pgp");
				put1("application/pics-rules", "prf");
				put1("application/pkcs-12", "p12");
				put1("application/pkcs-crl", "crl");
				put1("application/pkcs10", "p10");
				put1("application/pkcs7-mime",
						Arrays.asList(new String[] { "p7c", "p7m" }));
				put1("application/pkcs7-signature", "p7s");
				put1("application/pkcs8", "p8");
				put1("application/pkix-attr-cert", "ac");
				put1("application/pkix-cert",
						Arrays.asList(new String[] { "cer", "crt" }));
				put1("application/pkix-crl", "crl");
				put1("application/pkix-pkipath", "pkipath");
				put1("application/pkixcmp", "pki");
				put1("application/plain", "text");
				put1("application/pls+xml", "pls");
				put1("application/postscript",
						Arrays.asList(new String[] { "ps", "ai", "eps" }));
				put1("application/powerpoint", "ppt");
				put1("application/pro_eng",
						Arrays.asList(new String[] { "part", "prt" }));
				put1("application/prs.cww", "cww");
				put1("application/pskc+xml", "pskcxml");
				put1("application/rdf+xml", "rdf");
				put1("application/reginfo+xml", "rif");
				put1("application/relax-ng-compact-syntax", "rnc");
				put1("application/resource-lists+xml", "rl");
				put1("application/resource-lists-diff+xml", "rld");
				put1("application/ringing-tones", "rng");
				put1("application/rls-services+xml", "rs");
				put1("application/rsd+xml", "rsd");
				put1("application/rss+xml", "xml");
				put1("application/rtf",
						Arrays.asList(new String[] { "rtf", "rtx" }));
				put1("application/sbml+xml", "sbml");
				put1("application/scvp-cv-request", "scq");
				put1("application/scvp-cv-response", "scs");
				put1("application/scvp-vp-request", "spq");
				put1("application/scvp-vp-response", "spp");
				put1("application/sdp", "sdp");
				put1("application/sea", "sea");
				put1("application/set", "set");
				put1("application/set-payment-initiation", "setpay");
				put1("application/set-registration-initiation", "setreg");
				put1("application/shf+xml", "shf");
				put1("application/sla", "stl");
				put1("application/smil",
						Arrays.asList(new String[] { "smi", "smil" }));
				put1("application/smil+xml", "smi");
				put1("application/solids", "sol");
				put1("application/sounder", "sdr");
				put1("application/sparql-query", "rq");
				put1("application/sparql-results+xml", "srx");
				put1("application/srgs", "gram");
				put1("application/srgs+xml", "grxml");
				put1("application/sru+xml", "sru");
				put1("application/ssml+xml", "ssml");
				put1("application/step",
						Arrays.asList(new String[] { "step", "stp" }));
				put1("application/streamingmedia", "ssm");
				put1("application/tei+xml", "tei");
				put1("application/thraud+xml", "tfi");
				put1("application/timestamped-data", "tsd");
				put1("application/toolbook", "tbk");
				put1("application/vda", "vda");
				put1("application/vnd.3gpp.pic-bw-large", "plb");
				put1("application/vnd.3gpp.pic-bw-small", "psb");
				put1("application/vnd.3gpp.pic-bw-var", "pvb");
				put1("application/vnd.3gpp2.tcap", "tcap");
				put1("application/vnd.3m.post-it-notes", "pwn");
				put1("application/vnd.accpac.simply.aso", "aso");
				put1("application/vnd.accpac.simply.imp", "imp");
				put1("application/vnd.acucobol", "acu");
				put1("application/vnd.acucorp", "atc");
				put1("application/vnd.adobe.air-application-installer-package+zip",
						"air");
				put1("application/vnd.adobe.fxp", "fxp");
				put1("application/vnd.adobe.xdp+xml", "xdp");
				put1("application/vnd.adobe.xfdf", "xfdf");
				put1("application/vnd.ahead.space", "ahead");
				put1("application/vnd.airzip.filesecure.azf", "azf");
				put1("application/vnd.airzip.filesecure.azs", "azs");
				put1("application/vnd.amazon.ebook", "azw");
				put1("application/vnd.americandynamics.acc", "acc");
				put1("application/vnd.amiga.ami", "ami");
				put1("application/vnd.android.package-archive", "apk");
				put1("application/vnd.anser-web-certificate-issue-initiation",
						"cii");
				put1("application/vnd.anser-web-funds-transfer-initiation",
						"fti");
				put1("application/vnd.antix.game-component", "atx");
				put1("application/vnd.apple.installer+xml", "mpkg");
				put1("application/vnd.apple.mpegurl", "m3u8");
				put1("application/vnd.aristanetworks.swi", "swi");
				put1("application/vnd.audiograph", "aep");
				put1("application/vnd.blueice.multipass", "mpm");
				put1("application/vnd.bmi", "bmi");
				put1("application/vnd.businessobjects", "rep");
				put1("application/vnd.chemdraw+xml", "cdxml");
				put1("application/vnd.chipnuts.karaoke-mmd", "mmd");
				put1("application/vnd.cinderella", "cdy");
				put1("application/vnd.claymore", "cla");
				put1("application/vnd.cloanto.rp9", "rp9");
				put1("application/vnd.clonk.c4group", "c4g");
				put1("application/vnd.cluetrust.cartomobile-config", "c11amc");
				put1("application/vnd.cluetrust.cartomobile-config-pkg",
						"c11amz");
				put1("application/vnd.commonspace", "csp");
				put1("application/vnd.contact.cmsg", "cdbcmsg");
				put1("application/vnd.cosmocaller", "cmc");
				put1("application/vnd.crick.clicker", "clkx");
				put1("application/vnd.crick.clicker.keyboard", "clkk");
				put1("application/vnd.crick.clicker.palette", "clkp");
				put1("application/vnd.crick.clicker.template", "clkt");
				put1("application/vnd.crick.clicker.wordbank", "clkw");
				put1("application/vnd.criticaltools.wbs+xml", "wbs");
				put1("application/vnd.ctc-posml", "pml");
				put1("application/vnd.cups-ppd", "ppd");
				put1("application/vnd.curl.car", "car");
				put1("application/vnd.curl.pcurl", "pcurl");
				put1("application/vnd.data-vision.rdz", "rdz");
				put1("application/vnd.denovo.fcselayout-link", "fe_launch");
				put1("application/vnd.dna", "dna");
				put1("application/vnd.dolby.mlp", "mlp");
				put1("application/vnd.dpgraph", "dpg");
				put1("application/vnd.dreamfactory", "dfac");
				put1("application/vnd.dvb.ait", "ait");
				put1("application/vnd.dvb.service", "svc");
				put1("application/vnd.dynageo", "geo");
				put1("application/vnd.ecowin.chart", "mag");
				put1("application/vnd.enliven", "nml");
				put1("application/vnd.epson.esf", "esf");
				put1("application/vnd.epson.msf", "msf");
				put1("application/vnd.epson.quickanime", "qam");
				put1("application/vnd.epson.salt", "slt");
				put1("application/vnd.epson.ssf", "ssf");
				put1("application/vnd.eszigno3+xml", "es3");
				put1("application/vnd.ezpix-album", "ez2");
				put1("application/vnd.ezpix-package", "ez3");
				put1("application/vnd.fdf", "fdf");
				put1("application/vnd.fdsn.seed", "seed");
				put1("application/vnd.flographit", "gph");
				put1("application/vnd.fluxtime.clip", "ftc");
				put1("application/vnd.framemaker", "fm");
				put1("application/vnd.frogans.fnc", "fnc");
				put1("application/vnd.frogans.ltf", "ltf");
				put1("application/vnd.fsc.weblaunch", "fsc");
				put1("application/vnd.fujitsu.oasys", "oas");
				put1("application/vnd.fujitsu.oasys2", "oa2");
				put1("application/vnd.fujitsu.oasys3", "oa3");
				put1("application/vnd.fujitsu.oasysgp", "fg5");
				put1("application/vnd.fujitsu.oasysprs", "bh2");
				put1("application/vnd.fujixerox.ddd", "ddd");
				put1("application/vnd.fujixerox.docuworks", "xdw");
				put1("application/vnd.fujixerox.docuworks.binder", "xbd");
				put1("application/vnd.fuzzysheet", "fzs");
				put1("application/vnd.genomatix.tuxedo", "txd");
				put1("application/vnd.geogebra.file", "ggb");
				put1("application/vnd.geogebra.tool", "ggt");
				put1("application/vnd.geometry-explorer", "gex");
				put1("application/vnd.geonext", "gxt");
				put1("application/vnd.geoplan", "g2w");
				put1("application/vnd.geospace", "g3w");
				put1("application/vnd.gmx", "gmx");
				put1("application/vnd.google-earth.kml+xml", "kml");
				put1("application/vnd.google-earth.kmz", "kmz");
				put1("application/vnd.grafeq", "gqf");
				put1("application/vnd.groove-account", "gac");
				put1("application/vnd.groove-help", "ghf");
				put1("application/vnd.groove-identity-message", "gim");
				put1("application/vnd.groove-injector", "grv");
				put1("application/vnd.groove-tool-message", "gtm");
				put1("application/vnd.groove-tool-template", "tpl");
				put1("application/vnd.groove-vcard", "vcg");
				put1("application/vnd.hal+xml", "hal");
				put1("application/vnd.handheld-entertainment+xml", "zmm");
				put1("application/vnd.hbci", "hbci");
				put1("application/vnd.hhe.lesson-player", "les");
				put1("application/vnd.hp-hpgl",
						Arrays.asList(new String[] { "hgl", "hpg", "hpgl" }));
				put1("application/vnd.hp-hpid", "hpid");
				put1("application/vnd.hp-hps", "hps");
				put1("application/vnd.hp-jlyt", "jlt");
				put1("application/vnd.hp-pcl", "pcl");
				put1("application/vnd.hp-pclxl", "pclxl");
				put1("application/vnd.hydrostatix.sof-data", "sfd-hdstx");
				put1("application/vnd.hzn-3d-crossword", "x3d");
				put1("application/vnd.ibm.minipay", "mpy");
				put1("application/vnd.ibm.modcap", "afp");
				put1("application/vnd.ibm.rights-management", "irm");
				put1("application/vnd.ibm.secure-container", "sc");
				put1("application/vnd.iccprofile", "icc");
				put1("application/vnd.igloader", "igl");
				put1("application/vnd.immervision-ivp", "ivp");
				put1("application/vnd.immervision-ivu", "ivu");
				put1("application/vnd.insors.igm", "igm");
				put1("application/vnd.intercon.formnet", "xpw");
				put1("application/vnd.intergeo", "i2g");
				put1("application/vnd.intu.qbo", "qbo");
				put1("application/vnd.intu.qfx", "qfx");
				put1("application/vnd.ipunplugged.rcprofile", "rcprofile");
				put1("application/vnd.irepository.package+xml", "irp");
				put1("application/vnd.is-xpr", "xpr");
				put1("application/vnd.isac.fcs", "fcs");
				put1("application/vnd.jam", "jam");
				put1("application/vnd.jcp.javame.midlet-rms", "rms");
				put1("application/vnd.jisp", "jisp");
				put1("application/vnd.joost.joda-archive", "joda");
				put1("application/vnd.kahootz", "ktz");
				put1("application/vnd.kde.karbon", "karbon");
				put1("application/vnd.kde.kchart", "chrt");
				put1("application/vnd.kde.kformula", "kfo");
				put1("application/vnd.kde.kivio", "flw");
				put1("application/vnd.kde.kontour", "kon");
				put1("application/vnd.kde.kpresenter", "kpr");
				put1("application/vnd.kde.kspread", "ksp");
				put1("application/vnd.kde.kword", "kwd");
				put1("application/vnd.kenameaapp", "htke");
				put1("application/vnd.kidspiration", "kia");
				put1("application/vnd.kinar", "kne");
				put1("application/vnd.koan", "skp");
				put1("application/vnd.kodak-descriptor", "sse");
				put1("application/vnd.las.las+xml", "lasxml");
				put1("application/vnd.llamagraphics.life-balance.desktop",
						"lbd");
				put1("application/vnd.llamagraphics.life-balance.exchange+xml",
						"lbe");
				put1("application/vnd.lotus-1-2-3", "123");
				put1("application/vnd.lotus-approach", "apr");
				put1("application/vnd.lotus-freelance", "pre");
				put1("application/vnd.lotus-notes", "nsf");
				put1("application/vnd.lotus-organizer", "org");
				put1("application/vnd.lotus-screencam", "scm");
				put1("application/vnd.lotus-wordpro", "lwp");
				put1("application/vnd.macports.portpkg", "portpkg");
				put1("application/vnd.mcd", "mcd");
				put1("application/vnd.medcalcdata", "mc1");
				put1("application/vnd.mediastation.cdkey", "cdkey");
				put1("application/vnd.mfer", "mwf");
				put1("application/vnd.mfmp", "mfm");
				put1("application/vnd.micrografx.flo", "flo");
				put1("application/vnd.micrografx.igx", "igx");
				put1("application/vnd.mif", "mif");
				put1("application/vnd.mobius.daf", "daf");
				put1("application/vnd.mobius.dis", "dis");
				put1("application/vnd.mobius.mbk", "mbk");
				put1("application/vnd.mobius.mqy", "mqy");
				put1("application/vnd.mobius.msl", "msl");
				put1("application/vnd.mobius.plc", "plc");
				put1("application/vnd.mobius.txf", "txf");
				put1("application/vnd.mophun.application", "mpn");
				put1("application/vnd.mophun.certificate", "mpc");
				put1("application/vnd.mozilla.xul+xml", "xul");
				put1("application/vnd.ms-artgalry", "cil");
				put1("application/vnd.ms-cab-compressed", "cab");
				put1("application/vnd.ms-excel",
						Arrays.asList(new String[] { "xls", "xla", "xlc",
								"xlm", "xlt", "xlw", "xlb", "xll" }));
				put1("application/vnd.ms-excel.addin.macroenabled.12", "xlam");
				put1("application/vnd.ms-excel.sheet.binary.macroenabled.12",
						"xlsb");
				put1("application/vnd.ms-excel.sheet.macroenabled.12", "xlsm");
				put1("application/vnd.ms-excel.template.macroenabled.12",
						"xltm");
				put1("application/vnd.ms-fontobject", "eot");
				put1("application/vnd.ms-htmlhelp", "chm");
				put1("application/vnd.ms-ims", "ims");
				put1("application/vnd.ms-lrm", "lrm");
				put1("application/vnd.ms-officetheme", "thmx");
				put1("application/vnd.ms-outlook", "msg");
				put1("application/vnd.ms-pki.certstore", "sst");
				put1("application/vnd.ms-pki.pko", "pko");
				put1("application/vnd.ms-pki.seccat", "cat");
				put1("application/vnd.ms-pki.stl", "stl");
				put1("application/vnd.ms-pkicertstore", "sst");
				put1("application/vnd.ms-pkiseccat", "cat");
				put1("application/vnd.ms-pkistl", "stl");
				put1("application/vnd.ms-powerpoint",
						Arrays.asList(new String[] { "ppt", "pot", "pps",
								"ppa", "pwz" }));
				put1("application/vnd.ms-powerpoint.addin.macroenabled.12",
						"ppam");
				put1("application/vnd.ms-powerpoint.presentation.macroenabled.12",
						"pptm");
				put1("application/vnd.ms-powerpoint.slide.macroenabled.12",
						"sldm");
				put1("application/vnd.ms-powerpoint.slideshow.macroenabled.12",
						"ppsm");
				put1("application/vnd.ms-powerpoint.template.macroenabled.12",
						"potm");
				put1("application/vnd.ms-project", "mpp");
				put1("application/vnd.ms-word.document.macroenabled.12", "docm");
				put1("application/vnd.ms-word.template.macroenabled.12", "dotm");
				put1("application/vnd.ms-works", Arrays.asList(new String[] {
						"wps", "wks", "wcm", "wdb" }));
				put1("application/vnd.ms-wpl", "wpl");
				put1("application/vnd.ms-xpsdocument", "xps");
				put1("application/vnd.mseq", "mseq");
				put1("application/vnd.musician", "mus");
				put1("application/vnd.muvee.style", "msty");
				put1("application/vnd.neurolanguage.nlu", "nlu");
				put1("application/vnd.noblenet-directory", "nnd");
				put1("application/vnd.noblenet-sealer", "nns");
				put1("application/vnd.noblenet-web", "nnw");
				put1("application/vnd.nokia.configuration-message", "ncm");
				put1("application/vnd.nokia.n-gage.data", "ngdat");
				put1("application/vnd.nokia.n-gage.symbian.install", "n-gage");
				put1("application/vnd.nokia.radio-preset", "rpst");
				put1("application/vnd.nokia.radio-presets", "rpss");
				put1("application/vnd.nokia.ringing-tone", "rng");
				put1("application/vnd.novadigm.edm", "edm");
				put1("application/vnd.novadigm.edx", "edx");
				put1("application/vnd.novadigm.ext", "ext");
				put1("application/vnd.oasis.opendocument.chart", "odc");
				put1("application/vnd.oasis.opendocument.chart-template", "otc");
				put1("application/vnd.oasis.opendocument.database", "odb");
				put1("application/vnd.oasis.opendocument.formula", "odf");
				put1("application/vnd.oasis.opendocument.formula-template",
						"odft");
				put1("application/vnd.oasis.opendocument.graphics", "odg");
				put1("application/vnd.oasis.opendocument.graphics-template",
						"otg");
				put1("application/vnd.oasis.opendocument.image", "odi");
				put1("application/vnd.oasis.opendocument.image-template", "oti");
				put1("application/vnd.oasis.opendocument.presentation", "odp");
				put1("application/vnd.oasis.opendocument.presentation-template",
						"otp");
				put1("application/vnd.oasis.opendocument.spreadsheet", "ods");
				put1("application/vnd.oasis.opendocument.spreadsheet-template",
						"ots");
				put1("application/vnd.oasis.opendocument.text", "odt");
				put1("application/vnd.oasis.opendocument.text-master", "odm");
				put1("application/vnd.oasis.opendocument.text-template", "ott");
				put1("application/vnd.oasis.opendocument.text-web", "oth");
				put1("application/vnd.olpc-sugar", "xo");
				put1("application/vnd.oma.dd2+xml", "dd2");
				put1("application/vnd.openofficeorg.extension", "oxt");
				put1("application/vnd.openxmlformats-officedocument.presentationml.presentation",
						"pptx");
				put1("application/vnd.openxmlformats-officedocument.presentationml.slide",
						"sldx");
				put1("application/vnd.openxmlformats-officedocument.presentationml.slideshow",
						"ppsx");
				put1("application/vnd.openxmlformats-officedocument.presentationml.template",
						"potx");
				put1("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
						"xlsx");
				put1("application/vnd.openxmlformats-officedocument.spreadsheetml.template",
						"xltx");
				put1("application/vnd.openxmlformats-officedocument.wordprocessingml.document",
						"docx");
				put1("application/vnd.openxmlformats-officedocument.wordprocessingml.template",
						"dotx");
				put1("application/vnd.osgeo.mapguide.package", "mgp");
				put1("application/vnd.osgi.dp", "dp");
				put1("application/vnd.palm", "pdb");
				put1("application/vnd.pawaafile", "paw");
				put1("application/vnd.pg.format", "str");
				put1("application/vnd.pg.osasli", "ei6");
				put1("application/vnd.picsel", "efif");
				put1("application/vnd.pmi.widget", "wg");
				put1("application/vnd.pocketlearn", "plf");
				put1("application/vnd.powerbuilder6", "pbd");
				put1("application/vnd.previewsystems.box", "box");
				put1("application/vnd.proteus.magazine", "mgz");
				put1("application/vnd.publishare-delta-tree", "qps");
				put1("application/vnd.pvi.ptid1", "ptid");
				put1("application/vnd.quark.quarkxpress", "qxd");
				put1("application/vnd.realvnc.bed", "bed");
				put1("application/vnd.recordare.musicxml", "mxl");
				put1("application/vnd.recordare.musicxml+xml", "musicxml");
				put1("application/vnd.rig.cryptonote", "cryptonote");
				put1("application/vnd.rim.cod", "cod");
				put1("application/vnd.rn-realmedia", "rm");
				put1("application/vnd.rn-realplayer", "rnx");
				put1("application/vnd.route66.link66+xml", "link66");
				put1("application/vnd.sailingtracker.track", "st");
				put1("application/vnd.seemail", "see");
				put1("application/vnd.sema", "sema");
				put1("application/vnd.semd", "semd");
				put1("application/vnd.semf", "semf");
				put1("application/vnd.shana.informed.formdata", "ifm");
				put1("application/vnd.shana.informed.formtemplate", "itp");
				put1("application/vnd.shana.informed.interchange", "iif");
				put1("application/vnd.shana.informed.package", "ipk");
				put1("application/vnd.simtech-mindmapper", "twd");
				put1("application/vnd.smaf", "mmf");
				put1("application/vnd.smart.teacher", "teacher");
				put1("application/vnd.solent.sdkm+xml", "sdkm");
				put1("application/vnd.spotfire.dxp", "dxp");
				put1("application/vnd.spotfire.sfs", "sfs");
				put1("application/vnd.stardivision.calc", "sdc");
				put1("application/vnd.stardivision.draw", "sda");
				put1("application/vnd.stardivision.impress", "sdd");
				put1("application/vnd.stardivision.math", "smf");
				put1("application/vnd.stardivision.writer", "sdw");
				put1("application/vnd.stardivision.writer-global", "sgl");
				put1("application/vnd.stepmania.stepchart", "sm");
				put1("application/vnd.sun.xml.calc", "sxc");
				put1("application/vnd.sun.xml.calc.template", "stc");
				put1("application/vnd.sun.xml.draw", "sxd");
				put1("application/vnd.sun.xml.draw.template", "std");
				put1("application/vnd.sun.xml.impress", "sxi");
				put1("application/vnd.sun.xml.impress.template", "sti");
				put1("application/vnd.sun.xml.math", "sxm");
				put1("application/vnd.sun.xml.writer", "sxw");
				put1("application/vnd.sun.xml.writer.global", "sxg");
				put1("application/vnd.sun.xml.writer.template", "stw");
				put1("application/vnd.sus-calendar", "sus");
				put1("application/vnd.svd", "svd");
				put1("application/vnd.symbian.install", "sis");
				put1("application/vnd.syncml+xml", "xsm");
				put1("application/vnd.syncml.dm+wbxml", "bdm");
				put1("application/vnd.syncml.dm+xml", "xdm");
				put1("application/vnd.tao.intent-module-archive", "tao");
				put1("application/vnd.tmobile-livetv", "tmo");
				put1("application/vnd.trid.tpt", "tpt");
				put1("application/vnd.triscape.mxs", "mxs");
				put1("application/vnd.trueapp", "tra");
				put1("application/vnd.ufdl", "ufd");
				put1("application/vnd.uiq.theme", "utz");
				put1("application/vnd.umajin", "umj");
				put1("application/vnd.unity", "unityweb");
				put1("application/vnd.uoml+xml", "uoml");
				put1("application/vnd.vcx", "vcx");
				put1("application/vnd.visio", "vsd");
				put1("application/vnd.visionary", "vis");
				put1("application/vnd.vsf", "vsf");
				put1("application/vnd.wap.wbxml", "wbxml");
				put1("application/vnd.wap.wmlc", "wmlc");
				put1("application/vnd.wap.wmlscriptc", "wmlsc");
				put1("application/vnd.webturbo", "wtb");
				put1("application/vnd.wolfram.player", "nbp");
				put1("application/vnd.wordperfect", "wpd");
				put1("application/vnd.wqd", "wqd");
				put1("application/vnd.wt.stf", "stf");
				put1("application/vnd.xara",
						Arrays.asList(new String[] { "web", "xar" }));
				put1("application/vnd.xfdl", "xfdl");
				put1("application/vnd.yamaha.hv-dic", "hvd");
				put1("application/vnd.yamaha.hv-script", "hvs");
				put1("application/vnd.yamaha.hv-voice", "hvp");
				put1("application/vnd.yamaha.openscoreformat", "osf");
				put1("application/vnd.yamaha.openscoreformat.osfpvg+xml",
						"osfpvg");
				put1("application/vnd.yamaha.smaf-audio", "saf");
				put1("application/vnd.yamaha.smaf-phrase", "spf");
				put1("application/vnd.yellowriver-custom-menu", "cmp");
				put1("application/vnd.zul", "zir");
				put1("application/vnd.zzazz.deck+xml", "zaz");
				put1("application/vocaltec-media-desc", "vmd");
				put1("application/vocaltec-media-file", "vmf");
				put1("application/voicexml+xml", "vxml");
				put1("application/widget", "wgt");
				put1("application/winhlp", "hlp");
				put1("application/wordperfect", Arrays.asList(new String[] {
						"wp", "wp5", "wp6", "wpd" }));
				put1("application/wordperfect6.0",
						Arrays.asList(new String[] { "w60", "wp5" }));
				put1("application/wordperfect6.1", "w61");
				put1("application/wsdl+xml", "wsdl");
				put1("application/wspolicy+xml", "wspolicy");
				put1("application/x-123", "wk1");
				put1("application/x-7z-compressed", "7z");
				put1("application/x-abiword", "abw");
				put1("application/x-ace-compressed", "ace");
				put1("application/x-aim", "aim");
				put1("application/x-authorware-bin", "aab");
				put1("application/x-authorware-map", "aam");
				put1("application/x-authorware-seg", "aas");
				put1("application/x-bcpio", "bcpio");
				put1("application/x-binary", "bin");
				put1("application/x-binhex40", "hqx");
				put1("application/x-bittorrent", "torrent");
				put1("application/x-bsh",
						Arrays.asList(new String[] { "bsh", "sh", "shar" }));
				put1("application/x-bytecode.elisp", "elc");
				put1("applicaiton/x-bytecode.python", "pyc");
				put1("application/x-bzip", "bz");
				put1("application/x-bzip2",
						Arrays.asList(new String[] { "boz", "bz2" }));
				put1("application/x-cdf", "cdf");
				put1("application/x-cdlink", "vcd");
				put1("application/x-chat",
						Arrays.asList(new String[] { "cha", "chat" }));
				put1("application/x-chess-pgn", "pgn");
				put1("application/x-cmu-raster", "ras");
				put1("application/x-cocoa", "cco");
				put1("application/x-compactpro", "cpt");
				put1("application/x-compress", "z");
				put1("application/x-compressed",
						Arrays.asList(new String[] { "tgz", "gz", "z", "zip" }));
				put1("application/x-conference", "nsc");
				put1("application/x-cpio", "cpio");
				put1("application/x-cpt", "cpt");
				put1("application/x-csh", "csh");
				put1("application/x-debian-package", "deb");
				put1("application/x-deepv", "deepv");
				put1("application/x-director",
						Arrays.asList(new String[] { "dir", "dcr", "dxr" }));
				put1("application/x-doom", "wad");
				put1("application/x-dtbncx+xml", "ncx");
				put1("application/x-dtbook+xml", "dtb");
				put1("application/x-dtbresource+xml", "res");
				put1("application/x-dvi", "dvi");
				put1("application/x-elc", "elc");
				put1("application/x-envoy",
						Arrays.asList(new String[] { "env", "evy" }));
				put1("application/x-esrehber", "es");
				put1("application/x-excel",
						Arrays.asList(new String[] { "xls", "xla", "xlb",
								"xlc", "xld", "xlk", "xll", "xlm", "xlt",
								"xlv", "xlw" }));
				put1("application/x-font-bdf", "bdf");
				put1("application/x-font-ghostscript", "gsf");
				put1("application/x-font-linux-psf", "psf");
				put1("application/x-font-otf", "otf");
				put1("application/x-font-pcf", "pcf");
				put1("application/x-font-snf", "snf");
				put1("application/x-font-ttf", "ttf");
				put1("application/x-font-type1", "pfa");
				put1("application/x-font-woff", "woff");
				put1("application/x-frame", "mif");
				put1("application/x-freelance", "pre");
				put1("application/x-futuresplash", "spl");
				put1("application/x-gnumeric", "gnumeric");
				put1("application/x-gsp", "gsp");
				put1("application/x-gss", "gss");
				put1("application/x-gtar", "gtar");
				put1("application/x-gzip",
						Arrays.asList(new String[] { "gz", "gzip" }));
				put1("application/x-hdf", "hdf");
				put1("application/x-helpfile",
						Arrays.asList(new String[] { "help", "hlp" }));
				put1("application/x-httpd-imap", "imap");
				put1("application/x-ima", "ima");
				put1("application/x-internet-signup",
						Arrays.asList(new String[] { "ins", "isp" }));
				put1("application/x-internett-signup", "ins");
				put1("application/x-inventor", "iv");
				put1("application/x-ip2", "ip");
				put1("application/x-iphone", "iii");
				put1("application/x-java-class", "class");
				put1("application/x-java-commerce", "jcm");
				put1("application/x-java-jnlp-file", "jnlp");
				put1("application/x-javascript", "js");
				put1("application/x-koan", Arrays.asList(new String[] { "skd",
						"skm", "skp", "skt" }));
				put1("application/x-ksh", "ksh");
				put1("application/x-latex",
						Arrays.asList(new String[] { "latex", "ltx" }));
				put1("application/x-lha", "lha");
				put1("application/x-lisp", "lsp");
				put1("application/x-livescreen", "ivy");
				put1("application/x-lotus", "wq1");
				put1("application/x-lotusscreencam", "scm");
				put1("application/x-lzh", "lzh");
				put1("application/x-lzx", "lzx");
				put1("application/x-mac-binhex40", "hqx");
				put1("application/x-macbinary", "bin");
				put1("application/x-magic-cap-package-1.0", "mc$");
				put1("application/x-mathcad", "mcd");
				put1("application/x-meme", "mm");
				put1("application/x-midi",
						Arrays.asList(new String[] { "mid", "midi" }));
				put1("application/x-mif", "mif");
				put1("application/x-mix-transfer", "nix");
				put1("application/x-mobipocket-ebook", "prc");
				put1("application/x-mplayer2", "asx");
				put1("application/x-ms-application", "application");
				put1("application/x-ms-wmd", "wmd");
				put1("application/x-ms-wmz", "wmz");
				put1("application/x-ms-xbap", "xbap");
				put1("application/x-msaccess", "mdb");
				put1("application/x-msbinder", "obd");
				put1("application/x-mscardfile", "crd");
				put1("application/x-msclip", "clp");
				put1("application/x-msdownload",
						Arrays.asList(new String[] { "exe", "dll" }));
				put1("application/x-msexcel",
						Arrays.asList(new String[] { "xls", "xla", "xlw" }));
				put1("application/x-msmediaview",
						Arrays.asList(new String[] { "mvb", "m13", "m14" }));
				put1("application/x-msmetafile", "wmf");
				put1("application/x-msmoney", "mny");
				put1("application/x-mspowerpoint", "ppt");
				put1("application/x-mspublisher", "pub");
				put1("application/x-msschedule", "scd");
				put1("application/x-msterminal", "trm");
				put1("application/x-mswrite", "wri");
				put1("application/x-navi-animation", "ani");
				put1("application/x-navidoc", "nvd");
				put1("application/x-navimap", "map");
				put1("application/x-navistyle", "stl");
				put1("application/x-netcdf",
						Arrays.asList(new String[] { "cdf", "nc" }));
				put1("application/x-newton-compatible-pkg", "pkg");
				put1("application/x-nokia-9000-communicator-add-on-software",
						"aos");
				put1("application/x-omc", "omc");
				put1("application/x-omcdatamaker", "omcd");
				put1("application/x-omcregerator", "omcr");
				put1("application/x-pagemaker",
						Arrays.asList(new String[] { "pm4", "pm5" }));
				put1("application/x-pcl", "pcl");
				put1("application/x-perfmon",
						Arrays.asList(new String[] { "pma", "pmc", "pml",
								"pmr", "pmw" }));
				put1("application/x-pixclscript", "plx");
				put1("application/x-pkcs10", "p10");
				put1("application/x-pkcs12",
						Arrays.asList(new String[] { "p12", "pfx" }));
				put1("application/x-pkcs7-certificates",
						Arrays.asList(new String[] { "p7b", "spc" }));
				put1("application/x-pkcs7-certreqresp", "p7r");
				put1("application/x-pkcs7-mime",
						Arrays.asList(new String[] { "p7m", "p7c" }));
				put1("application/x-pkcs7-signature",
						Arrays.asList(new String[] { "p7s", "p7a" }));
				put1("application/x-pointplus", "css");
				put1("application/x-portable-anymap", "pnm");
				put1("application/x-project", Arrays.asList(new String[] {
						"mpc", "mpt", "mpv", "mpx" }));
				put1("application/x-qpro", "wb1");
				put1("application/x-rar-compressed", "rar");
				put1("application/x-rtf", "rtf");
				put1("application/x-sdp", "sdp");
				put1("application/x-sea", "sea");
				put1("application/x-seelogo", "sl");
				put1("application/x-sh", "sh");
				put1("application/x-shar",
						Arrays.asList(new String[] { "shar", "sh" }));
				put1("application/x-shockwave-flash", "swf");
				put1("application/x-silverlight-app", "xap");
				put1("application/x-sit", "sit");
				put1("application/x-sprite",
						Arrays.asList(new String[] { "spr", "sprite" }));
				put1("application/x-stuffit", "sit");
				put1("application/x-stuffitx", "sitx");
				put1("application/x-sv4cpio", "sv4cpio");
				put1("application/x-sv4crc", "sv4crc");
				put1("application/x-tar", "tar");
				put1("application/x-tbook",
						Arrays.asList(new String[] { "sbk", "tbk" }));
				put1("application/x-tcl", "tcl");
				put1("application/x-tex", "tex");
				put1("application/x-tex-tfm", "tfm");
				put1("application/x-texinfo",
						Arrays.asList(new String[] { "texi", "texinfo" }));
				put1("application/x-troff",
						Arrays.asList(new String[] { "roff", "t", "tr" }));
				put1("application/x-troff-man", "man");
				put1("application/x-troff-me", "me");
				put1("application/x-troff-ms", "ms");
				put1("application/x-troff-msvideo", "avi");
				put1("application/x-ustar", "ustar");
				put1("application/x-visio",
						Arrays.asList(new String[] { "vsd", "vst", "vsw" }));
				put1("application/x-vnd.audioexplosion.mzz", "mzz");
				put1("application/x-vnd.ls-xpix", "xpix");
				put1("application/x-vrml", "vrml");
				put1("application/x-wais-source",
						Arrays.asList(new String[] { "src", "wsrc" }));
				put1("application/x-winhelp", "hlp");
				put1("application/x-wintalk", "wtk");
				put1("application/x-world",
						Arrays.asList(new String[] { "wrl", "svr" }));
				put1("application/x-wpwin", "wpd");
				put1("application/x-wri", "wri");
				put1("application/x-x509-ca-cert",
						Arrays.asList(new String[] { "cer", "crt", "der" }));
				put1("application/x-x509-user-cert", "crt");
				put1("application/x-xfig", "fig");
				put1("application/x-xpinstall", "xpi");
				put1("application/x-zip-compressed", "zip");
				put1("application/xcap-diff+xml", "xdf");
				put1("application/xenc+xml", "xenc");
				put1("application/xhtml+xml", "xhtml");
				put1("application/xml", "xml");
				put1("application/xml-dtd", "dtd");
				put1("application/xop+xml", "xop");
				put1("application/xslt+xml", "xslt");
				put1("application/xspf+xml", "xspf");
				put1("application/xv+xml", "mxml");
				put1("application/yang", "yang");
				put1("application/yin+xml", "yin");
				put1("application/ynd.ms-pkipko", "pko");
				put1("application/zip", "zip");
				put1("audio/adpcm", "adp");
				put1("audio/aiff",
						Arrays.asList(new String[] { "aiff", "aif", "aifc" }));
				put1("audio/basic", Arrays.asList(new String[] { "snd", "au" }));
				put1("audio/it", "it");
				put1("audio/make",
						Arrays.asList(new String[] { "funk", "my", "pfunk" }));
				put1("audio/make.my.funk", "pfunk");
				put1("audio/mid", Arrays.asList(new String[] { "mid", "rmi" }));
				put1("audio/midi",
						Arrays.asList(new String[] { "midi", "kar", "mid" }));
				put1("audio/mod", "mod");
				put1("audio/mp4", "mp4a");
				put1("audio/mpeg",
						Arrays.asList(new String[] { "mpga", "mp3", "m2a",
								"mp2", "mpa", "mpg" }));
				put1("audio/mpeg3", "mp3");
				put1("audio/nspaudio",
						Arrays.asList(new String[] { "la", "lma" }));
				put1("audio/ogg", "oga");
				put1("audio/s3m", "s3m");
				put1("audio/tsp-audio", "tsi");
				put1("audio/tsplayer", "tsp");
				put1("audio/vnd.dece.audio", "uva");
				put1("audio/vnd.digital-winds", "eol");
				put1("audio/vnd.dra", "dra");
				put1("audio/vnd.dts", "dts");
				put1("audio/vnd.dts.hd", "dtshd");
				put1("audio/vnd.lucent.voice", "lvp");
				put1("audio/vnd.ms-playready.media.pya", "pya");
				put1("audio/vnd.nuera.ecelp4800", "ecelp4800");
				put1("audio/vnd.nuera.ecelp7470", "ecelp7470");
				put1("audio/vnd.nuera.ecelp9600", "ecelp9600");
				put1("audio/vnd.qcelp", "qcp");
				put1("audio/vnd.rip", "rip");
				put1("audio/voc", "voc");
				put1("audio/voxware", "vox");
				put1("audio/wav", "wav");
				put1("audio/webm", "weba");
				put1("audio/x-aac", "aac");
				put1("audio/x-adpcm", "snd");
				put1("audio/x-aiff",
						Arrays.asList(new String[] { "aiff", "aif", "aifc" }));
				put1("audio/x-au", "au");
				put1("audio/x-gsm",
						Arrays.asList(new String[] { "gsd", "gsm" }));
				put1("audio/x-jam", "jam");
				put1("audio/x-liveaudio", "lam");
				put1("audio/x-mid",
						Arrays.asList(new String[] { "mid", "midi" }));
				put1("audio/x-midi",
						Arrays.asList(new String[] { "midi", "mid" }));
				put1("audio/x-mod", "mod");
				put1("audio/x-mpeg", "mp2");
				put1("audio/x-mpeg-3", "mp3");
				put1("audio/x-mpegurl", "m3u");
				put1("audio/x-mpequrl", "m3u");
				put1("audio/x-ms-wax", "wax");
				put1("audio/x-ms-wma", "wma");
				put1("audio/x-nspaudio",
						Arrays.asList(new String[] { "la", "lma" }));
				put1("audio/x-pn-realaudio",
						Arrays.asList(new String[] { "ra", "ram", "rm", "rmm",
								"rmp" }));
				put1("audio/x-pn-realaudio-plugin",
						Arrays.asList(new String[] { "ra", "rmp", "rpm" }));
				put1("audio/x-psid", "sid");
				put1("audio/x-realaudio", "ra");
				put1("audio/x-twinvq", "vqf");
				put1("audio/x-twinvq-plugin",
						Arrays.asList(new String[] { "vqe", "vql" }));
				put1("audio/x-vnd.audioexplosion.mjuicemediafile", "mjf");
				put1("audio/x-voc", "voc");
				put1("audio/x-wav", "wav");
				put1("audio/xm", "xm");
				put1("chemical/x-cdx", "cdx");
				put1("chemical/x-cif", "cif");
				put1("chemical/x-cmdf", "cmdf");
				put1("chemical/x-cml", "cml");
				put1("chemical/x-csml", "csml");
				put1("chemical/x-pdb",
						Arrays.asList(new String[] { "pdb", "xyz" }));
				put1("chemical/x-xyz", "xyz");
				put1("drawing/x-dwf", "dwf");
				put1("i-world/i-vrml", "ivr");
				put1("image/bmp", Arrays.asList(new String[] { "bmp", "bm" }));
				put1("image/cgm", "cgm");
				put1("image/cis-cod", "cod");
				put1("image/cmu-raster",
						Arrays.asList(new String[] { "ras", "rast" }));
				put1("image/fif", "fif");
				put1("image/florian",
						Arrays.asList(new String[] { "flo", "turbot" }));
				put1("image/g3fax", "g3");
				put1("image/gif", "gif");
				put1("image/ief", Arrays.asList(new String[] { "ief", "iefs" }));
				put1("image/jpeg",
						Arrays.asList(new String[] { "jpeg", "jpe", "jpg",
								"jfif", "jfif-tbnl" }));
				put1("image/jutvision", "jut");
				put1("image/ktx", "ktx");
				put1("image/naplps",
						Arrays.asList(new String[] { "nap", "naplps" }));
				put1("image/pict",
						Arrays.asList(new String[] { "pic", "pict" }));
				put1("image/pipeg", "jfif");
				put1("image/pjpeg",
						Arrays.asList(new String[] { "jfif", "jpe", "jpeg",
								"jpg" }));
				put1("image/png",
						Arrays.asList(new String[] { "png", "x-png" }));
				put1("image/prs.btif", "btif");
				put1("image/svg+xml", "svg");
				put1("image/tiff",
						Arrays.asList(new String[] { "tif", "tiff" }));
				put1("image/vasa", "mcf");
				put1("image/vnd.adobe.photoshop", "psd");
				put1("image/vnd.dece.graphic", "uvi");
				put1("image/vnd.djvu", "djvu");
				put1("image/vnd.dvb.subtitle", "sub");
				put1("image/vnd.dwg",
						Arrays.asList(new String[] { "dwg", "dxf", "svf" }));
				put1("image/vnd.dxf", "dxf");
				put1("image/vnd.fastbidsheet", "fbs");
				put1("image/vnd.fpx", "fpx");
				put1("image/vnd.fst", "fst");
				put1("image/vnd.fujixerox.edmics-mmr", "mmr");
				put1("image/vnd.fujixerox.edmics-rlc", "rlc");
				put1("image/vnd.ms-modi", "mdi");
				put1("image/vnd.net-fpx",
						Arrays.asList(new String[] { "fpx", "npx" }));
				put1("image/vnd.rn-realflash", "rf");
				put1("image/vnd.rn-realpix", "rp");
				put1("image/vnd.wap.wbmp", "wbmp");
				put1("image/vnd.xiff", "xif");
				put1("image/webp", "webp");
				put1("image/x-cmu-raster", "ras");
				put1("image/x-cmx", "cmx");
				put1("image/x-dwg",
						Arrays.asList(new String[] { "dwg", "dxf", "svf" }));
				put1("image/x-freehand", "fh");
				put1("image/x-icon", "ico");
				put1("image/x-jg", "art");
				put1("image/x-jps", "jps");
				put1("image/x-niff",
						Arrays.asList(new String[] { "niff", "nif" }));
				put1("image/x-pcx", "pcx");
				put1("image/x-pict",
						Arrays.asList(new String[] { "pct", "pic" }));
				put1("image/x-portable-anymap", "pnm");
				put1("image/x-portable-bitmap", "pbm");
				put1("image/x-portable-graymap", "pgm");
				put1("image/x-portable-greymap", "pgm");
				put1("image/x-portable-pixmap", "ppm");
				put1("image/x-quicktime",
						Arrays.asList(new String[] { "qif", "qti", "qtif" }));
				put1("image/x-rgb", "rgb");
				put1("image/x-tiff",
						Arrays.asList(new String[] { "tif", "tiff" }));
				put1("image/x-windows-bmp", "bmp");
				put1("image/x-xbitmap", "xbm");
				put1("image/x-xbm", "xbm");
				put1("image/x-xpixmap",
						Arrays.asList(new String[] { "xpm", "pm" }));
				put1("image/x-xwd", "xwd");
				put1("image/x-xwindowdump", "xwd");
				put1("image/xbm", "xbm");
				put1("image/xpm", "xpm");
				put1("message/rfc822",
						Arrays.asList(new String[] { "eml", "mht", "mhtml",
								"nws", "mime" }));
				put1("model/iges",
						Arrays.asList(new String[] { "iges", "igs" }));
				put1("model/mesh", "msh");
				put1("model/vnd.collada+xml", "dae");
				put1("model/vnd.dwf", "dwf");
				put1("model/vnd.gdl", "gdl");
				put1("model/vnd.gtw", "gtw");
				put1("model/vnd.mts", "mts");
				put1("model/vnd.vtu", "vtu");
				put1("model/vrml",
						Arrays.asList(new String[] { "vrml", "wrl", "wrz" }));
				put1("model/x-pov", "pov");
				put1("multipart/x-gzip", "gzip");
				put1("multipart/x-ustar", "ustar");
				put1("multipart/x-zip", "zip");
				put1("music/crescendo",
						Arrays.asList(new String[] { "mid", "midi" }));
				put1("music/x-karaoke", "kar");
				put1("paleovu/x-pv", "pvu");
				put1("text/asp", "asp");
				put1("text/calendar", "ics");
				put1("text/css", "css");
				put1("text/csv", "csv");
				put1("text/ecmascript", "js");
				put1("text/h323", "323");
				put1("text/html",
						Arrays.asList(new String[] { "html", "htm", "stm",
								"acgi", "htmls", "htx", "shtml" }));
				put1("text/iuls", "uls");
				put1("text/javascript", "js");
				put1("text/mcf", "mcf");
				put1("text/n3", "n3");
				put1("text/pascal", "pas");
				put1("text/plain",
						Arrays.asList(new String[] { "txt", "bas", "c", "h",
								"c++", "cc", "com", "conf", "cxx", "def", "f",
								"f90", "for", "g", "hh", "idc", "jav", "java",
								"list", "log", "lst", "m", "mar", "pl", "sdml",
								"text" }));
				put1("text/plain-bas", "par");
				put1("text/prs.lines.tag", "dsc");
				put1("text/richtext",
						Arrays.asList(new String[] { "rtx", "rt", "rtf" }));
				put1("text/scriplet", "wsc");
				put1("text/scriptlet", "sct");
				put1("text/sgml", Arrays.asList(new String[] { "sgm", "sgml" }));
				put1("text/tab-separated-values", "tsv");
				put1("text/troff", "t");
				put1("text/turtle", "ttl");
				put1("text/uri-list",
						Arrays.asList(new String[] { "uni", "unis", "uri",
								"uris" }));
				put1("text/vnd.abc", "abc");
				put1("text/vnd.curl", "curl");
				put1("text/vnd.curl.dcurl", "dcurl");
				put1("text/vnd.curl.mcurl", "mcurl");
				put1("text/vnd.curl.scurl", "scurl");
				put1("text/vnd.fly", "fly");
				put1("text/vnd.fmi.flexstor", "flx");
				put1("text/vnd.graphviz", "gv");
				put1("text/vnd.in3d.3dml", "3dml");
				put1("text/vnd.in3d.spot", "spot");
				put1("text/vnd.rn-realtext", "rt");
				put1("text/vnd.sun.j2me.app-descriptor", "jad");
				put1("text/vnd.wap.wml", "wml");
				put1("text/vnd.wap.wmlscript", "wmls");
				put1("text/webviewhtml", "htt");
				put1("text/x-asm", Arrays.asList(new String[] { "asm", "s" }));
				put1("text/x-audiosoft-intra", "aip");
				put1("text/x-c",
						Arrays.asList(new String[] { "c", "cc", "cpp" }));
				put1("text/x-component", "htc");
				put1("text/x-fortran", Arrays.asList(new String[] { "for", "f",
						"f77", "f90" }));
				put1("text/x-h", Arrays.asList(new String[] { "h", "hh" }));
				put1("text/x-java-source",
						Arrays.asList(new String[] { "java", "jav" }));
				put1("text/x-java-source);java", "java");
				put1("text/x-la-asf", "lsx");
				put1("text/x-m", "m");
				put1("text/x-pascal", "p");
				put1("text/x-script", "hlb");
				put1("text/x-script.csh", "csh");
				put1("text/x-script.elisp", "el");
				put1("text/x-script.guile", "scm");
				put1("text/x-script.ksh", "ksh");
				put1("text/x-script.lisp", "lsp");
				put1("text/x-script.perl", "pl");
				put1("text/x-script.perl-module", "pm");
				put1("text/x-script.phyton", "py");
				put1("text/x-script.rexx", "rexx");
				put1("text/x-script.scheme", "scm");
				put1("text/x-script.sh", "sh");
				put1("text/x-script.tcl", "tcl");
				put1("text/x-script.tcsh", "tcsh");
				put1("text/x-script.zsh", "zsh");
				put1("text/x-server-parsed-html",
						Arrays.asList(new String[] { "shtml", "ssi" }));
				put1("text/x-setext", "etx");
				put1("text/x-sgml",
						Arrays.asList(new String[] { "sgm", "sgml" }));
				put1("text/x-speech",
						Arrays.asList(new String[] { "spc", "talk" }));
				put1("text/x-uil", "uil");
				put1("text/x-uuencode",
						Arrays.asList(new String[] { "uu", "uue" }));
				put1("text/x-vcalendar", "vcs");
				put1("text/x-vcard", "vcf");
				put1("text/xml", "xml");
				put1("video/3gpp", "3gp");
				put1("video/3gpp2", "3g2");
				put1("video/animaflex", "afl");
				put1("video/avi", "avi");
				put1("video/avs-video", "avs");
				put1("video/dl", "dl");
				put1("video/fli", "fli");
				put1("video/gl", "gl");
				put1("video/h261", "h261");
				put1("video/h263", "h263");
				put1("video/h264", "h264");
				put1("video/jpeg", "jpgv");
				put1("video/jpm", "jpm");
				put1("video/mj2", "mj2");
				put1("video/mp4", "mp4");
				put1("video/mpeg",
						Arrays.asList(new String[] { "mpeg", "mp2", "mpa",
								"mpe", "mpg", "mpv2", "m1v", "m2v", "mp3" }));
				put1("video/msvideo", "avi");
				put1("video/ogg", "ogv");
				put1("video/quicktime",
						Arrays.asList(new String[] { "mov", "qt", "moov" }));
				put1("video/vdo", "vdo");
				put1("video/vivo",
						Arrays.asList(new String[] { "viv", "vivo" }));
				put1("video/vnd.dece.hd", "uvh");
				put1("video/vnd.dece.mobile", "uvm");
				put1("video/vnd.dece.pd", "uvp");
				put1("video/vnd.dece.sd", "uvs");
				put1("video/vnd.dece.video", "uvv");
				put1("video/vnd.fvt", "fvt");
				put1("video/vnd.mpegurl", "mxu");
				put1("video/vnd.ms-playready.media.pyv", "pyv");
				put1("video/vnd.rn-realvideo", "rv");
				put1("video/vnd.uvvu.mp4", "uvu");
				put1("video/vnd.vivo",
						Arrays.asList(new String[] { "viv", "vivo" }));
				put1("video/vosaic", "vos");
				put1("video/webm", "webm");
				put1("video/x-amt-demorun", "xdr");
				put1("video/x-amt-showrun", "xsr");
				put1("video/x-atomic3d-feature", "fmf");
				put1("video/x-dl", "dl");
				put1("video/x-dv", Arrays.asList(new String[] { "dif", "dv" }));
				put1("video/x-f4v", "f4v");
				put1("video/x-fli", "fli");
				put1("video/x-flv", "flv");
				put1("video/x-gl", "gl");
				put1("video/x-isvideo", "isu");
				put1("video/x-la-asf",
						Arrays.asList(new String[] { "lsf", "lsx" }));
				put1("video/x-m4v", "m4v");
				put1("video/x-motion-jpeg", "mjpg");
				put1("video/x-mpeg",
						Arrays.asList(new String[] { "mp3", "mp2" }));
				put1("video/x-mpeq2a", "mp2");
				put1("video/x-ms-asf",
						Arrays.asList(new String[] { "asf", "asr", "asx" }));
				put1("video/x-ms-asf-plugin", "asx");
				put1("video/x-ms-wm", "wm");
				put1("video/x-ms-wmv", "wmv");
				put1("video/x-ms-wmx", "wmx");
				put1("video/x-ms-wvx", "wvx");
				put1("video/x-msvideo", "avi");
				put1("video/x-qtc", "qtc");
				put1("video/x-scm", "scm");
				put1("video/x-sgi-movie",
						Arrays.asList(new String[] { "movie", "mv" }));
				put1("windows/metafile", "wmf");
				put1("www/mime", "mime");
				put1("x-conference/x-cooltalk", "ice");
				put1("x-music/x-midi",
						Arrays.asList(new String[] { "mid", "midi" }));
				put1("x-world/x-3dmf",
						Arrays.asList(new String[] { "3dm", "3dmf", "qd3",
								"qd3d" }));
				put1("x-world/x-svr", "svr");
				put1("x-world/x-vrml",
						Arrays.asList(new String[] { "flr", "vrml", "wrl",
								"wrz", "xaf", "xof" }));
				put1("x-world/x-vrt", "vrt");
				put1("xgl/drawing", "xgz");
				put1("xgl/movie", "xmz");
			}
		};
	}

	static {
		extNameMapping = new HashMap<String, Object>(200) {
			private void put2(String key, Object value) {
				if (put(key, value) != null) {
					throw new IllegalArgumentException("Duplicated extension: "
							+ key);
				}
			}

			{
				put2("*", "application/octet-stream");
				put2("123", "application/vnd.lotus-1-2-3");
				put2("323", "text/h323");
				put2("3dm", "x-world/x-3dmf");
				put2("3dmf", "x-world/x-3dmf");
				put2("3dml", "text/vnd.in3d.3dml");
				put2("3g2", "video/3gpp2");
				put2("3gp", "video/3gpp");
				put2("7z", "application/x-7z-compressed");
				put2("a", "application/octet-stream");
				put2("aab", "application/x-authorware-bin");
				put2("aac", "audio/x-aac");
				put2("aam", "application/x-authorware-map");
				put2("aas", "application/x-authorware-seg");
				put2("abc", "text/vnd.abc");
				put2("abw", "application/x-abiword");
				put2("ac", "application/pkix-attr-cert");
				put2("acc", "application/vnd.americandynamics.acc");
				put2("ace", "application/x-ace-compressed");
				put2("acgi", "text/html");
				put2("acu", "application/vnd.acucobol");
				put2("acx", "application/internet-property-stream");
				put2("adp", "audio/adpcm");
				put2("aep", "application/vnd.audiograph");
				put2("afl", "video/animaflex");
				put2("afp", "application/vnd.ibm.modcap");
				put2("ahead", "application/vnd.ahead.space");
				put2("ai", "application/postscript");
				put2("aif",
						Arrays.asList(new String[] { "audio/aiff",
								"audio/x-aiff" }));
				put2("aifc",
						Arrays.asList(new String[] { "audio/aiff",
								"audio/x-aiff" }));
				put2("aiff",
						Arrays.asList(new String[] { "audio/aiff",
								"audio/x-aiff" }));
				put2("aim", "application/x-aim");
				put2("aip", "text/x-audiosoft-intra");
				put2("air",
						"application/vnd.adobe.air-application-installer-package+zip");
				put2("ait", "application/vnd.dvb.ait");
				put2("ami", "application/vnd.amiga.ami");
				put2("ani", "application/x-navi-animation");
				put2("aos",
						"application/x-nokia-9000-communicator-add-on-software");
				put2("apk", "application/vnd.android.package-archive");
				put2("application", "application/x-ms-application");
				put2("apr", "application/vnd.lotus-approach");
				put2("aps", "application/mime");
				put2("arc", "application/octet-stream");
				put2("arj",
						Arrays.asList(new String[] { "application/arj",
								"application/octet-stream" }));
				put2("art", "image/x-jg");
				put2("asf", "video/x-ms-asf");
				put2("asm", "text/x-asm");
				put2("aso", "application/vnd.accpac.simply.aso");
				put2("asp", "text/asp");
				put2("asr", "video/x-ms-asf");
				put2("asx",
						Arrays.asList(new String[] { "video/x-ms-asf",
								"application/x-mplayer2",
								"video/x-ms-asf-plugin" }));
				put2("atc", "application/vnd.acucorp");
				put2("atomcat", "application/atomcat+xml");
				put2("atomsvc", "application/atomsvc+xml");
				put2("atx", "application/vnd.antix.game-component");
				put2("au",
						Arrays.asList(new String[] { "audio/basic",
								"audio/x-au" }));
				put2("avi",
						Arrays.asList(new String[] { "video/avi",
								"video/msvideo", "application/x-troff-msvideo",
								"video/x-msvideo" }));
				put2("avs", "video/avs-video");
				put2("aw", "application/applixware");
				put2("axs", "application/olescript");
				put2("azf", "application/vnd.airzip.filesecure.azf");
				put2("azs", "application/vnd.airzip.filesecure.azs");
				put2("azw", "application/vnd.amazon.ebook");
				put2("bas", "text/plain");
				put2("bcpio", "application/x-bcpio");
				put2("bdf", "application/x-font-bdf");
				put2("bdm", "application/vnd.syncml.dm+wbxml");
				put2("bed", "application/vnd.realvnc.bed");
				put2("bh2", "application/vnd.fujitsu.oasysprs");
				put2("bin",
						Arrays.asList(new String[] {
								"application/octet-stream",
								"application/mac-binary",
								"application/macbinary",
								"application/x-macbinary",
								"application/x-binary" }));
				put2("bm", "image/bmp");
				put2("bmi", "application/vnd.bmi");
				put2("bmp",
						Arrays.asList(new String[] { "image/bmp",
								"image/x-windows-bmp" }));
				put2("boo", "application/book");
				put2("book", "application/book");
				put2("box", "application/vnd.previewsystems.box");
				put2("boz", "application/x-bzip2");
				put2("bsh", "application/x-bsh");
				put2("btif", "image/prs.btif");
				put2("bz", "application/x-bzip");
				put2("bz2", "application/x-bzip2");
				put2("c",
						Arrays.asList(new String[] { "text/plain", "text/x-c" }));
				put2("c++", "text/plain");
				put2("c11amc", "application/vnd.cluetrust.cartomobile-config");
				put2("c11amz",
						"application/vnd.cluetrust.cartomobile-config-pkg");
				put2("c4g", "application/vnd.clonk.c4group");
				put2("cab", "application/vnd.ms-cab-compressed");
				put2("car", "application/vnd.curl.car");
				put2("cat",
						Arrays.asList(new String[] {
								"application/vnd.ms-pkiseccat",
								"application/vnd.ms-pki.seccat" }));
				put2("cc", Arrays.asList(new String[] { "text/plain",
						"text/x-c" }));
				put2("ccad", "application/clariscad");
				put2("cco", "application/x-cocoa");
				put2("ccxml", "application/ccxml+xml);");
				put2("cdbcmsg", "application/vnd.contact.cmsg");
				put2("cdf",
						Arrays.asList(new String[] { "application/cdf",
								"application/x-cdf", "application/x-netcdf" }));
				put2("cdkey", "application/vnd.mediastation.cdkey");
				put2("cdmia", "application/cdmi-capability");
				put2("cdmic", "application/cdmi-container");
				put2("cdmid", "application/cdmi-domain");
				put2("cdmio", "application/cdmi-object");
				put2("cdmiq", "application/cdmi-queue");
				put2("cdx", "chemical/x-cdx");
				put2("cdxml", "application/vnd.chemdraw+xml");
				put2("cdy", "application/vnd.cinderella");
				put2("cer",
						Arrays.asList(new String[] { "application/pkix-cert",
								"application/x-x509-ca-cert" }));
				put2("cgm", "image/cgm");
				put2("cha", "application/x-chat");
				put2("chat", "application/x-chat");
				put2("chm", "application/vnd.ms-htmlhelp");
				put2("chrt", "application/vnd.kde.kchart");
				put2("cif", "chemical/x-cif");
				put2("cii",
						"application/vnd.anser-web-certificate-issue-initiation");
				put2("cil", "application/vnd.ms-artgalry");
				put2("cla", "application/vnd.claymore");
				put2("class",
						Arrays.asList(new String[] {
								"application/octet-stream", "application/java",
								"application/java-byte-code",
								"application/java-vm",
								"application/x-java-class" }));
				put2("clkk", "application/vnd.crick.clicker.keyboard");
				put2("clkp", "application/vnd.crick.clicker.palette");
				put2("clkt", "application/vnd.crick.clicker.template");
				put2("clkw", "application/vnd.crick.clicker.wordbank");
				put2("clkx", "application/vnd.crick.clicker");
				put2("clp", "application/x-msclip");
				put2("cmc", "application/vnd.cosmocaller");
				put2("cmdf", "chemical/x-cmdf");
				put2("cml", "chemical/x-cml");
				put2("cmp", "application/vnd.yellowriver-custom-menu");
				put2("cmx", "image/x-cmx");
				put2("cod",
						Arrays.asList(new String[] { "image/cis-cod",
								"application/vnd.rim.cod" }));
				put2("com",
						Arrays.asList(new String[] {
								"application/octet-stream", "text/plain" }));
				put2("conf", "text/plain");
				put2("cpio", "application/x-cpio");
				put2("cpp", "text/x-c");
				put2("cpt", Arrays.asList(new String[] {
						"application/mac-compactpro",
						"application/x-compactpro", "application/x-cpt" }));
				put2("crd", "application/x-mscardfile");
				put2("crl",
						Arrays.asList(new String[] { "application/pkix-crl",
								"application/pkcs-crl" }));
				put2("crt",
						Arrays.asList(new String[] { "application/pkix-cert",
								"application/x-x509-user-cert",
								"application/x-x509-ca-cert" }));
				put2("cryptonote", "application/vnd.rig.cryptonote");
				put2("csh",
						Arrays.asList(new String[] { "text/x-script.csh",
								"application/x-csh" }));
				put2("csml", "chemical/x-csml");
				put2("csp", "application/vnd.commonspace");
				put2("css",
						Arrays.asList(new String[] { "text/css",
								"application/x-pointplus" }));
				put2("csv", "text/csv");
				put2("cu", "application/cu-seeme");
				put2("curl", "text/vnd.curl");
				put2("cww", "application/prs.cww");
				put2("cxx", "text/plain");
				put2("dae", "model/vnd.collada+xml");
				put2("daf", "application/vnd.mobius.daf");
				put2("davmount", "application/davmount+xml");
				put2("dcr", "application/x-director");
				put2("dcurl", "text/vnd.curl.dcurl");
				put2("dd2", "application/vnd.oma.dd2+xml");
				put2("ddd", "application/vnd.fujixerox.ddd");
				put2("deb", "application/x-debian-package");
				put2("deepv", "application/x-deepv");
				put2("def", "text/plain");
				put2("der", "application/x-x509-ca-cert");
				put2("dfac", "application/vnd.dreamfactory");
				put2("dif", "video/x-dv");
				put2("dir", "application/x-director");
				put2("dis", "application/vnd.mobius.dis");
				put2("djvu", "image/vnd.djvu");
				put2("dl", Arrays.asList(new String[] { "video/dl",
						"video/x-dl" }));
				put2("dll", "application/x-msdownload");
				put2("dms", "application/octet-stream");
				put2("dna", "application/vnd.dna");
				put2("doc", "application/msword");
				put2("docm", "application/vnd.ms-word.document.macroenabled.12");
				put2("docx",
						"application/vnd.openxmlformats-officedocument.wordprocessingml.document");
				put2("dot", "application/msword");
				put2("dotm", "application/vnd.ms-word.template.macroenabled.12");
				put2("dotx",
						"application/vnd.openxmlformats-officedocument.wordprocessingml.template");
				put2("dp",
						Arrays.asList(new String[] {
								"application/commonground",
								"application/vnd.osgi.dp" }));
				put2("dpg", "application/vnd.dpgraph");
				put2("dra", "audio/vnd.dra");
				put2("drw", "application/drafting");
				put2("dsc", "text/prs.lines.tag");
				put2("dssc", "application/dssc+der");
				put2("dtb", "application/x-dtbook+xml");
				put2("dtd", "application/xml-dtd");
				put2("dts", "audio/vnd.dts");
				put2("dtshd", "audio/vnd.dts.hd");
				put2("dump", "application/octet-stream");
				put2("dv", "video/x-dv");
				put2("dvi", "application/x-dvi");
				put2("dwf",
						Arrays.asList(new String[] { "model/vnd.dwf",
								"drawing/x-dwf" }));
				put2("dwt",
						Arrays.asList(new String[] { "model/vnd.dwt",
								"drawing/x-dwt" }));
				put2("dwg",
						Arrays.asList(new String[] { "application/acad",
								"image/vnd.dwg", "image/x-dwg" }));
				put2("dxf", Arrays.asList(new String[] { "application/dxf",
						"image/vnd.dwg", "image/vnd.dxf", "image/x-dwg" }));
				put2("dxp", "application/vnd.spotfire.dxp");
				put2("dxr", "application/x-director");
				put2("ecelp4800", "audio/vnd.nuera.ecelp4800");
				put2("ecelp7470", "audio/vnd.nuera.ecelp7470");
				put2("ecelp9600", "audio/vnd.nuera.ecelp9600");
				put2("edm", "application/vnd.novadigm.edm");
				put2("edx", "application/vnd.novadigm.edx");
				put2("efif", "application/vnd.picsel");
				put2("ei6", "application/vnd.pg.osasli");
				put2("el", "text/x-script.elisp");
				put2("elc",
						Arrays.asList(new String[] { "application/x-elc",
								"application/x-bytecode.elisp" }));
				put2("eml", "message/rfc822");
				put2("emma", "application/emma+xml");
				put2("env", "application/x-envoy");
				put2("eol", "audio/vnd.digital-winds");
				put2("eot", "application/vnd.ms-fontobject");
				put2("eps", "application/postscript");
				put2("epub", "application/epub+zip");
				put2("es",
						Arrays.asList(new String[] { "application/ecmascript",
								"application/x-esrehber" }));
				put2("es3", "application/vnd.eszigno3+xml");
				put2("esf", "application/vnd.epson.esf");
				put2("etx", "text/x-setext");
				put2("evy",
						Arrays.asList(new String[] { "application/envoy",
								"application/x-envoy" }));
				put2("exe",
						Arrays.asList(new String[] {
								"application/octet-stream",
								"application/x-msdownload" }));
				put2("exi", "application/exi");
				put2("ext", "application/vnd.novadigm.ext");
				put2("ez2", "application/vnd.ezpix-album");
				put2("ez3", "application/vnd.ezpix-package");
				put2("f",
						Arrays.asList(new String[] { "text/plain",
								"text/x-fortran" }));
				put2("f4v", "video/x-f4v");
				put2("f77", "text/x-fortran");
				put2("f90",
						Arrays.asList(new String[] { "text/plain",
								"text/x-fortran" }));
				put2("fbs", "image/vnd.fastbidsheet");
				put2("fcs", "application/vnd.isac.fcs");
				put2("fdf", "application/vnd.fdf");
				put2("fe_launch", "application/vnd.denovo.fcselayout-link");
				put2("fg5", "application/vnd.fujitsu.oasysgp");
				put2("fh", "image/x-freehand");
				put2("fif",
						Arrays.asList(new String[] { "application/fractals",
								"image/fif" }));
				put2("fig", "application/x-xfig");
				put2("fli", Arrays.asList(new String[] { "video/fli",
						"video/x-fli" }));
				put2("flo",
						Arrays.asList(new String[] { "image/florian",
								"application/vnd.micrografx.flo" }));
				put2("flr", "x-world/x-vrml");
				put2("flv", "video/x-flv");
				put2("flw", "application/vnd.kde.kivio");
				put2("flx", "text/vnd.fmi.flexstor");
				put2("fly", "text/vnd.fly");
				put2("fm", "application/vnd.framemaker");
				put2("fmf", "video/x-atomic3d-feature");
				put2("fnc", "application/vnd.frogans.fnc");
				put2("for",
						Arrays.asList(new String[] { "text/plain",
								"text/x-fortran" }));
				put2("fpx",
						Arrays.asList(new String[] { "image/vnd.fpx",
								"image/vnd.net-fpx" }));
				put2("frl", "application/freeloader");
				put2("fsc", "application/vnd.fsc.weblaunch");
				put2("fst", "image/vnd.fst");
				put2("ftc", "application/vnd.fluxtime.clip");
				put2("fti",
						"application/vnd.anser-web-funds-transfer-initiation");
				put2("funk", "audio/make");
				put2("fvt", "video/vnd.fvt");
				put2("fxp", "application/vnd.adobe.fxp");
				put2("fzs", "application/vnd.fuzzysheet");
				put2("g", "text/plain");
				put2("g2w", "application/vnd.geoplan");
				put2("g3", "image/g3fax");
				put2("g3w", "application/vnd.geospace");
				put2("gac", "application/vnd.groove-account");
				put2("gdl", "model/vnd.gdl");
				put2("geo", "application/vnd.dynageo");
				put2("gex", "application/vnd.geometry-explorer");
				put2("ggb", "application/vnd.geogebra.file");
				put2("ggt", "application/vnd.geogebra.tool");
				put2("ghf", "application/vnd.groove-help");
				put2("gif", "image/gif");
				put2("gim", "application/vnd.groove-identity-message");
				put2("gl", Arrays.asList(new String[] { "video/gl",
						"video/x-gl" }));
				put2("gmx", "application/vnd.gmx");
				put2("gnumeric", "application/x-gnumeric");
				put2("gph", "application/vnd.flographit");
				put2("gqf", "application/vnd.grafeq");
				put2("gram", "application/srgs");
				put2("grv", "application/vnd.groove-injector");
				put2("grxml", "application/srgs+xml");
				put2("gsd", "audio/x-gsm");
				put2("gsf", "application/x-font-ghostscript");
				put2("gsm", "audio/x-gsm");
				put2("gsp", "application/x-gsp");
				put2("gss", "application/x-gss");
				put2("gtar", "application/x-gtar");
				put2("gtm", "application/vnd.groove-tool-message");
				put2("gtw", "model/vnd.gtw");
				put2("gv", "text/vnd.graphviz");
				put2("gxt", "application/vnd.geonext");
				put2("gz",
						Arrays.asList(new String[] { "application/x-gzip",
								"application/x-compressed" }));
				put2("gzip",
						Arrays.asList(new String[] { "multipart/x-gzip",
								"application/x-gzip" }));
				put2("h",
						Arrays.asList(new String[] { "text/plain", "text/x-h" }));
				put2("h261", "video/h261");
				put2("h263", "video/h263");
				put2("h264", "video/h264");
				put2("hal", "application/vnd.hal+xml");
				put2("hbci", "application/vnd.hbci");
				put2("hdf", "application/x-hdf");
				put2("help", "application/x-helpfile");
				put2("hgl", "application/vnd.hp-hpgl");
				put2("hh", Arrays.asList(new String[] { "text/plain",
						"text/x-h" }));
				put2("hlb", "text/x-script");
				put2("hlp",
						Arrays.asList(new String[] { "application/winhlp",
								"application/hlp", "application/x-helpfile",
								"application/x-winhelp" }));
				put2("hpg", "application/vnd.hp-hpgl");
				put2("hpgl", "application/vnd.hp-hpgl");
				put2("hpid", "application/vnd.hp-hpid");
				put2("hps", "application/vnd.hp-hps");
				put2("hqx",
						Arrays.asList(new String[] {
								"application/mac-binhex40",
								"application/binhex", "application/binhex4",
								"application/mac-binhex",
								"application/x-binhex40",
								"application/x-mac-binhex40" }));
				put2("hta", "application/hta");
				put2("htc", "text/x-component");
				put2("htke", "application/vnd.kenameaapp");
				put2("htm", "text/html");
				put2("html", "text/html");
				put2("htmls", "text/html");
				put2("htt", "text/webviewhtml");
				put2("htx", "text/html");
				put2("hvd", "application/vnd.yamaha.hv-dic");
				put2("hvp", "application/vnd.yamaha.hv-voice");
				put2("hvs", "application/vnd.yamaha.hv-script");
				put2("i2g", "application/vnd.intergeo");
				put2("icc", "application/vnd.iccprofile");
				put2("ice", "x-conference/x-cooltalk");
				put2("ico", "image/x-icon");
				put2("ics", "text/calendar");
				put2("idc", "text/plain");
				put2("ief", "image/ief");
				put2("iefs", "image/ief");
				put2("ifm", "application/vnd.shana.informed.formdata");
				put2("iges",
						Arrays.asList(new String[] { "application/iges",
								"model/iges" }));
				put2("igl", "application/vnd.igloader");
				put2("igm", "application/vnd.insors.igm");
				put2("igs",
						Arrays.asList(new String[] { "application/iges",
								"model/iges" }));
				put2("igx", "application/vnd.micrografx.igx");
				put2("iif", "application/vnd.shana.informed.interchange");
				put2("iii", "application/x-iphone");
				put2("ima", "application/x-ima");
				put2("imap", "application/x-httpd-imap");
				put2("imp", "application/vnd.accpac.simply.imp");
				put2("ims", "application/vnd.ms-ims");
				put2("inf", "application/inf");
				put2("ins",
						Arrays.asList(new String[] {
								"application/x-internet-signup",
								"application/x-internett-signup" }));
				put2("ip", "application/x-ip2");
				put2("ipfix", "application/ipfix");
				put2("ipk", "application/vnd.shana.informed.package");
				put2("irm", "application/vnd.ibm.rights-management");
				put2("irp", "application/vnd.irepository.package+xml");
				put2("isp", "application/x-internet-signup");
				put2("isu", "video/x-isvideo");
				put2("it", "audio/it");
				put2("itp", "application/vnd.shana.informed.formtemplate");
				put2("iv", "application/x-inventor");
				put2("ivp", "application/vnd.immervision-ivp");
				put2("ivr", "i-world/i-vrml");
				put2("ivu", "application/vnd.immervision-ivu");
				put2("ivy", "application/x-livescreen");
				put2("jad", "text/vnd.sun.j2me.app-descriptor");
				put2("jam",
						Arrays.asList(new String[] { "application/vnd.jam",
								"audio/x-jam" }));
				put2("jar", "application/java-archive");
				put2("jav",
						Arrays.asList(new String[] { "text/plain",
								"text/x-java-source" }));
				put2("java",
						Arrays.asList(new String[] { "text/plain",
								"text/x-java-source);java",
								"text/x-java-source" }));
				put2("jcm", "application/x-java-commerce");
				put2("jfif",
						Arrays.asList(new String[] { "image/pipeg",
								"image/jpeg", "image/pjpeg" }));
				put2("jfif-tbnl", "image/jpeg");
				put2("jisp", "application/vnd.jisp");
				put2("jlt", "application/vnd.hp-jlyt");
				put2("jnlp", "application/x-java-jnlp-file");
				put2("joda", "application/vnd.joost.joda-archive");
				put2("jpe",
						Arrays.asList(new String[] { "image/jpeg",
								"image/pjpeg" }));
				put2("jpeg",
						Arrays.asList(new String[] { "image/jpeg",
								"image/pjpeg" }));
				put2("jpg",
						Arrays.asList(new String[] { "image/jpeg",
								"image/pjpeg" }));
				put2("jpgv", "video/jpeg");
				put2("jpm", "video/jpm");
				put2("jps", "image/x-jps");
				put2("js", Arrays.asList(new String[] {
						"application/javascript", "application/ecmascript",
						"text/javascript", "text/ecmascript",
						"application/x-javascript" }));
				put2("json", "application/json");
				put2("jut", "image/jutvision");
				put2("kar",
						Arrays.asList(new String[] { "audio/midi",
								"music/x-karaoke" }));
				put2("karbon", "application/vnd.kde.karbon");
				put2("kfo", "application/vnd.kde.kformula");
				put2("kia", "application/vnd.kidspiration");
				put2("kml", "application/vnd.google-earth.kml+xml");
				put2("kmz", "application/vnd.google-earth.kmz");
				put2("kne", "application/vnd.kinar");
				put2("kon", "application/vnd.kde.kontour");
				put2("kpr", "application/vnd.kde.kpresenter");
				put2("ksh",
						Arrays.asList(new String[] { "application/x-ksh",
								"text/x-script.ksh" }));
				put2("ksp", "application/vnd.kde.kspread");
				put2("ktx", "image/ktx");
				put2("ktz", "application/vnd.kahootz");
				put2("kwd", "application/vnd.kde.kword");
				put2("la",
						Arrays.asList(new String[] { "audio/nspaudio",
								"audio/x-nspaudio" }));
				put2("lam", "audio/x-liveaudio");
				put2("lasxml", "application/vnd.las.las+xml");
				put2("latex", "application/x-latex");
				put2("lbd",
						"application/vnd.llamagraphics.life-balance.desktop");
				put2("lbe",
						"application/vnd.llamagraphics.life-balance.exchange+xml");
				put2("les", "application/vnd.hhe.lesson-player");
				put2("lha",
						Arrays.asList(new String[] {
								"application/octet-stream", "application/lha",
								"application/x-lha" }));
				put2("lhx", "application/octet-stream");
				put2("link66", "application/vnd.route66.link66+xml");
				put2("list", "text/plain");
				put2("lma",
						Arrays.asList(new String[] { "audio/nspaudio",
								"audio/x-nspaudio" }));
				put2("log", "text/plain");
				put2("lrm", "application/vnd.ms-lrm");
				put2("lsf", "video/x-la-asf");
				put2("lsp",
						Arrays.asList(new String[] { "application/x-lisp",
								"text/x-script.lisp" }));
				put2("lst", "text/plain");
				put2("lsx",
						Arrays.asList(new String[] { "video/x-la-asf",
								"text/x-la-asf" }));
				put2("ltf", "application/vnd.frogans.ltf");
				put2("ltx", "application/x-latex");
				put2("lvp", "audio/vnd.lucent.voice");
				put2("lwp", "application/vnd.lotus-wordpro");
				put2("lzh", Arrays.asList(new String[] {
						"application/octet-stream", "application/x-lzh" }));
				put2("lzx", Arrays.asList(new String[] { "application/lzx",
						"application/octet-stream", "application/x-lzx" }));
				put2("m",
						Arrays.asList(new String[] { "text/plain", "text/x-m" }));
				put2("m13", "application/x-msmediaview");
				put2("m14", "application/x-msmediaview");
				put2("m1v", "video/mpeg");
				put2("m21", "application/mp21");
				put2("m2a", "audio/mpeg");
				put2("m2v", "video/mpeg");
				put2("m3u",
						Arrays.asList(new String[] { "audio/x-mpegurl",
								"audio/x-mpequrl" }));
				put2("m3u8", "application/vnd.apple.mpegurl");
				put2("m4v", "video/x-m4v");
				put2("ma", "application/mathematica");
				put2("mads", "application/mads+xml");
				put2("mag", "application/vnd.ecowin.chart");
				put2("man", "application/x-troff-man");
				put2("map", "application/x-navimap");
				put2("mar", "text/plain");
				put2("mathml", "application/mathml+xml");
				put2("mbd", "application/mbedlet");
				put2("mbk", "application/vnd.mobius.mbk");
				put2("mbox", "application/mbox");
				put2("mc$", "application/x-magic-cap-package-1.0");
				put2("mc1", "application/vnd.medcalcdata");
				put2("mcd", Arrays.asList(new String[] { "application/mcad",
						"application/vnd.mcd", "application/x-mathcad" }));
				put2("mcf", Arrays.asList(new String[] { "image/vasa",
						"text/mcf" }));
				put2("mcp", "application/netmc");
				put2("mcurl", "text/vnd.curl.mcurl");
				put2("mdb", "application/x-msaccess");
				put2("mdi", "image/vnd.ms-modi");
				put2("me", "application/x-troff-me");
				put2("meta4", "application/metalink4+xml");
				put2("mets", "application/mets+xml");
				put2("mfm", "application/vnd.mfmp");
				put2("mgp", "application/vnd.osgeo.mapguide.package");
				put2("mgz", "application/vnd.proteus.magazine");
				put2("mht", "message/rfc822");
				put2("mhtml", "message/rfc822");
				put2("mid",
						Arrays.asList(new String[] { "audio/mid", "audio/midi",
								"music/crescendo", "x-music/x-midi",
								"audio/x-midi", "application/x-midi",
								"audio/x-mid" }));
				put2("midi",
						Arrays.asList(new String[] { "audio/midi",
								"music/crescendo", "x-music/x-midi",
								"audio/x-midi", "application/x-midi",
								"audio/x-mid" }));
				put2("mif",
						Arrays.asList(new String[] { "application/vnd.mif",
								"application/x-mif", "application/x-frame" }));
				put2("mime",
						Arrays.asList(new String[] { "message/rfc822",
								"www/mime" }));
				put2("mj2", "video/mj2");
				put2("mjf", "audio/x-vnd.audioexplosion.mjuicemediafile");
				put2("mjpg", "video/x-motion-jpeg");
				put2("mlp", "application/vnd.dolby.mlp");
				put2("mm",
						Arrays.asList(new String[] { "application/base64",
								"application/x-meme" }));
				put2("mmd", "application/vnd.chipnuts.karaoke-mmd");
				put2("mme", "application/base64");
				put2("mmf", "application/vnd.smaf");
				put2("mmr", "image/vnd.fujixerox.edmics-mmr");
				put2("mny", "application/x-msmoney");
				put2("mod", Arrays.asList(new String[] { "audio/mod",
						"audio/x-mod" }));
				put2("mods", "application/mods+xml");
				put2("moov", "video/quicktime");
				put2("mov", "video/quicktime");
				put2("movie", "video/x-sgi-movie");
				put2("mp2",
						Arrays.asList(new String[] { "video/mpeg",
								"audio/mpeg", "video/x-mpeg", "audio/x-mpeg",
								"video/x-mpeq2a" }));
				put2("mp3",
						Arrays.asList(new String[] { "audio/mpeg",
								"audio/mpeg3", "video/mpeg", "audio/x-mpeg-3",
								"video/x-mpeg" }));
				put2("mp4",
						Arrays.asList(new String[] { "video/mp4",
								"application/mp4" }));
				put2("mp4a", "audio/mp4");
				put2("mpa", Arrays.asList(new String[] { "video/mpeg",
						"audio/mpeg" }));
				put2("mpc",
						Arrays.asList(new String[] {
								"application/vnd.mophun.certificate",
								"application/x-project" }));
				put2("mpe", "video/mpeg");
				put2("mpeg", "video/mpeg");
				put2("mpg", Arrays.asList(new String[] { "video/mpeg",
						"audio/mpeg" }));
				put2("mpga", "audio/mpeg");
				put2("mpkg", "application/vnd.apple.installer+xml");
				put2("mpm", "application/vnd.blueice.multipass");
				put2("mpn", "application/vnd.mophun.application");
				put2("mpp", "application/vnd.ms-project");
				put2("mpt", "application/x-project");
				put2("mpv", "application/x-project");
				put2("mpv2", "video/mpeg");
				put2("mpx", "application/x-project");
				put2("mpy", "application/vnd.ibm.minipay");
				put2("mqy", "application/vnd.mobius.mqy");
				put2("mrc", "application/marc");
				put2("mrcx", "application/marcxml+xml");
				put2("ms", "application/x-troff-ms");
				put2("mscml", "application/mediaservercontrol+xml");
				put2("mseq", "application/vnd.mseq");
				put2("msf", "application/vnd.epson.msf");
				put2("msg", "application/vnd.ms-outlook");
				put2("msh", "model/mesh");
				put2("msl", "application/vnd.mobius.msl");
				put2("msty", "application/vnd.muvee.style");
				put2("mts", "model/vnd.mts");
				put2("mus", "application/vnd.musician");
				put2("musicxml", "application/vnd.recordare.musicxml+xml");
				put2("mv", "video/x-sgi-movie");
				put2("mvb", "application/x-msmediaview");
				put2("mwf", "application/vnd.mfer");
				put2("mxf", "application/mxf");
				put2("mxl", "application/vnd.recordare.musicxml");
				put2("mxml", "application/xv+xml");
				put2("mxs", "application/vnd.triscape.mxs");
				put2("mxu", "video/vnd.mpegurl");
				put2("my", "audio/make");
				put2("mzz", "application/x-vnd.audioexplosion.mzz");
				put2("n-gage", "application/vnd.nokia.n-gage.symbian.install");
				put2("n3", "text/n3");
				put2("nap", "image/naplps");
				put2("naplps", "image/naplps");
				put2("nbp", "application/vnd.wolfram.player");
				put2("nc", "application/x-netcdf");
				put2("ncm", "application/vnd.nokia.configuration-message");
				put2("ncx", "application/x-dtbncx+xml");
				put2("ngdat", "application/vnd.nokia.n-gage.data");
				put2("nif", "image/x-niff");
				put2("niff", "image/x-niff");
				put2("nix", "application/x-mix-transfer");
				put2("nlu", "application/vnd.neurolanguage.nlu");
				put2("nml", "application/vnd.enliven");
				put2("nnd", "application/vnd.noblenet-directory");
				put2("nns", "application/vnd.noblenet-sealer");
				put2("nnw", "application/vnd.noblenet-web");
				put2("npx", "image/vnd.net-fpx");
				put2("nsc", "application/x-conference");
				put2("nsf", "application/vnd.lotus-notes");
				put2("nvd", "application/x-navidoc");
				put2("nws", "message/rfc822");
				put2("o", "application/octet-stream");
				put2("oa2", "application/vnd.fujitsu.oasys2");
				put2("oa3", "application/vnd.fujitsu.oasys3");
				put2("oas", "application/vnd.fujitsu.oasys");
				put2("obd", "application/x-msbinder");
				put2("oda", "application/oda");
				put2("odb", "application/vnd.oasis.opendocument.database");
				put2("odc", "application/vnd.oasis.opendocument.chart");
				put2("odf", "application/vnd.oasis.opendocument.formula");
				put2("odft",
						"application/vnd.oasis.opendocument.formula-template");
				put2("odg", "application/vnd.oasis.opendocument.graphics");
				put2("odi", "application/vnd.oasis.opendocument.image");
				put2("odm", "application/vnd.oasis.opendocument.text-master");
				put2("odp", "application/vnd.oasis.opendocument.presentation");
				put2("ods", "application/vnd.oasis.opendocument.spreadsheet");
				put2("odt", "application/vnd.oasis.opendocument.text");
				put2("oga", "audio/ogg");
				put2("ogv", "video/ogg");
				put2("ogx", "application/ogg");
				put2("omc", "application/x-omc");
				put2("omcd", "application/x-omcdatamaker");
				put2("omcr", "application/x-omcregerator");
				put2("onetoc", "application/onenote");
				put2("opf", "application/oebps-package+xml");
				put2("org", "application/vnd.lotus-organizer");
				put2("osf", "application/vnd.yamaha.openscoreformat");
				put2("osfpvg",
						"application/vnd.yamaha.openscoreformat.osfpvg+xml");
				put2("otc", "application/vnd.oasis.opendocument.chart-template");
				put2("otf", "application/x-font-otf");
				put2("otg",
						"application/vnd.oasis.opendocument.graphics-template");
				put2("oth", "application/vnd.oasis.opendocument.text-web");
				put2("oti", "application/vnd.oasis.opendocument.image-template");
				put2("otp",
						"application/vnd.oasis.opendocument.presentation-template");
				put2("ots",
						"application/vnd.oasis.opendocument.spreadsheet-template");
				put2("ott", "application/vnd.oasis.opendocument.text-template");
				put2("oxt", "application/vnd.openofficeorg.extension");
				put2("p", "text/x-pascal");
				put2("p10",
						Arrays.asList(new String[] { "application/pkcs10",
								"application/x-pkcs10" }));
				put2("p12",
						Arrays.asList(new String[] { "application/pkcs-12",
								"application/x-pkcs12" }));
				put2("p7a", "application/x-pkcs7-signature");
				put2("p7b", "application/x-pkcs7-certificates");
				put2("p7c",
						Arrays.asList(new String[] { "application/pkcs7-mime",
								"application/x-pkcs7-mime" }));
				put2("p7m",
						Arrays.asList(new String[] { "application/pkcs7-mime",
								"application/x-pkcs7-mime" }));
				put2("p7r", "application/x-pkcs7-certreqresp");
				put2("p7s",
						Arrays.asList(new String[] {
								"application/pkcs7-signature",
								"application/x-pkcs7-signature" }));
				put2("p8", "application/pkcs8");
				put2("par", "text/plain-bas");
				put2("part", "application/pro_eng");
				put2("pas", "text/pascal");
				put2("paw", "application/vnd.pawaafile");
				put2("pbd", "application/vnd.powerbuilder6");
				put2("pbm", "image/x-portable-bitmap");
				put2("pcf", "application/x-font-pcf");
				put2("pcl",
						Arrays.asList(new String[] { "application/vnd.hp-pcl",
								"application/x-pcl" }));
				put2("pclxl", "application/vnd.hp-pclxl");
				put2("pct", "image/x-pict");
				put2("pcurl", "application/vnd.curl.pcurl");
				put2("pcx", "image/x-pcx");
				put2("pdb",
						Arrays.asList(new String[] { "application/vnd.palm",
								"chemical/x-pdb" }));
				put2("pdf", "application/pdf");
				put2("pfa", "application/x-font-type1");
				put2("pfr", "application/font-tdpfr");
				put2("pfunk",
						Arrays.asList(new String[] { "audio/make",
								"audio/make.my.funk" }));
				put2("pfx", "application/x-pkcs12");
				put2("pgm",
						Arrays.asList(new String[] {
								"image/x-portable-graymap",
								"image/x-portable-greymap" }));
				put2("pgn", "application/x-chess-pgn");
				put2("pgp", "application/pgp-signature");
				put2("pic",
						Arrays.asList(new String[] { "image/pict",
								"image/x-pict" }));
				put2("pict", "image/pict");
				put2("pkg", "application/x-newton-compatible-pkg");
				put2("pki", "application/pkixcmp");
				put2("pkipath", "application/pkix-pkipath");
				put2("pko",
						Arrays.asList(new String[] {
								"application/ynd.ms-pkipko",
								"application/vnd.ms-pki.pko" }));
				put2("pl",
						Arrays.asList(new String[] { "text/plain",
								"text/x-script.perl" }));
				put2("plb", "application/vnd.3gpp.pic-bw-large");
				put2("plc", "application/vnd.mobius.plc");
				put2("plf", "application/vnd.pocketlearn");
				put2("pls", "application/pls+xml");
				put2("plx", "application/x-pixclscript");
				put2("pm", Arrays.asList(new String[] {
						"text/x-script.perl-module", "image/x-xpixmap" }));
				put2("pm4", "application/x-pagemaker");
				put2("pm5", "application/x-pagemaker");
				put2("pma", "application/x-perfmon");
				put2("pmc", "application/x-perfmon");
				put2("pml",
						Arrays.asList(new String[] {
								"application/vnd.ctc-posml",
								"application/x-perfmon" }));
				put2("pmr", "application/x-perfmon");
				put2("pmw", "application/x-perfmon");
				put2("png", "image/png");
				put2("pnm",
						Arrays.asList(new String[] {
								"application/x-portable-anymap",
								"image/x-portable-anymap" }));
				put2("portpkg", "application/vnd.macports.portpkg");
				put2("pot",
						Arrays.asList(new String[] {
								"application/vnd.ms-powerpoint",
								"application/mspowerpoint" }));
				put2("potm",
						"application/vnd.ms-powerpoint.template.macroenabled.12");
				put2("potx",
						"application/vnd.openxmlformats-officedocument.presentationml.template");
				put2("pov", "model/x-pov");
				put2("ppa", "application/vnd.ms-powerpoint");
				put2("ppam",
						"application/vnd.ms-powerpoint.addin.macroenabled.12");
				put2("ppd", "application/vnd.cups-ppd");
				put2("ppm", "image/x-portable-pixmap");
				put2("pps",
						Arrays.asList(new String[] {
								"application/vnd.ms-powerpoint",
								"application/mspowerpoint" }));
				put2("ppsm",
						"application/vnd.ms-powerpoint.slideshow.macroenabled.12");
				put2("ppsx",
						"application/vnd.openxmlformats-officedocument.presentationml.slideshow");
				put2("ppt",
						Arrays.asList(new String[] {
								"application/vnd.ms-powerpoint",
								"application/mspowerpoint",
								"application/powerpoint",
								"application/x-mspowerpoint" }));
				put2("pptm",
						"application/vnd.ms-powerpoint.presentation.macroenabled.12");
				put2("pptx",
						"application/vnd.openxmlformats-officedocument.presentationml.presentation");
				put2("ppz", "application/mspowerpoint");
				put2("prc", "application/x-mobipocket-ebook");
				put2("pre",
						Arrays.asList(new String[] {
								"application/vnd.lotus-freelance",
								"application/x-freelance" }));
				put2("prf", "application/pics-rules");
				put2("prt", "application/pro_eng");
				put2("ps", "application/postscript");
				put2("psb", "application/vnd.3gpp.pic-bw-small");
				put2("psd",
						Arrays.asList(new String[] {
								"application/octet-stream",
								"image/vnd.adobe.photoshop" }));
				put2("psf", "application/x-font-linux-psf");
				put2("pskcxml", "application/pskc+xml");
				put2("ptid", "application/vnd.pvi.ptid1");
				put2("pub", "application/x-mspublisher");
				put2("pvb", "application/vnd.3gpp.pic-bw-var");
				put2("pvu", "paleovu/x-pv");
				put2("pwn", "application/vnd.3m.post-it-notes");
				put2("pwz", "application/vnd.ms-powerpoint");
				put2("py", "text/x-script.phyton");
				put2("pya", "audio/vnd.ms-playready.media.pya");
				put2("pyc", "applicaiton/x-bytecode.python");
				put2("pyv", "video/vnd.ms-playready.media.pyv");
				put2("qam", "application/vnd.epson.quickanime");
				put2("qbo", "application/vnd.intu.qbo");
				put2("qcp", "audio/vnd.qcelp");
				put2("qd3", "x-world/x-3dmf");
				put2("qd3d", "x-world/x-3dmf");
				put2("qfx", "application/vnd.intu.qfx");
				put2("qif", "image/x-quicktime");
				put2("qps", "application/vnd.publishare-delta-tree");
				put2("qt", "video/quicktime");
				put2("qtc", "video/x-qtc");
				put2("qti", "image/x-quicktime");
				put2("qtif", "image/x-quicktime");
				put2("qxd", "application/vnd.quark.quarkxpress");
				put2("ra",
						Arrays.asList(new String[] { "audio/x-realaudio",
								"audio/x-pn-realaudio",
								"audio/x-pn-realaudio-plugin" }));
				put2("ram", "audio/x-pn-realaudio");
				put2("rar", "application/x-rar-compressed");
				put2("ras",
						Arrays.asList(new String[] { "image/cmu-raster",
								"application/x-cmu-raster",
								"image/x-cmu-raster" }));
				put2("rast", "image/cmu-raster");
				put2("rcprofile", "application/vnd.ipunplugged.rcprofile");
				put2("rdf", "application/rdf+xml");
				put2("rdz", "application/vnd.data-vision.rdz");
				put2("rep", "application/vnd.businessobjects");
				put2("res", "application/x-dtbresource+xml");
				put2("rexx", "text/x-script.rexx");
				put2("rf", "image/vnd.rn-realflash");
				put2("rgb", "image/x-rgb");
				put2("rif", "application/reginfo+xml");
				put2("rip", "audio/vnd.rip");
				put2("rl", "application/resource-lists+xml");
				put2("rlc", "image/vnd.fujixerox.edmics-rlc");
				put2("rld", "application/resource-lists-diff+xml");
				put2("rm",
						Arrays.asList(new String[] {
								"application/vnd.rn-realmedia",
								"audio/x-pn-realaudio" }));
				put2("rmi", "audio/mid");
				put2("rmm", "audio/x-pn-realaudio");
				put2("rmp",
						Arrays.asList(new String[] {
								"audio/x-pn-realaudio-plugin",
								"audio/x-pn-realaudio" }));
				put2("rms", "application/vnd.jcp.javame.midlet-rms");
				put2("rnc", "application/relax-ng-compact-syntax");
				put2("rng",
						Arrays.asList(new String[] {
								"application/ringing-tones",
								"application/vnd.nokia.ringing-tone" }));
				put2("rnx", "application/vnd.rn-realplayer");
				put2("roff", "application/x-troff");
				put2("rp", "image/vnd.rn-realpix");
				put2("rp9", "application/vnd.cloanto.rp9");
				put2("rpm", "audio/x-pn-realaudio-plugin");
				put2("rpss", "application/vnd.nokia.radio-presets");
				put2("rpst", "application/vnd.nokia.radio-preset");
				put2("rq", "application/sparql-query");
				put2("rs", "application/rls-services+xml");
				put2("rsd", "application/rsd+xml");
				put2("rt",
						Arrays.asList(new String[] { "text/richtext",
								"text/vnd.rn-realtext" }));
				put2("rtf",
						Arrays.asList(new String[] { "application/rtf",
								"text/richtext", "application/x-rtf" }));
				put2("rtx",
						Arrays.asList(new String[] { "text/richtext",
								"application/rtf" }));
				put2("rv", "video/vnd.rn-realvideo");
				put2("s", "text/x-asm");
				put2("s3m", "audio/s3m");
				put2("saf", "application/vnd.yamaha.smaf-audio");
				put2("saveme", "application/octet-stream");
				put2("sbk", "application/x-tbook");
				put2("sbml", "application/sbml+xml");
				put2("sc", "application/vnd.ibm.secure-container");
				put2("scd", "application/x-msschedule");
				put2("scm",
						Arrays.asList(new String[] {
								"application/vnd.lotus-screencam",
								"video/x-scm", "text/x-script.guile",
								"application/x-lotusscreencam",
								"text/x-script.scheme" }));
				put2("scq", "application/scvp-cv-request");
				put2("scs", "application/scvp-cv-response");
				put2("sct", "text/scriptlet");
				put2("scurl", "text/vnd.curl.scurl");
				put2("sda", "application/vnd.stardivision.draw");
				put2("sdc", "application/vnd.stardivision.calc");
				put2("sdd", "application/vnd.stardivision.impress");
				put2("sdkm", "application/vnd.solent.sdkm+xml");
				put2("sdml", "text/plain");
				put2("sdp",
						Arrays.asList(new String[] { "application/sdp",
								"application/x-sdp" }));
				put2("sdr", "application/sounder");
				put2("sdw", "application/vnd.stardivision.writer");
				put2("sea",
						Arrays.asList(new String[] { "application/sea",
								"application/x-sea" }));
				put2("see", "application/vnd.seemail");
				put2("seed", "application/vnd.fdsn.seed");
				put2("sema", "application/vnd.sema");
				put2("semd", "application/vnd.semd");
				put2("semf", "application/vnd.semf");
				put2("ser", "application/java-serialized-object");
				put2("set", "application/set");
				put2("setpay", "application/set-payment-initiation");
				put2("setreg", "application/set-registration-initiation");
				put2("sfd-hdstx", "application/vnd.hydrostatix.sof-data");
				put2("sfs", "application/vnd.spotfire.sfs");
				put2("sgl", "application/vnd.stardivision.writer-global");
				put2("sgm", Arrays.asList(new String[] { "text/sgml",
						"text/x-sgml" }));
				put2("sgml", Arrays.asList(new String[] { "text/sgml",
						"text/x-sgml" }));
				put2("sh",
						Arrays.asList(new String[] { "application/x-shar",
								"application/x-bsh", "application/x-sh",
								"text/x-script.sh" }));
				put2("shar",
						Arrays.asList(new String[] { "application/x-bsh",
								"application/x-shar" }));
				put2("shf", "application/shf+xml");
				put2("shtml",
						Arrays.asList(new String[] { "text/html",
								"text/x-server-parsed-html" }));
				put2("sid", "audio/x-psid");
				put2("sis", "application/vnd.symbian.install");
				put2("sit",
						Arrays.asList(new String[] { "application/x-stuffit",
								"application/x-sit" }));
				put2("sitx", "application/x-stuffitx");
				put2("skd", "application/x-koan");
				put2("skm", "application/x-koan");
				put2("skp",
						Arrays.asList(new String[] { "application/vnd.koan",
								"application/x-koan" }));
				put2("skt", "application/x-koan");
				put2("sl", "application/x-seelogo");
				put2("sldm",
						"application/vnd.ms-powerpoint.slide.macroenabled.12");
				put2("sldx",
						"application/vnd.openxmlformats-officedocument.presentationml.slide");
				put2("slt", "application/vnd.epson.salt");
				put2("sm", "application/vnd.stepmania.stepchart");
				put2("smf", "application/vnd.stardivision.math");
				put2("smi",
						Arrays.asList(new String[] { "application/smil",
								"application/smil+xml" }));
				put2("smil", "application/smil");
				put2("snd",
						Arrays.asList(new String[] { "audio/basic",
								"audio/x-adpcm" }));
				put2("snf", "application/x-font-snf");
				put2("sol", "application/solids");
				put2("spc",
						Arrays.asList(new String[] { "text/x-speech",
								"application/x-pkcs7-certificates" }));
				put2("spf", "application/vnd.yamaha.smaf-phrase");
				put2("spl",
						Arrays.asList(new String[] {
								"application/futuresplash",
								"application/x-futuresplash" }));
				put2("spot", "text/vnd.in3d.spot");
				put2("spp", "application/scvp-vp-response");
				put2("spq", "application/scvp-vp-request");
				put2("spr", "application/x-sprite");
				put2("sprite", "application/x-sprite");
				put2("src", "application/x-wais-source");
				put2("sru", "application/sru+xml");
				put2("srx", "application/sparql-results+xml");
				put2("sse", "application/vnd.kodak-descriptor");
				put2("ssf", "application/vnd.epson.ssf");
				put2("ssi", "text/x-server-parsed-html");
				put2("ssm", "application/streamingmedia");
				put2("ssml", "application/ssml+xml");
				put2("sst",
						Arrays.asList(new String[] {
								"application/vnd.ms-pkicertstore",
								"application/vnd.ms-pki.certstore" }));
				put2("st", "application/vnd.sailingtracker.track");
				put2("stc", "application/vnd.sun.xml.calc.template");
				put2("std", "application/vnd.sun.xml.draw.template");
				put2("step", "application/step");
				put2("stf", "application/vnd.wt.stf");
				put2("sti", "application/vnd.sun.xml.impress.template");
				put2("stk", "application/hyperstudio");
				put2("stl",
						Arrays.asList(new String[] {
								"application/vnd.ms-pkistl", "application/sla",
								"application/vnd.ms-pki.stl",
								"application/x-navistyle" }));
				put2("stm", "text/html");
				put2("stp", "application/step");
				put2("str", "application/vnd.pg.format");
				put2("stw", "application/vnd.sun.xml.writer.template");
				put2("sub", "image/vnd.dvb.subtitle");
				put2("sus", "application/vnd.sus-calendar");
				put2("sv4cpio", "application/x-sv4cpio");
				put2("sv4crc", "application/x-sv4crc");
				put2("svc", "application/vnd.dvb.service");
				put2("svd", "application/vnd.svd");
				put2("svf",
						Arrays.asList(new String[] { "image/vnd.dwg",
								"image/x-dwg" }));
				put2("svg", "image/svg+xml");
				put2("svr",
						Arrays.asList(new String[] { "x-world/x-svr",
								"application/x-world" }));
				put2("swf", "application/x-shockwave-flash");
				put2("swi", "application/vnd.aristanetworks.swi");
				put2("sxc", "application/vnd.sun.xml.calc");
				put2("sxd", "application/vnd.sun.xml.draw");
				put2("sxg", "application/vnd.sun.xml.writer.global");
				put2("sxi", "application/vnd.sun.xml.impress");
				put2("sxm", "application/vnd.sun.xml.math");
				put2("sxw", "application/vnd.sun.xml.writer");
				put2("t",
						Arrays.asList(new String[] { "text/troff",
								"application/x-troff" }));
				put2("talk", "text/x-speech");
				put2("tao", "application/vnd.tao.intent-module-archive");
				put2("tar", "application/x-tar");
				put2("tbk",
						Arrays.asList(new String[] { "application/toolbook",
								"application/x-tbook" }));
				put2("tcap", "application/vnd.3gpp2.tcap");
				put2("tcl",
						Arrays.asList(new String[] { "text/x-script.tcl",
								"application/x-tcl" }));
				put2("tcsh", "text/x-script.tcsh");
				put2("teacher", "application/vnd.smart.teacher");
				put2("tei", "application/tei+xml");
				put2("tex", "application/x-tex");
				put2("texi", "application/x-texinfo");
				put2("texinfo", "application/x-texinfo");
				put2("text",
						Arrays.asList(new String[] { "application/plain",
								"text/plain" }));
				put2("tfi", "application/thraud+xml");
				put2("tfm", "application/x-tex-tfm");
				put2("tgz",
						Arrays.asList(new String[] { "application/gnutar",
								"application/x-compressed" }));
				put2("thmx", "application/vnd.ms-officetheme");
				put2("tif",
						Arrays.asList(new String[] { "image/tiff",
								"image/x-tiff" }));
				put2("tiff",
						Arrays.asList(new String[] { "image/tiff",
								"image/x-tiff" }));
				put2("tmo", "application/vnd.tmobile-livetv");
				put2("torrent", "application/x-bittorrent");
				put2("tpl", "application/vnd.groove-tool-template");
				put2("tpt", "application/vnd.trid.tpt");
				put2("tr", "application/x-troff");
				put2("tra", "application/vnd.trueapp");
				put2("trm", "application/x-msterminal");
				put2("tsd", "application/timestamped-data");
				put2("tsi", "audio/tsp-audio");
				put2("tsp",
						Arrays.asList(new String[] { "application/dsptype",
								"audio/tsplayer" }));
				put2("tsv", "text/tab-separated-values");
				put2("ttf", "application/x-font-ttf");
				put2("ttl", "text/turtle");
				put2("turbot", "image/florian");
				put2("twd", "application/vnd.simtech-mindmapper");
				put2("txd", "application/vnd.genomatix.tuxedo");
				put2("txf", "application/vnd.mobius.txf");
				put2("txt", "text/plain");
				put2("ufd", "application/vnd.ufdl");
				put2("uil", "text/x-uil");
				put2("uls", "text/iuls");
				put2("umj", "application/vnd.umajin");
				put2("uni", "text/uri-list");
				put2("unis", "text/uri-list");
				put2("unityweb", "application/vnd.unity");
				put2("unv", "application/i-deas");
				put2("uoml", "application/vnd.uoml+xml");
				put2("uri", "text/uri-list");
				put2("uris", "text/uri-list");
				put2("ustar",
						Arrays.asList(new String[] { "application/x-ustar",
								"multipart/x-ustar" }));
				put2("utz", "application/vnd.uiq.theme");
				put2("uu", Arrays.asList(new String[] {
						"application/octet-stream", "text/x-uuencode" }));
				put2("uue", "text/x-uuencode");
				put2("uva", "audio/vnd.dece.audio");
				put2("uvh", "video/vnd.dece.hd");
				put2("uvi", "image/vnd.dece.graphic");
				put2("uvm", "video/vnd.dece.mobile");
				put2("uvp", "video/vnd.dece.pd");
				put2("uvs", "video/vnd.dece.sd");
				put2("uvu", "video/vnd.uvvu.mp4");
				put2("uvv", "video/vnd.dece.video");
				put2("vcd", "application/x-cdlink");
				put2("vcf", "text/x-vcard");
				put2("vcg", "application/vnd.groove-vcard");
				put2("vcs", "text/x-vcalendar");
				put2("vcx", "application/vnd.vcx");
				put2("vda", "application/vda");
				put2("vdo", "video/vdo");
				put2("vew", "application/groupwise");
				put2("vis", "application/vnd.visionary");
				put2("viv",
						Arrays.asList(new String[] { "video/vivo",
								"video/vnd.vivo" }));
				put2("vivo",
						Arrays.asList(new String[] { "video/vivo",
								"video/vnd.vivo" }));
				put2("vmd", "application/vocaltec-media-desc");
				put2("vmf", "application/vocaltec-media-file");
				put2("voc", Arrays.asList(new String[] { "audio/voc",
						"audio/x-voc" }));
				put2("vos", "video/vosaic");
				put2("vox", "audio/voxware");
				put2("vqe", "audio/x-twinvq-plugin");
				put2("vqf", "audio/x-twinvq");
				put2("vql", "audio/x-twinvq-plugin");
				put2("vrml",
						Arrays.asList(new String[] { "model/vrml",
								"x-world/x-vrml", "application/x-vrml" }));
				put2("vrt", "x-world/x-vrt");
				put2("vsd",
						Arrays.asList(new String[] { "application/vnd.visio",
								"application/x-visio" }));
				put2("vsf", "application/vnd.vsf");
				put2("vst", "application/x-visio");
				put2("vsw", "application/x-visio");
				put2("vtu", "model/vnd.vtu");
				put2("vxml", "application/voicexml+xml");
				put2("w60", "application/wordperfect6.0");
				put2("w61", "application/wordperfect6.1");
				put2("w6w", "application/msword");
				put2("wad", "application/x-doom");
				put2("wav", Arrays.asList(new String[] { "audio/wav",
						"audio/x-wav" }));
				put2("wax", "audio/x-ms-wax");
				put2("wb1", "application/x-qpro");
				put2("wbmp", "image/vnd.wap.wbmp");
				put2("wbs", "application/vnd.criticaltools.wbs+xml");
				put2("wbxml", "application/vnd.wap.wbxml");
				put2("wcm", "application/vnd.ms-works");
				put2("wdb", "application/vnd.ms-works");
				put2("web", "application/vnd.xara");
				put2("weba", "audio/webm");
				put2("webm", "video/webm");
				put2("webp", "image/webp");
				put2("wg", "application/vnd.pmi.widget");
				put2("wgt", "application/widget");
				put2("wiz", "application/msword");
				put2("wk1", "application/x-123");
				put2("wks", "application/vnd.ms-works");
				put2("wm", "video/x-ms-wm");
				put2("wma", "audio/x-ms-wma");
				put2("wmd", "application/x-ms-wmd");
				put2("wmf",
						Arrays.asList(new String[] { "windows/metafile",
								"application/x-msmetafile" }));
				put2("wml", "text/vnd.wap.wml");
				put2("wmlc", "application/vnd.wap.wmlc");
				put2("wmls", "text/vnd.wap.wmlscript");
				put2("wmlsc", "application/vnd.wap.wmlscriptc");
				put2("wmv", "video/x-ms-wmv");
				put2("wmx", "video/x-ms-wmx");
				put2("wmz", "application/x-ms-wmz");
				put2("woff", "application/x-font-woff");
				put2("word", "application/msword");
				put2("wp", "application/wordperfect");
				put2("wp5",
						Arrays.asList(new String[] { "application/wordperfect",
								"application/wordperfect6.0" }));
				put2("wp6", "application/wordperfect");
				put2("wpd",
						Arrays.asList(new String[] { "application/wordperfect",
								"application/vnd.wordperfect",
								"application/x-wpwin" }));
				put2("wpl", "application/vnd.ms-wpl");
				put2("wps", "application/vnd.ms-works");
				put2("wq1", "application/x-lotus");
				put2("wqd", "application/vnd.wqd");
				put2("wri",
						Arrays.asList(new String[] { "application/mswrite",
								"application/x-wri", "application/x-mswrite" }));
				put2("wrl",
						Arrays.asList(new String[] { "model/vrml",
								"x-world/x-vrml", "application/x-world" }));
				put2("wrz",
						Arrays.asList(new String[] { "model/vrml",
								"x-world/x-vrml" }));
				put2("wsc", "text/scriplet");
				put2("wsdl", "application/wsdl+xml");
				put2("wspolicy", "application/wspolicy+xml");
				put2("wsrc", "application/x-wais-source");
				put2("wtb", "application/vnd.webturbo");
				put2("wtk", "application/x-wintalk");
				put2("wvx", "video/x-ms-wvx");
				put2("x-png", "image/png");
				put2("x3d", "application/vnd.hzn-3d-crossword");
				put2("xaf", "x-world/x-vrml");
				put2("xap", "application/x-silverlight-app");
				put2("xar", "application/vnd.xara");
				put2("xbap", "application/x-ms-xbap");
				put2("xbd", "application/vnd.fujixerox.docuworks.binder");
				put2("xbm",
						Arrays.asList(new String[] { "image/xbm",
								"image/x-xbm", "image/x-xbitmap" }));
				put2("xdf", "application/xcap-diff+xml");
				put2("xdm", "application/vnd.syncml.dm+xml");
				put2("xdp", "application/vnd.adobe.xdp+xml");
				put2("xdr", "video/x-amt-demorun");
				put2("xdssc", "application/dssc+xml");
				put2("xdw", "application/vnd.fujixerox.docuworks");
				put2("xenc", "application/xenc+xml");
				put2("xer", "application/patch-ops-error+xml");
				put2("xfdf", "application/vnd.adobe.xfdf");
				put2("xfdl", "application/vnd.xfdl");
				put2("xgz", "xgl/drawing");
				put2("xhtml", "application/xhtml+xml");
				put2("xif", "image/vnd.xiff");
				put2("xl", "application/excel");
				put2("xla",
						Arrays.asList(new String[] {
								"application/vnd.ms-excel",
								"application/excel", "application/x-msexcel",
								"application/x-excel" }));
				put2("xlam", "application/vnd.ms-excel.addin.macroenabled.12");
				put2("xlb",
						Arrays.asList(new String[] { "application/excel",
								"application/vnd.ms-excel",
								"application/x-excel" }));
				put2("xlc",
						Arrays.asList(new String[] {
								"application/vnd.ms-excel",
								"application/excel", "application/x-excel" }));
				put2("xld",
						Arrays.asList(new String[] { "application/excel",
								"application/x-excel" }));
				put2("xlk",
						Arrays.asList(new String[] { "application/excel",
								"application/x-excel" }));
				put2("xll",
						Arrays.asList(new String[] { "application/excel",
								"application/vnd.ms-excel",
								"application/x-excel" }));
				put2("xlm",
						Arrays.asList(new String[] {
								"application/vnd.ms-excel",
								"application/excel", "application/x-excel" }));
				put2("xls",
						Arrays.asList(new String[] {
								"application/vnd.ms-excel",
								"application/excel", "application/x-msexcel",
								"application/x-excel" }));
				put2("xlsb",
						"application/vnd.ms-excel.sheet.binary.macroenabled.12");
				put2("xlsm", "application/vnd.ms-excel.sheet.macroenabled.12");
				put2("xlsx",
						"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
				put2("xlt",
						Arrays.asList(new String[] {
								"application/vnd.ms-excel",
								"application/excel", "application/x-excel" }));
				put2("xltm",
						"application/vnd.ms-excel.template.macroenabled.12");
				put2("xltx",
						"application/vnd.openxmlformats-officedocument.spreadsheetml.template");
				put2("xlv",
						Arrays.asList(new String[] { "application/excel",
								"application/x-excel" }));
				put2("xlw",
						Arrays.asList(new String[] {
								"application/vnd.ms-excel",
								"application/excel", "application/x-msexcel",
								"application/x-excel" }));
				put2("xm", "audio/xm");
				put2("xml",
						Arrays.asList(new String[] { "application/xml",
								"text/xml", "application/atom+xml",
								"application/rss+xml" }));
				put2("xmz", "xgl/movie");
				put2("xo", "application/vnd.olpc-sugar");
				put2("xof", "x-world/x-vrml");
				put2("xop", "application/xop+xml");
				put2("xpi", "application/x-xpinstall");
				put2("xpix", "application/x-vnd.ls-xpix");
				put2("xpm",
						Arrays.asList(new String[] { "image/xpm",
								"image/x-xpixmap" }));
				put2("xpr", "application/vnd.is-xpr");
				put2("xps", "application/vnd.ms-xpsdocument");
				put2("xpw", "application/vnd.intercon.formnet");
				put2("xslt", "application/xslt+xml");
				put2("xsm", "application/vnd.syncml+xml");
				put2("xspf", "application/xspf+xml");
				put2("xsr", "video/x-amt-showrun");
				put2("xul", "application/vnd.mozilla.xul+xml");
				put2("xwd",
						Arrays.asList(new String[] { "image/x-xwd",
								"image/x-xwindowdump" }));
				put2("xyz",
						Arrays.asList(new String[] { "chemical/x-xyz",
								"chemical/x-pdb" }));
				put2("yang", "application/yang");
				put2("yin", "application/yin+xml");
				put2("z",
						Arrays.asList(new String[] {
								"application/x-compressed",
								"application/x-compress" }));
				put2("zaz", "application/vnd.zzazz.deck+xml");
				put2("zip",
						Arrays.asList(new String[] { "application/zip",
								"multipart/x-zip",
								"application/x-zip-compressed",
								"application/x-compressed" }));
				put2("zir", "application/vnd.zul");
				put2("zmm", "application/vnd.handheld-entertainment+xml");
				put2("zoo", "application/octet-stream");
				put2("zsh", "text/x-script.zsh");
			}
		};
	}

	/***
	 * Returns the corresponding MIME type to the given extension. If no MIME
	 * type was found it returns 'application/octet-stream' type.
	 */
	public static String getMimeType(String ext) {
		String mimeType = null;

		if (ext != null && ext.length() > 0) {
			int pos = ext.lastIndexOf(".") + 1;

			mimeType = "application/octet-stream";
			if (pos < ext.length()) {
				Object obj = extNameMapping.get(ext.substring(pos)
						.toLowerCase());

				if (obj instanceof List) {
					obj = ((List) obj).get(0);
				}
				mimeType = obj.toString();
			}
		}
		return mimeType;
	}

	/***
	 * Returns the ext name to the given MIME type.
	 */
	public static String getExtName(String type) {
		String extName = null;

		if (type != null && type.length() > 0) {
			Object obj = mimeTypeMapping.get(type.toLowerCase());

			if ("application/octet-stream".equalsIgnoreCase(type)) {
				extName = "";
			} else if (obj != null) {
				if (obj instanceof List) {
					obj = ((List) obj).get(0);
				}
				extName = obj.toString();
			}
		}
		return extName;
	}
	public static boolean isOfficeDocument(String fileName) {
		String name = "." + fileName;

		return (name.toLowerCase().endsWith(".doc")
				|| name.toLowerCase().endsWith(".rtf")
				|| name.toLowerCase().endsWith(".mht")
				|| name.toLowerCase().endsWith(".mhtml")
				|| name.toLowerCase().endsWith(".eml")
				|| name.toLowerCase().endsWith(".nws")
				|| name.toLowerCase().endsWith(".mime")
				|| name.toLowerCase().endsWith(".docm")
				|| name.toLowerCase().endsWith(".docx")
				|| name.toLowerCase().endsWith(".dotx")
				|| name.toLowerCase().endsWith(".dot")
				|| name.toLowerCase().endsWith(".dotm")
				|| name.toLowerCase().endsWith(".odt")
				|| name.toLowerCase().endsWith(".txt")
				|| name.toLowerCase().endsWith(".java")
				|| name.toLowerCase().endsWith(".js")
				|| name.toLowerCase().endsWith(".c")
				|| name.toLowerCase().endsWith(".cpp")
				|| name.toLowerCase().endsWith(".html")
				|| name.toLowerCase().endsWith(".htm")
				|| name.toLowerCase().endsWith(".jsp")
				|| name.toLowerCase().endsWith(".css")
				|| name.toLowerCase().endsWith(".xml")
				|| name.toLowerCase().endsWith(".properties")
				|| name.toLowerCase().endsWith(".log")
				|| name.toLowerCase().endsWith(".csv")
				|| name.toLowerCase().endsWith(".xls")
				|| name.toLowerCase().endsWith(".xlsb")
				|| name.toLowerCase().endsWith(".xlsm")
				|| name.toLowerCase().endsWith(".xlsx")
				|| name.toLowerCase().endsWith(".xlt")
				|| name.toLowerCase().endsWith(".xltm")
				|| name.toLowerCase().endsWith(".xltx")
				|| name.toLowerCase().endsWith(".xlw")
				|| name.toLowerCase().endsWith(".ods")
				|| name.toLowerCase().endsWith(".ppt")
				|| name.toLowerCase().endsWith(".pot")
				|| name.toLowerCase().endsWith(".potm")
				|| name.toLowerCase().endsWith(".potx")
				|| name.toLowerCase().endsWith(".ppsm")
				|| name.toLowerCase().endsWith(".pptm")
				|| name.toLowerCase().endsWith(".pptx")
				|| name.toLowerCase().endsWith(".odp")
				|| name.toLowerCase().endsWith(".pps") || name.toLowerCase()
				.endsWith(".ppsx"));
	}

	public static boolean isCADDocument(String fileName) {
		String name = "." + fileName;

		return (name.toLowerCase().endsWith(".dwg")
				|| name.toLowerCase().endsWith(".dft")
				|| name.toLowerCase().endsWith(".dws")
				|| name.toLowerCase().endsWith(".dxf") || name.toLowerCase()
				.endsWith(".dwt"));
	}

	public static boolean isPDFDocument(String fileName) {
		String name = "." + fileName;

		return (name.toLowerCase().endsWith(".pdf"))
				|| (name.toLowerCase().endsWith(".caj"));
	}

	public static boolean isWpsDocument(String fileName) {
		String name = "." + fileName;

		return (name.toLowerCase().endsWith(".wps")
				|| name.toLowerCase().endsWith(".wpt")
				|| name.toLowerCase().endsWith(".et")
				|| name.toLowerCase().endsWith(".ett")
				|| name.toLowerCase().endsWith(".dpt") || name.toLowerCase()
				.endsWith(".dps"));
	}

	public static boolean isImageFile(String fileName) {
		String name = "." + fileName;

		return (name.toLowerCase().endsWith(".jpg") || name.toLowerCase().endsWith(".png")
				|| name.toLowerCase().endsWith(".gif"));
	}
}
