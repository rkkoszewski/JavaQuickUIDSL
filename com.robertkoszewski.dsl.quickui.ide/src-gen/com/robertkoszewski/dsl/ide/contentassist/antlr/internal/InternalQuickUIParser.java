package com.robertkoszewski.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.robertkoszewski.dsl.services.QuickUIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuickUIParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TODO'", "'false'", "'use'", "':'", "'.'", "'{'", "'}'", "'Menu'", "'Content'", "'Row'", "'Label'", "'Enabled'", "'if'", "'is'", "'and'", "'empty'", "'checked'", "'Checked'", "'OnClick'", "'Filter'", "'Main'", "'not'", "'true'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalQuickUIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuickUIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuickUIParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQuickUI.g"; }


    	private QuickUIGrammarAccess grammarAccess;

    	public void setGrammarAccess(QuickUIGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleUIModel"
    // InternalQuickUI.g:53:1: entryRuleUIModel : ruleUIModel EOF ;
    public final void entryRuleUIModel() throws RecognitionException {
        try {
            // InternalQuickUI.g:54:1: ( ruleUIModel EOF )
            // InternalQuickUI.g:55:1: ruleUIModel EOF
            {
             before(grammarAccess.getUIModelRule()); 
            pushFollow(FOLLOW_1);
            ruleUIModel();

            state._fsp--;

             after(grammarAccess.getUIModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUIModel"


    // $ANTLR start "ruleUIModel"
    // InternalQuickUI.g:62:1: ruleUIModel : ( ( rule__UIModel__Group__0 ) ) ;
    public final void ruleUIModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:66:2: ( ( ( rule__UIModel__Group__0 ) ) )
            // InternalQuickUI.g:67:2: ( ( rule__UIModel__Group__0 ) )
            {
            // InternalQuickUI.g:67:2: ( ( rule__UIModel__Group__0 ) )
            // InternalQuickUI.g:68:3: ( rule__UIModel__Group__0 )
            {
             before(grammarAccess.getUIModelAccess().getGroup()); 
            // InternalQuickUI.g:69:3: ( rule__UIModel__Group__0 )
            // InternalQuickUI.g:69:4: rule__UIModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UIModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUIModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUIModel"


    // $ANTLR start "entryRuleAlias"
    // InternalQuickUI.g:78:1: entryRuleAlias : ruleAlias EOF ;
    public final void entryRuleAlias() throws RecognitionException {
        try {
            // InternalQuickUI.g:79:1: ( ruleAlias EOF )
            // InternalQuickUI.g:80:1: ruleAlias EOF
            {
             before(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getAliasRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalQuickUI.g:87:1: ruleAlias : ( ( rule__Alias__Group__0 ) ) ;
    public final void ruleAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:91:2: ( ( ( rule__Alias__Group__0 ) ) )
            // InternalQuickUI.g:92:2: ( ( rule__Alias__Group__0 ) )
            {
            // InternalQuickUI.g:92:2: ( ( rule__Alias__Group__0 ) )
            // InternalQuickUI.g:93:3: ( rule__Alias__Group__0 )
            {
             before(grammarAccess.getAliasAccess().getGroup()); 
            // InternalQuickUI.g:94:3: ( rule__Alias__Group__0 )
            // InternalQuickUI.g:94:4: rule__Alias__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alias__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRulePackage"
    // InternalQuickUI.g:103:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalQuickUI.g:104:1: ( rulePackage EOF )
            // InternalQuickUI.g:105:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalQuickUI.g:112:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:116:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalQuickUI.g:117:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalQuickUI.g:117:2: ( ( rule__Package__Group__0 ) )
            // InternalQuickUI.g:118:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalQuickUI.g:119:3: ( rule__Package__Group__0 )
            // InternalQuickUI.g:119:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleWindow"
    // InternalQuickUI.g:128:1: entryRuleWindow : ruleWindow EOF ;
    public final void entryRuleWindow() throws RecognitionException {
        try {
            // InternalQuickUI.g:129:1: ( ruleWindow EOF )
            // InternalQuickUI.g:130:1: ruleWindow EOF
            {
             before(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_1);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getWindowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // InternalQuickUI.g:137:1: ruleWindow : ( ( rule__Window__Group__0 ) ) ;
    public final void ruleWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:141:2: ( ( ( rule__Window__Group__0 ) ) )
            // InternalQuickUI.g:142:2: ( ( rule__Window__Group__0 ) )
            {
            // InternalQuickUI.g:142:2: ( ( rule__Window__Group__0 ) )
            // InternalQuickUI.g:143:3: ( rule__Window__Group__0 )
            {
             before(grammarAccess.getWindowAccess().getGroup()); 
            // InternalQuickUI.g:144:3: ( rule__Window__Group__0 )
            // InternalQuickUI.g:144:4: rule__Window__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRuleElement"
    // InternalQuickUI.g:153:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalQuickUI.g:154:1: ( ruleElement EOF )
            // InternalQuickUI.g:155:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalQuickUI.g:162:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:166:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalQuickUI.g:167:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalQuickUI.g:167:2: ( ( rule__Element__Alternatives ) )
            // InternalQuickUI.g:168:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalQuickUI.g:169:3: ( rule__Element__Alternatives )
            // InternalQuickUI.g:169:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleJavaElement"
    // InternalQuickUI.g:178:1: entryRuleJavaElement : ruleJavaElement EOF ;
    public final void entryRuleJavaElement() throws RecognitionException {
        try {
            // InternalQuickUI.g:179:1: ( ruleJavaElement EOF )
            // InternalQuickUI.g:180:1: ruleJavaElement EOF
            {
             before(grammarAccess.getJavaElementRule()); 
            pushFollow(FOLLOW_1);
            ruleJavaElement();

            state._fsp--;

             after(grammarAccess.getJavaElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJavaElement"


    // $ANTLR start "ruleJavaElement"
    // InternalQuickUI.g:187:1: ruleJavaElement : ( ( rule__JavaElement__Group__0 ) ) ;
    public final void ruleJavaElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:191:2: ( ( ( rule__JavaElement__Group__0 ) ) )
            // InternalQuickUI.g:192:2: ( ( rule__JavaElement__Group__0 ) )
            {
            // InternalQuickUI.g:192:2: ( ( rule__JavaElement__Group__0 ) )
            // InternalQuickUI.g:193:3: ( rule__JavaElement__Group__0 )
            {
             before(grammarAccess.getJavaElementAccess().getGroup()); 
            // InternalQuickUI.g:194:3: ( rule__JavaElement__Group__0 )
            // InternalQuickUI.g:194:4: rule__JavaElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JavaElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJavaElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJavaElement"


    // $ANTLR start "entryRuleRow"
    // InternalQuickUI.g:203:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalQuickUI.g:204:1: ( ruleRow EOF )
            // InternalQuickUI.g:205:1: ruleRow EOF
            {
             before(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getRowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalQuickUI.g:212:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:216:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalQuickUI.g:217:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalQuickUI.g:217:2: ( ( rule__Row__Group__0 ) )
            // InternalQuickUI.g:218:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalQuickUI.g:219:3: ( rule__Row__Group__0 )
            // InternalQuickUI.g:219:4: rule__Row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleOption"
    // InternalQuickUI.g:228:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalQuickUI.g:229:1: ( ruleOption EOF )
            // InternalQuickUI.g:230:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalQuickUI.g:237:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:241:2: ( ( ( rule__Option__Alternatives ) ) )
            // InternalQuickUI.g:242:2: ( ( rule__Option__Alternatives ) )
            {
            // InternalQuickUI.g:242:2: ( ( rule__Option__Alternatives ) )
            // InternalQuickUI.g:243:3: ( rule__Option__Alternatives )
            {
             before(grammarAccess.getOptionAccess().getAlternatives()); 
            // InternalQuickUI.g:244:3: ( rule__Option__Alternatives )
            // InternalQuickUI.g:244:4: rule__Option__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Option__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleLabel"
    // InternalQuickUI.g:253:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalQuickUI.g:254:1: ( ruleLabel EOF )
            // InternalQuickUI.g:255:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalQuickUI.g:262:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:266:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalQuickUI.g:267:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalQuickUI.g:267:2: ( ( rule__Label__Group__0 ) )
            // InternalQuickUI.g:268:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalQuickUI.g:269:3: ( rule__Label__Group__0 )
            // InternalQuickUI.g:269:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleEnabled"
    // InternalQuickUI.g:278:1: entryRuleEnabled : ruleEnabled EOF ;
    public final void entryRuleEnabled() throws RecognitionException {
        try {
            // InternalQuickUI.g:279:1: ( ruleEnabled EOF )
            // InternalQuickUI.g:280:1: ruleEnabled EOF
            {
             before(grammarAccess.getEnabledRule()); 
            pushFollow(FOLLOW_1);
            ruleEnabled();

            state._fsp--;

             after(grammarAccess.getEnabledRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnabled"


    // $ANTLR start "ruleEnabled"
    // InternalQuickUI.g:287:1: ruleEnabled : ( ( rule__Enabled__Group__0 ) ) ;
    public final void ruleEnabled() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:291:2: ( ( ( rule__Enabled__Group__0 ) ) )
            // InternalQuickUI.g:292:2: ( ( rule__Enabled__Group__0 ) )
            {
            // InternalQuickUI.g:292:2: ( ( rule__Enabled__Group__0 ) )
            // InternalQuickUI.g:293:3: ( rule__Enabled__Group__0 )
            {
             before(grammarAccess.getEnabledAccess().getGroup()); 
            // InternalQuickUI.g:294:3: ( rule__Enabled__Group__0 )
            // InternalQuickUI.g:294:4: rule__Enabled__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enabled__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnabledAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnabled"


    // $ANTLR start "entryRuleCondition"
    // InternalQuickUI.g:303:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalQuickUI.g:304:1: ( ruleCondition EOF )
            // InternalQuickUI.g:305:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalQuickUI.g:312:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:316:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalQuickUI.g:317:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalQuickUI.g:317:2: ( ( rule__Condition__Group__0 ) )
            // InternalQuickUI.g:318:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalQuickUI.g:319:3: ( rule__Condition__Group__0 )
            // InternalQuickUI.g:319:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionType"
    // InternalQuickUI.g:328:1: entryRuleConditionType : ruleConditionType EOF ;
    public final void entryRuleConditionType() throws RecognitionException {
        try {
            // InternalQuickUI.g:329:1: ( ruleConditionType EOF )
            // InternalQuickUI.g:330:1: ruleConditionType EOF
            {
             before(grammarAccess.getConditionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionType();

            state._fsp--;

             after(grammarAccess.getConditionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionType"


    // $ANTLR start "ruleConditionType"
    // InternalQuickUI.g:337:1: ruleConditionType : ( ( rule__ConditionType__Alternatives ) ) ;
    public final void ruleConditionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:341:2: ( ( ( rule__ConditionType__Alternatives ) ) )
            // InternalQuickUI.g:342:2: ( ( rule__ConditionType__Alternatives ) )
            {
            // InternalQuickUI.g:342:2: ( ( rule__ConditionType__Alternatives ) )
            // InternalQuickUI.g:343:3: ( rule__ConditionType__Alternatives )
            {
             before(grammarAccess.getConditionTypeAccess().getAlternatives()); 
            // InternalQuickUI.g:344:3: ( rule__ConditionType__Alternatives )
            // InternalQuickUI.g:344:4: rule__ConditionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionType"


    // $ANTLR start "entryRuleChecked"
    // InternalQuickUI.g:353:1: entryRuleChecked : ruleChecked EOF ;
    public final void entryRuleChecked() throws RecognitionException {
        try {
            // InternalQuickUI.g:354:1: ( ruleChecked EOF )
            // InternalQuickUI.g:355:1: ruleChecked EOF
            {
             before(grammarAccess.getCheckedRule()); 
            pushFollow(FOLLOW_1);
            ruleChecked();

            state._fsp--;

             after(grammarAccess.getCheckedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChecked"


    // $ANTLR start "ruleChecked"
    // InternalQuickUI.g:362:1: ruleChecked : ( ( rule__Checked__Group__0 ) ) ;
    public final void ruleChecked() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:366:2: ( ( ( rule__Checked__Group__0 ) ) )
            // InternalQuickUI.g:367:2: ( ( rule__Checked__Group__0 ) )
            {
            // InternalQuickUI.g:367:2: ( ( rule__Checked__Group__0 ) )
            // InternalQuickUI.g:368:3: ( rule__Checked__Group__0 )
            {
             before(grammarAccess.getCheckedAccess().getGroup()); 
            // InternalQuickUI.g:369:3: ( rule__Checked__Group__0 )
            // InternalQuickUI.g:369:4: rule__Checked__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Checked__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChecked"


    // $ANTLR start "entryRuleOnClick"
    // InternalQuickUI.g:378:1: entryRuleOnClick : ruleOnClick EOF ;
    public final void entryRuleOnClick() throws RecognitionException {
        try {
            // InternalQuickUI.g:379:1: ( ruleOnClick EOF )
            // InternalQuickUI.g:380:1: ruleOnClick EOF
            {
             before(grammarAccess.getOnClickRule()); 
            pushFollow(FOLLOW_1);
            ruleOnClick();

            state._fsp--;

             after(grammarAccess.getOnClickRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnClick"


    // $ANTLR start "ruleOnClick"
    // InternalQuickUI.g:387:1: ruleOnClick : ( ( rule__OnClick__Group__0 ) ) ;
    public final void ruleOnClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:391:2: ( ( ( rule__OnClick__Group__0 ) ) )
            // InternalQuickUI.g:392:2: ( ( rule__OnClick__Group__0 ) )
            {
            // InternalQuickUI.g:392:2: ( ( rule__OnClick__Group__0 ) )
            // InternalQuickUI.g:393:3: ( rule__OnClick__Group__0 )
            {
             before(grammarAccess.getOnClickAccess().getGroup()); 
            // InternalQuickUI.g:394:3: ( rule__OnClick__Group__0 )
            // InternalQuickUI.g:394:4: rule__OnClick__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OnClick__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnClickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnClick"


    // $ANTLR start "entryRuleFilter"
    // InternalQuickUI.g:403:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalQuickUI.g:404:1: ( ruleFilter EOF )
            // InternalQuickUI.g:405:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalQuickUI.g:412:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:416:2: ( ( ( rule__Filter__Group__0 ) ) )
            // InternalQuickUI.g:417:2: ( ( rule__Filter__Group__0 ) )
            {
            // InternalQuickUI.g:417:2: ( ( rule__Filter__Group__0 ) )
            // InternalQuickUI.g:418:3: ( rule__Filter__Group__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup()); 
            // InternalQuickUI.g:419:3: ( rule__Filter__Group__0 )
            // InternalQuickUI.g:419:4: rule__Filter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleFilterExpression"
    // InternalQuickUI.g:428:1: entryRuleFilterExpression : ruleFilterExpression EOF ;
    public final void entryRuleFilterExpression() throws RecognitionException {
        try {
            // InternalQuickUI.g:429:1: ( ruleFilterExpression EOF )
            // InternalQuickUI.g:430:1: ruleFilterExpression EOF
            {
             before(grammarAccess.getFilterExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterExpression();

            state._fsp--;

             after(grammarAccess.getFilterExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterExpression"


    // $ANTLR start "ruleFilterExpression"
    // InternalQuickUI.g:437:1: ruleFilterExpression : ( 'TODO' ) ;
    public final void ruleFilterExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:441:2: ( ( 'TODO' ) )
            // InternalQuickUI.g:442:2: ( 'TODO' )
            {
            // InternalQuickUI.g:442:2: ( 'TODO' )
            // InternalQuickUI.g:443:3: 'TODO'
            {
             before(grammarAccess.getFilterExpressionAccess().getTODOKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFilterExpressionAccess().getTODOKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterExpression"


    // $ANTLR start "entryRuleBoolean"
    // InternalQuickUI.g:453:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalQuickUI.g:454:1: ( ruleBoolean EOF )
            // InternalQuickUI.g:455:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalQuickUI.g:462:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:466:2: ( ( ( rule__Boolean__Group__0 ) ) )
            // InternalQuickUI.g:467:2: ( ( rule__Boolean__Group__0 ) )
            {
            // InternalQuickUI.g:467:2: ( ( rule__Boolean__Group__0 ) )
            // InternalQuickUI.g:468:3: ( rule__Boolean__Group__0 )
            {
             before(grammarAccess.getBooleanAccess().getGroup()); 
            // InternalQuickUI.g:469:3: ( rule__Boolean__Group__0 )
            // InternalQuickUI.g:469:4: rule__Boolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalQuickUI.g:477:1: rule__Element__Alternatives : ( ( ruleRow ) | ( ruleJavaElement ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:481:1: ( ( ruleRow ) | ( ruleJavaElement ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQuickUI.g:482:2: ( ruleRow )
                    {
                    // InternalQuickUI.g:482:2: ( ruleRow )
                    // InternalQuickUI.g:483:3: ruleRow
                    {
                     before(grammarAccess.getElementAccess().getRowParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRow();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getRowParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuickUI.g:488:2: ( ruleJavaElement )
                    {
                    // InternalQuickUI.g:488:2: ( ruleJavaElement )
                    // InternalQuickUI.g:489:3: ruleJavaElement
                    {
                     before(grammarAccess.getElementAccess().getJavaElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJavaElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getJavaElementParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__JavaElement__SubelementAlternatives_3_0"
    // InternalQuickUI.g:498:1: rule__JavaElement__SubelementAlternatives_3_0 : ( ( ruleElement ) | ( ruleOption ) );
    public final void rule__JavaElement__SubelementAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:502:1: ( ( ruleElement ) | ( ruleOption ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==20) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=21 && LA2_0<=22)||(LA2_0>=28 && LA2_0<=30)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQuickUI.g:503:2: ( ruleElement )
                    {
                    // InternalQuickUI.g:503:2: ( ruleElement )
                    // InternalQuickUI.g:504:3: ruleElement
                    {
                     before(grammarAccess.getJavaElementAccess().getSubelementElementParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleElement();

                    state._fsp--;

                     after(grammarAccess.getJavaElementAccess().getSubelementElementParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuickUI.g:509:2: ( ruleOption )
                    {
                    // InternalQuickUI.g:509:2: ( ruleOption )
                    // InternalQuickUI.g:510:3: ruleOption
                    {
                     before(grammarAccess.getJavaElementAccess().getSubelementOptionParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOption();

                    state._fsp--;

                     after(grammarAccess.getJavaElementAccess().getSubelementOptionParserRuleCall_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__SubelementAlternatives_3_0"


    // $ANTLR start "rule__Row__SubelementAlternatives_3_0"
    // InternalQuickUI.g:519:1: rule__Row__SubelementAlternatives_3_0 : ( ( ruleElement ) | ( ruleOption ) );
    public final void rule__Row__SubelementAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:523:1: ( ( ruleElement ) | ( ruleOption ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==20) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=21 && LA3_0<=22)||(LA3_0>=28 && LA3_0<=30)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQuickUI.g:524:2: ( ruleElement )
                    {
                    // InternalQuickUI.g:524:2: ( ruleElement )
                    // InternalQuickUI.g:525:3: ruleElement
                    {
                     before(grammarAccess.getRowAccess().getSubelementElementParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleElement();

                    state._fsp--;

                     after(grammarAccess.getRowAccess().getSubelementElementParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuickUI.g:530:2: ( ruleOption )
                    {
                    // InternalQuickUI.g:530:2: ( ruleOption )
                    // InternalQuickUI.g:531:3: ruleOption
                    {
                     before(grammarAccess.getRowAccess().getSubelementOptionParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOption();

                    state._fsp--;

                     after(grammarAccess.getRowAccess().getSubelementOptionParserRuleCall_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__SubelementAlternatives_3_0"


    // $ANTLR start "rule__Option__Alternatives"
    // InternalQuickUI.g:540:1: rule__Option__Alternatives : ( ( ruleLabel ) | ( ruleEnabled ) | ( ruleChecked ) | ( ruleOnClick ) | ( ( rule__Option__Group_4__0 ) ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:544:1: ( ( ruleLabel ) | ( ruleEnabled ) | ( ruleChecked ) | ( ruleOnClick ) | ( ( rule__Option__Group_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            case 30:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalQuickUI.g:545:2: ( ruleLabel )
                    {
                    // InternalQuickUI.g:545:2: ( ruleLabel )
                    // InternalQuickUI.g:546:3: ruleLabel
                    {
                     before(grammarAccess.getOptionAccess().getLabelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getLabelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuickUI.g:551:2: ( ruleEnabled )
                    {
                    // InternalQuickUI.g:551:2: ( ruleEnabled )
                    // InternalQuickUI.g:552:3: ruleEnabled
                    {
                     before(grammarAccess.getOptionAccess().getEnabledParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnabled();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getEnabledParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQuickUI.g:557:2: ( ruleChecked )
                    {
                    // InternalQuickUI.g:557:2: ( ruleChecked )
                    // InternalQuickUI.g:558:3: ruleChecked
                    {
                     before(grammarAccess.getOptionAccess().getCheckedParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleChecked();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getCheckedParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQuickUI.g:563:2: ( ruleOnClick )
                    {
                    // InternalQuickUI.g:563:2: ( ruleOnClick )
                    // InternalQuickUI.g:564:3: ruleOnClick
                    {
                     before(grammarAccess.getOptionAccess().getOnClickParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOnClick();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getOnClickParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQuickUI.g:569:2: ( ( rule__Option__Group_4__0 ) )
                    {
                    // InternalQuickUI.g:569:2: ( ( rule__Option__Group_4__0 ) )
                    // InternalQuickUI.g:570:3: ( rule__Option__Group_4__0 )
                    {
                     before(grammarAccess.getOptionAccess().getGroup_4()); 
                    // InternalQuickUI.g:571:3: ( rule__Option__Group_4__0 )
                    // InternalQuickUI.g:571:4: rule__Option__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Option__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Alternatives"


    // $ANTLR start "rule__ConditionType__Alternatives"
    // InternalQuickUI.g:579:1: rule__ConditionType__Alternatives : ( ( ( rule__ConditionType__Group_0__0 ) ) | ( ( rule__ConditionType__Group_1__0 ) ) );
    public final void rule__ConditionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:583:1: ( ( ( rule__ConditionType__Group_0__0 ) ) | ( ( rule__ConditionType__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQuickUI.g:584:2: ( ( rule__ConditionType__Group_0__0 ) )
                    {
                    // InternalQuickUI.g:584:2: ( ( rule__ConditionType__Group_0__0 ) )
                    // InternalQuickUI.g:585:3: ( rule__ConditionType__Group_0__0 )
                    {
                     before(grammarAccess.getConditionTypeAccess().getGroup_0()); 
                    // InternalQuickUI.g:586:3: ( rule__ConditionType__Group_0__0 )
                    // InternalQuickUI.g:586:4: rule__ConditionType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuickUI.g:590:2: ( ( rule__ConditionType__Group_1__0 ) )
                    {
                    // InternalQuickUI.g:590:2: ( ( rule__ConditionType__Group_1__0 ) )
                    // InternalQuickUI.g:591:3: ( rule__ConditionType__Group_1__0 )
                    {
                     before(grammarAccess.getConditionTypeAccess().getGroup_1()); 
                    // InternalQuickUI.g:592:3: ( rule__ConditionType__Group_1__0 )
                    // InternalQuickUI.g:592:4: rule__ConditionType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionTypeAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives_1"
    // InternalQuickUI.g:600:1: rule__Boolean__Alternatives_1 : ( ( ( rule__Boolean__IsTrueAssignment_1_0 ) ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:604:1: ( ( ( rule__Boolean__IsTrueAssignment_1_0 ) ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQuickUI.g:605:2: ( ( rule__Boolean__IsTrueAssignment_1_0 ) )
                    {
                    // InternalQuickUI.g:605:2: ( ( rule__Boolean__IsTrueAssignment_1_0 ) )
                    // InternalQuickUI.g:606:3: ( rule__Boolean__IsTrueAssignment_1_0 )
                    {
                     before(grammarAccess.getBooleanAccess().getIsTrueAssignment_1_0()); 
                    // InternalQuickUI.g:607:3: ( rule__Boolean__IsTrueAssignment_1_0 )
                    // InternalQuickUI.g:607:4: rule__Boolean__IsTrueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Boolean__IsTrueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanAccess().getIsTrueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuickUI.g:611:2: ( 'false' )
                    {
                    // InternalQuickUI.g:611:2: ( 'false' )
                    // InternalQuickUI.g:612:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives_1"


    // $ANTLR start "rule__UIModel__Group__0"
    // InternalQuickUI.g:621:1: rule__UIModel__Group__0 : rule__UIModel__Group__0__Impl rule__UIModel__Group__1 ;
    public final void rule__UIModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:625:1: ( rule__UIModel__Group__0__Impl rule__UIModel__Group__1 )
            // InternalQuickUI.g:626:2: rule__UIModel__Group__0__Impl rule__UIModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UIModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIModel__Group__0"


    // $ANTLR start "rule__UIModel__Group__0__Impl"
    // InternalQuickUI.g:633:1: rule__UIModel__Group__0__Impl : ( ( rule__UIModel__AliasAssignment_0 )* ) ;
    public final void rule__UIModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:637:1: ( ( ( rule__UIModel__AliasAssignment_0 )* ) )
            // InternalQuickUI.g:638:1: ( ( rule__UIModel__AliasAssignment_0 )* )
            {
            // InternalQuickUI.g:638:1: ( ( rule__UIModel__AliasAssignment_0 )* )
            // InternalQuickUI.g:639:2: ( rule__UIModel__AliasAssignment_0 )*
            {
             before(grammarAccess.getUIModelAccess().getAliasAssignment_0()); 
            // InternalQuickUI.g:640:2: ( rule__UIModel__AliasAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQuickUI.g:640:3: rule__UIModel__AliasAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__UIModel__AliasAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getUIModelAccess().getAliasAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIModel__Group__0__Impl"


    // $ANTLR start "rule__UIModel__Group__1"
    // InternalQuickUI.g:648:1: rule__UIModel__Group__1 : rule__UIModel__Group__1__Impl ;
    public final void rule__UIModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:652:1: ( rule__UIModel__Group__1__Impl )
            // InternalQuickUI.g:653:2: rule__UIModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UIModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIModel__Group__1"


    // $ANTLR start "rule__UIModel__Group__1__Impl"
    // InternalQuickUI.g:659:1: rule__UIModel__Group__1__Impl : ( ( ( rule__UIModel__WindowAssignment_1 ) ) ( ( rule__UIModel__WindowAssignment_1 )* ) ) ;
    public final void rule__UIModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:663:1: ( ( ( ( rule__UIModel__WindowAssignment_1 ) ) ( ( rule__UIModel__WindowAssignment_1 )* ) ) )
            // InternalQuickUI.g:664:1: ( ( ( rule__UIModel__WindowAssignment_1 ) ) ( ( rule__UIModel__WindowAssignment_1 )* ) )
            {
            // InternalQuickUI.g:664:1: ( ( ( rule__UIModel__WindowAssignment_1 ) ) ( ( rule__UIModel__WindowAssignment_1 )* ) )
            // InternalQuickUI.g:665:2: ( ( rule__UIModel__WindowAssignment_1 ) ) ( ( rule__UIModel__WindowAssignment_1 )* )
            {
            // InternalQuickUI.g:665:2: ( ( rule__UIModel__WindowAssignment_1 ) )
            // InternalQuickUI.g:666:3: ( rule__UIModel__WindowAssignment_1 )
            {
             before(grammarAccess.getUIModelAccess().getWindowAssignment_1()); 
            // InternalQuickUI.g:667:3: ( rule__UIModel__WindowAssignment_1 )
            // InternalQuickUI.g:667:4: rule__UIModel__WindowAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__UIModel__WindowAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUIModelAccess().getWindowAssignment_1()); 

            }

            // InternalQuickUI.g:670:2: ( ( rule__UIModel__WindowAssignment_1 )* )
            // InternalQuickUI.g:671:3: ( rule__UIModel__WindowAssignment_1 )*
            {
             before(grammarAccess.getUIModelAccess().getWindowAssignment_1()); 
            // InternalQuickUI.g:672:3: ( rule__UIModel__WindowAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQuickUI.g:672:4: rule__UIModel__WindowAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__UIModel__WindowAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUIModelAccess().getWindowAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIModel__Group__1__Impl"


    // $ANTLR start "rule__Alias__Group__0"
    // InternalQuickUI.g:682:1: rule__Alias__Group__0 : rule__Alias__Group__0__Impl rule__Alias__Group__1 ;
    public final void rule__Alias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:686:1: ( rule__Alias__Group__0__Impl rule__Alias__Group__1 )
            // InternalQuickUI.g:687:2: rule__Alias__Group__0__Impl rule__Alias__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Alias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alias__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__0"


    // $ANTLR start "rule__Alias__Group__0__Impl"
    // InternalQuickUI.g:694:1: rule__Alias__Group__0__Impl : ( 'use' ) ;
    public final void rule__Alias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:698:1: ( ( 'use' ) )
            // InternalQuickUI.g:699:1: ( 'use' )
            {
            // InternalQuickUI.g:699:1: ( 'use' )
            // InternalQuickUI.g:700:2: 'use'
            {
             before(grammarAccess.getAliasAccess().getUseKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAliasAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__0__Impl"


    // $ANTLR start "rule__Alias__Group__1"
    // InternalQuickUI.g:709:1: rule__Alias__Group__1 : rule__Alias__Group__1__Impl rule__Alias__Group__2 ;
    public final void rule__Alias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:713:1: ( rule__Alias__Group__1__Impl rule__Alias__Group__2 )
            // InternalQuickUI.g:714:2: rule__Alias__Group__1__Impl rule__Alias__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Alias__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alias__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__1"


    // $ANTLR start "rule__Alias__Group__1__Impl"
    // InternalQuickUI.g:721:1: rule__Alias__Group__1__Impl : ( ( rule__Alias__NameAssignment_1 ) ) ;
    public final void rule__Alias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:725:1: ( ( ( rule__Alias__NameAssignment_1 ) ) )
            // InternalQuickUI.g:726:1: ( ( rule__Alias__NameAssignment_1 ) )
            {
            // InternalQuickUI.g:726:1: ( ( rule__Alias__NameAssignment_1 ) )
            // InternalQuickUI.g:727:2: ( rule__Alias__NameAssignment_1 )
            {
             before(grammarAccess.getAliasAccess().getNameAssignment_1()); 
            // InternalQuickUI.g:728:2: ( rule__Alias__NameAssignment_1 )
            // InternalQuickUI.g:728:3: rule__Alias__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Alias__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAliasAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__1__Impl"


    // $ANTLR start "rule__Alias__Group__2"
    // InternalQuickUI.g:736:1: rule__Alias__Group__2 : rule__Alias__Group__2__Impl rule__Alias__Group__3 ;
    public final void rule__Alias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:740:1: ( rule__Alias__Group__2__Impl rule__Alias__Group__3 )
            // InternalQuickUI.g:741:2: rule__Alias__Group__2__Impl rule__Alias__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Alias__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alias__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__2"


    // $ANTLR start "rule__Alias__Group__2__Impl"
    // InternalQuickUI.g:748:1: rule__Alias__Group__2__Impl : ( ':' ) ;
    public final void rule__Alias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:752:1: ( ( ':' ) )
            // InternalQuickUI.g:753:1: ( ':' )
            {
            // InternalQuickUI.g:753:1: ( ':' )
            // InternalQuickUI.g:754:2: ':'
            {
             before(grammarAccess.getAliasAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAliasAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__2__Impl"


    // $ANTLR start "rule__Alias__Group__3"
    // InternalQuickUI.g:763:1: rule__Alias__Group__3 : rule__Alias__Group__3__Impl ;
    public final void rule__Alias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:767:1: ( rule__Alias__Group__3__Impl )
            // InternalQuickUI.g:768:2: rule__Alias__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alias__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__3"


    // $ANTLR start "rule__Alias__Group__3__Impl"
    // InternalQuickUI.g:774:1: rule__Alias__Group__3__Impl : ( ( rule__Alias__PackageAssignment_3 ) ) ;
    public final void rule__Alias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:778:1: ( ( ( rule__Alias__PackageAssignment_3 ) ) )
            // InternalQuickUI.g:779:1: ( ( rule__Alias__PackageAssignment_3 ) )
            {
            // InternalQuickUI.g:779:1: ( ( rule__Alias__PackageAssignment_3 ) )
            // InternalQuickUI.g:780:2: ( rule__Alias__PackageAssignment_3 )
            {
             before(grammarAccess.getAliasAccess().getPackageAssignment_3()); 
            // InternalQuickUI.g:781:2: ( rule__Alias__PackageAssignment_3 )
            // InternalQuickUI.g:781:3: rule__Alias__PackageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Alias__PackageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAliasAccess().getPackageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // InternalQuickUI.g:790:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:794:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalQuickUI.g:795:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalQuickUI.g:802:1: rule__Package__Group__0__Impl : ( ( rule__Package__PnameAssignment_0 ) ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:806:1: ( ( ( rule__Package__PnameAssignment_0 ) ) )
            // InternalQuickUI.g:807:1: ( ( rule__Package__PnameAssignment_0 ) )
            {
            // InternalQuickUI.g:807:1: ( ( rule__Package__PnameAssignment_0 ) )
            // InternalQuickUI.g:808:2: ( rule__Package__PnameAssignment_0 )
            {
             before(grammarAccess.getPackageAccess().getPnameAssignment_0()); 
            // InternalQuickUI.g:809:2: ( rule__Package__PnameAssignment_0 )
            // InternalQuickUI.g:809:3: rule__Package__PnameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__PnameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getPnameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalQuickUI.g:817:1: rule__Package__Group__1 : rule__Package__Group__1__Impl ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:821:1: ( rule__Package__Group__1__Impl )
            // InternalQuickUI.g:822:2: rule__Package__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalQuickUI.g:828:1: rule__Package__Group__1__Impl : ( ( rule__Package__Group_1__0 )? ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:832:1: ( ( ( rule__Package__Group_1__0 )? ) )
            // InternalQuickUI.g:833:1: ( ( rule__Package__Group_1__0 )? )
            {
            // InternalQuickUI.g:833:1: ( ( rule__Package__Group_1__0 )? )
            // InternalQuickUI.g:834:2: ( rule__Package__Group_1__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_1()); 
            // InternalQuickUI.g:835:2: ( rule__Package__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQuickUI.g:835:3: rule__Package__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Package__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group_1__0"
    // InternalQuickUI.g:844:1: rule__Package__Group_1__0 : rule__Package__Group_1__0__Impl rule__Package__Group_1__1 ;
    public final void rule__Package__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:848:1: ( rule__Package__Group_1__0__Impl rule__Package__Group_1__1 )
            // InternalQuickUI.g:849:2: rule__Package__Group_1__0__Impl rule__Package__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_1__0"


    // $ANTLR start "rule__Package__Group_1__0__Impl"
    // InternalQuickUI.g:856:1: rule__Package__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Package__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:860:1: ( ( '.' ) )
            // InternalQuickUI.g:861:1: ( '.' )
            {
            // InternalQuickUI.g:861:1: ( '.' )
            // InternalQuickUI.g:862:2: '.'
            {
             before(grammarAccess.getPackageAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_1__0__Impl"


    // $ANTLR start "rule__Package__Group_1__1"
    // InternalQuickUI.g:871:1: rule__Package__Group_1__1 : rule__Package__Group_1__1__Impl ;
    public final void rule__Package__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:875:1: ( rule__Package__Group_1__1__Impl )
            // InternalQuickUI.g:876:2: rule__Package__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_1__1"


    // $ANTLR start "rule__Package__Group_1__1__Impl"
    // InternalQuickUI.g:882:1: rule__Package__Group_1__1__Impl : ( ( rule__Package__SubpAssignment_1_1 ) ) ;
    public final void rule__Package__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:886:1: ( ( ( rule__Package__SubpAssignment_1_1 ) ) )
            // InternalQuickUI.g:887:1: ( ( rule__Package__SubpAssignment_1_1 ) )
            {
            // InternalQuickUI.g:887:1: ( ( rule__Package__SubpAssignment_1_1 ) )
            // InternalQuickUI.g:888:2: ( rule__Package__SubpAssignment_1_1 )
            {
             before(grammarAccess.getPackageAccess().getSubpAssignment_1_1()); 
            // InternalQuickUI.g:889:2: ( rule__Package__SubpAssignment_1_1 )
            // InternalQuickUI.g:889:3: rule__Package__SubpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__SubpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getSubpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_1__1__Impl"


    // $ANTLR start "rule__Window__Group__0"
    // InternalQuickUI.g:898:1: rule__Window__Group__0 : rule__Window__Group__0__Impl rule__Window__Group__1 ;
    public final void rule__Window__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:902:1: ( rule__Window__Group__0__Impl rule__Window__Group__1 )
            // InternalQuickUI.g:903:2: rule__Window__Group__0__Impl rule__Window__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Window__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__0"


    // $ANTLR start "rule__Window__Group__0__Impl"
    // InternalQuickUI.g:910:1: rule__Window__Group__0__Impl : ( () ) ;
    public final void rule__Window__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:914:1: ( ( () ) )
            // InternalQuickUI.g:915:1: ( () )
            {
            // InternalQuickUI.g:915:1: ( () )
            // InternalQuickUI.g:916:2: ()
            {
             before(grammarAccess.getWindowAccess().getWindowAction_0()); 
            // InternalQuickUI.g:917:2: ()
            // InternalQuickUI.g:917:3: 
            {
            }

             after(grammarAccess.getWindowAccess().getWindowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__0__Impl"


    // $ANTLR start "rule__Window__Group__1"
    // InternalQuickUI.g:925:1: rule__Window__Group__1 : rule__Window__Group__1__Impl rule__Window__Group__2 ;
    public final void rule__Window__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:929:1: ( rule__Window__Group__1__Impl rule__Window__Group__2 )
            // InternalQuickUI.g:930:2: rule__Window__Group__1__Impl rule__Window__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Window__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__1"


    // $ANTLR start "rule__Window__Group__1__Impl"
    // InternalQuickUI.g:937:1: rule__Window__Group__1__Impl : ( ( rule__Window__Group_1__0 )? ) ;
    public final void rule__Window__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:941:1: ( ( ( rule__Window__Group_1__0 )? ) )
            // InternalQuickUI.g:942:1: ( ( rule__Window__Group_1__0 )? )
            {
            // InternalQuickUI.g:942:1: ( ( rule__Window__Group_1__0 )? )
            // InternalQuickUI.g:943:2: ( rule__Window__Group_1__0 )?
            {
             before(grammarAccess.getWindowAccess().getGroup_1()); 
            // InternalQuickUI.g:944:2: ( rule__Window__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQuickUI.g:944:3: rule__Window__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Window__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWindowAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__1__Impl"


    // $ANTLR start "rule__Window__Group__2"
    // InternalQuickUI.g:952:1: rule__Window__Group__2 : rule__Window__Group__2__Impl rule__Window__Group__3 ;
    public final void rule__Window__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:956:1: ( rule__Window__Group__2__Impl rule__Window__Group__3 )
            // InternalQuickUI.g:957:2: rule__Window__Group__2__Impl rule__Window__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Window__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__2"


    // $ANTLR start "rule__Window__Group__2__Impl"
    // InternalQuickUI.g:964:1: rule__Window__Group__2__Impl : ( ( rule__Window__NameAssignment_2 ) ) ;
    public final void rule__Window__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:968:1: ( ( ( rule__Window__NameAssignment_2 ) ) )
            // InternalQuickUI.g:969:1: ( ( rule__Window__NameAssignment_2 ) )
            {
            // InternalQuickUI.g:969:1: ( ( rule__Window__NameAssignment_2 ) )
            // InternalQuickUI.g:970:2: ( rule__Window__NameAssignment_2 )
            {
             before(grammarAccess.getWindowAccess().getNameAssignment_2()); 
            // InternalQuickUI.g:971:2: ( rule__Window__NameAssignment_2 )
            // InternalQuickUI.g:971:3: rule__Window__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Window__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__2__Impl"


    // $ANTLR start "rule__Window__Group__3"
    // InternalQuickUI.g:979:1: rule__Window__Group__3 : rule__Window__Group__3__Impl rule__Window__Group__4 ;
    public final void rule__Window__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:983:1: ( rule__Window__Group__3__Impl rule__Window__Group__4 )
            // InternalQuickUI.g:984:2: rule__Window__Group__3__Impl rule__Window__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Window__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__3"


    // $ANTLR start "rule__Window__Group__3__Impl"
    // InternalQuickUI.g:991:1: rule__Window__Group__3__Impl : ( ( rule__Window__Group_3__0 )? ) ;
    public final void rule__Window__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:995:1: ( ( ( rule__Window__Group_3__0 )? ) )
            // InternalQuickUI.g:996:1: ( ( rule__Window__Group_3__0 )? )
            {
            // InternalQuickUI.g:996:1: ( ( rule__Window__Group_3__0 )? )
            // InternalQuickUI.g:997:2: ( rule__Window__Group_3__0 )?
            {
             before(grammarAccess.getWindowAccess().getGroup_3()); 
            // InternalQuickUI.g:998:2: ( rule__Window__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQuickUI.g:998:3: rule__Window__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Window__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWindowAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__3__Impl"


    // $ANTLR start "rule__Window__Group__4"
    // InternalQuickUI.g:1006:1: rule__Window__Group__4 : rule__Window__Group__4__Impl rule__Window__Group__5 ;
    public final void rule__Window__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1010:1: ( rule__Window__Group__4__Impl rule__Window__Group__5 )
            // InternalQuickUI.g:1011:2: rule__Window__Group__4__Impl rule__Window__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Window__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__4"


    // $ANTLR start "rule__Window__Group__4__Impl"
    // InternalQuickUI.g:1018:1: rule__Window__Group__4__Impl : ( '{' ) ;
    public final void rule__Window__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1022:1: ( ( '{' ) )
            // InternalQuickUI.g:1023:1: ( '{' )
            {
            // InternalQuickUI.g:1023:1: ( '{' )
            // InternalQuickUI.g:1024:2: '{'
            {
             before(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__4__Impl"


    // $ANTLR start "rule__Window__Group__5"
    // InternalQuickUI.g:1033:1: rule__Window__Group__5 : rule__Window__Group__5__Impl rule__Window__Group__6 ;
    public final void rule__Window__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1037:1: ( rule__Window__Group__5__Impl rule__Window__Group__6 )
            // InternalQuickUI.g:1038:2: rule__Window__Group__5__Impl rule__Window__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Window__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__5"


    // $ANTLR start "rule__Window__Group__5__Impl"
    // InternalQuickUI.g:1045:1: rule__Window__Group__5__Impl : ( ( rule__Window__Group_5__0 )? ) ;
    public final void rule__Window__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1049:1: ( ( ( rule__Window__Group_5__0 )? ) )
            // InternalQuickUI.g:1050:1: ( ( rule__Window__Group_5__0 )? )
            {
            // InternalQuickUI.g:1050:1: ( ( rule__Window__Group_5__0 )? )
            // InternalQuickUI.g:1051:2: ( rule__Window__Group_5__0 )?
            {
             before(grammarAccess.getWindowAccess().getGroup_5()); 
            // InternalQuickUI.g:1052:2: ( rule__Window__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQuickUI.g:1052:3: rule__Window__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Window__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWindowAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__5__Impl"


    // $ANTLR start "rule__Window__Group__6"
    // InternalQuickUI.g:1060:1: rule__Window__Group__6 : rule__Window__Group__6__Impl rule__Window__Group__7 ;
    public final void rule__Window__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1064:1: ( rule__Window__Group__6__Impl rule__Window__Group__7 )
            // InternalQuickUI.g:1065:2: rule__Window__Group__6__Impl rule__Window__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Window__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__6"


    // $ANTLR start "rule__Window__Group__6__Impl"
    // InternalQuickUI.g:1072:1: rule__Window__Group__6__Impl : ( ( rule__Window__Group_6__0 ) ) ;
    public final void rule__Window__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1076:1: ( ( ( rule__Window__Group_6__0 ) ) )
            // InternalQuickUI.g:1077:1: ( ( rule__Window__Group_6__0 ) )
            {
            // InternalQuickUI.g:1077:1: ( ( rule__Window__Group_6__0 ) )
            // InternalQuickUI.g:1078:2: ( rule__Window__Group_6__0 )
            {
             before(grammarAccess.getWindowAccess().getGroup_6()); 
            // InternalQuickUI.g:1079:2: ( rule__Window__Group_6__0 )
            // InternalQuickUI.g:1079:3: rule__Window__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__6__Impl"


    // $ANTLR start "rule__Window__Group__7"
    // InternalQuickUI.g:1087:1: rule__Window__Group__7 : rule__Window__Group__7__Impl ;
    public final void rule__Window__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1091:1: ( rule__Window__Group__7__Impl )
            // InternalQuickUI.g:1092:2: rule__Window__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__7"


    // $ANTLR start "rule__Window__Group__7__Impl"
    // InternalQuickUI.g:1098:1: rule__Window__Group__7__Impl : ( '}' ) ;
    public final void rule__Window__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1102:1: ( ( '}' ) )
            // InternalQuickUI.g:1103:1: ( '}' )
            {
            // InternalQuickUI.g:1103:1: ( '}' )
            // InternalQuickUI.g:1104:2: '}'
            {
             before(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__7__Impl"


    // $ANTLR start "rule__Window__Group_1__0"
    // InternalQuickUI.g:1114:1: rule__Window__Group_1__0 : rule__Window__Group_1__0__Impl rule__Window__Group_1__1 ;
    public final void rule__Window__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1118:1: ( rule__Window__Group_1__0__Impl rule__Window__Group_1__1 )
            // InternalQuickUI.g:1119:2: rule__Window__Group_1__0__Impl rule__Window__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Window__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__0"


    // $ANTLR start "rule__Window__Group_1__0__Impl"
    // InternalQuickUI.g:1126:1: rule__Window__Group_1__0__Impl : ( ( rule__Window__MainAssignment_1_0 ) ) ;
    public final void rule__Window__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1130:1: ( ( ( rule__Window__MainAssignment_1_0 ) ) )
            // InternalQuickUI.g:1131:1: ( ( rule__Window__MainAssignment_1_0 ) )
            {
            // InternalQuickUI.g:1131:1: ( ( rule__Window__MainAssignment_1_0 ) )
            // InternalQuickUI.g:1132:2: ( rule__Window__MainAssignment_1_0 )
            {
             before(grammarAccess.getWindowAccess().getMainAssignment_1_0()); 
            // InternalQuickUI.g:1133:2: ( rule__Window__MainAssignment_1_0 )
            // InternalQuickUI.g:1133:3: rule__Window__MainAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Window__MainAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getMainAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__0__Impl"


    // $ANTLR start "rule__Window__Group_1__1"
    // InternalQuickUI.g:1141:1: rule__Window__Group_1__1 : rule__Window__Group_1__1__Impl ;
    public final void rule__Window__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1145:1: ( rule__Window__Group_1__1__Impl )
            // InternalQuickUI.g:1146:2: rule__Window__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__1"


    // $ANTLR start "rule__Window__Group_1__1__Impl"
    // InternalQuickUI.g:1152:1: rule__Window__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Window__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1156:1: ( ( ':' ) )
            // InternalQuickUI.g:1157:1: ( ':' )
            {
            // InternalQuickUI.g:1157:1: ( ':' )
            // InternalQuickUI.g:1158:2: ':'
            {
             before(grammarAccess.getWindowAccess().getColonKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__1__Impl"


    // $ANTLR start "rule__Window__Group_3__0"
    // InternalQuickUI.g:1168:1: rule__Window__Group_3__0 : rule__Window__Group_3__0__Impl rule__Window__Group_3__1 ;
    public final void rule__Window__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1172:1: ( rule__Window__Group_3__0__Impl rule__Window__Group_3__1 )
            // InternalQuickUI.g:1173:2: rule__Window__Group_3__0__Impl rule__Window__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Window__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_3__0"


    // $ANTLR start "rule__Window__Group_3__0__Impl"
    // InternalQuickUI.g:1180:1: rule__Window__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Window__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1184:1: ( ( ':' ) )
            // InternalQuickUI.g:1185:1: ( ':' )
            {
            // InternalQuickUI.g:1185:1: ( ':' )
            // InternalQuickUI.g:1186:2: ':'
            {
             before(grammarAccess.getWindowAccess().getColonKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_3__0__Impl"


    // $ANTLR start "rule__Window__Group_3__1"
    // InternalQuickUI.g:1195:1: rule__Window__Group_3__1 : rule__Window__Group_3__1__Impl ;
    public final void rule__Window__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1199:1: ( rule__Window__Group_3__1__Impl )
            // InternalQuickUI.g:1200:2: rule__Window__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_3__1"


    // $ANTLR start "rule__Window__Group_3__1__Impl"
    // InternalQuickUI.g:1206:1: rule__Window__Group_3__1__Impl : ( ( rule__Window__TitleAssignment_3_1 ) ) ;
    public final void rule__Window__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1210:1: ( ( ( rule__Window__TitleAssignment_3_1 ) ) )
            // InternalQuickUI.g:1211:1: ( ( rule__Window__TitleAssignment_3_1 ) )
            {
            // InternalQuickUI.g:1211:1: ( ( rule__Window__TitleAssignment_3_1 ) )
            // InternalQuickUI.g:1212:2: ( rule__Window__TitleAssignment_3_1 )
            {
             before(grammarAccess.getWindowAccess().getTitleAssignment_3_1()); 
            // InternalQuickUI.g:1213:2: ( rule__Window__TitleAssignment_3_1 )
            // InternalQuickUI.g:1213:3: rule__Window__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Window__TitleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getTitleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_3__1__Impl"


    // $ANTLR start "rule__Window__Group_5__0"
    // InternalQuickUI.g:1222:1: rule__Window__Group_5__0 : rule__Window__Group_5__0__Impl rule__Window__Group_5__1 ;
    public final void rule__Window__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1226:1: ( rule__Window__Group_5__0__Impl rule__Window__Group_5__1 )
            // InternalQuickUI.g:1227:2: rule__Window__Group_5__0__Impl rule__Window__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Window__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__0"


    // $ANTLR start "rule__Window__Group_5__0__Impl"
    // InternalQuickUI.g:1234:1: rule__Window__Group_5__0__Impl : ( 'Menu' ) ;
    public final void rule__Window__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1238:1: ( ( 'Menu' ) )
            // InternalQuickUI.g:1239:1: ( 'Menu' )
            {
            // InternalQuickUI.g:1239:1: ( 'Menu' )
            // InternalQuickUI.g:1240:2: 'Menu'
            {
             before(grammarAccess.getWindowAccess().getMenuKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getMenuKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__0__Impl"


    // $ANTLR start "rule__Window__Group_5__1"
    // InternalQuickUI.g:1249:1: rule__Window__Group_5__1 : rule__Window__Group_5__1__Impl rule__Window__Group_5__2 ;
    public final void rule__Window__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1253:1: ( rule__Window__Group_5__1__Impl rule__Window__Group_5__2 )
            // InternalQuickUI.g:1254:2: rule__Window__Group_5__1__Impl rule__Window__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__Window__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__1"


    // $ANTLR start "rule__Window__Group_5__1__Impl"
    // InternalQuickUI.g:1261:1: rule__Window__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Window__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1265:1: ( ( '{' ) )
            // InternalQuickUI.g:1266:1: ( '{' )
            {
            // InternalQuickUI.g:1266:1: ( '{' )
            // InternalQuickUI.g:1267:2: '{'
            {
             before(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__1__Impl"


    // $ANTLR start "rule__Window__Group_5__2"
    // InternalQuickUI.g:1276:1: rule__Window__Group_5__2 : rule__Window__Group_5__2__Impl rule__Window__Group_5__3 ;
    public final void rule__Window__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1280:1: ( rule__Window__Group_5__2__Impl rule__Window__Group_5__3 )
            // InternalQuickUI.g:1281:2: rule__Window__Group_5__2__Impl rule__Window__Group_5__3
            {
            pushFollow(FOLLOW_14);
            rule__Window__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__2"


    // $ANTLR start "rule__Window__Group_5__2__Impl"
    // InternalQuickUI.g:1288:1: rule__Window__Group_5__2__Impl : ( ( rule__Window__Menu_elementsAssignment_5_2 )* ) ;
    public final void rule__Window__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1292:1: ( ( ( rule__Window__Menu_elementsAssignment_5_2 )* ) )
            // InternalQuickUI.g:1293:1: ( ( rule__Window__Menu_elementsAssignment_5_2 )* )
            {
            // InternalQuickUI.g:1293:1: ( ( rule__Window__Menu_elementsAssignment_5_2 )* )
            // InternalQuickUI.g:1294:2: ( rule__Window__Menu_elementsAssignment_5_2 )*
            {
             before(grammarAccess.getWindowAccess().getMenu_elementsAssignment_5_2()); 
            // InternalQuickUI.g:1295:2: ( rule__Window__Menu_elementsAssignment_5_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQuickUI.g:1295:3: rule__Window__Menu_elementsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Window__Menu_elementsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getWindowAccess().getMenu_elementsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__2__Impl"


    // $ANTLR start "rule__Window__Group_5__3"
    // InternalQuickUI.g:1303:1: rule__Window__Group_5__3 : rule__Window__Group_5__3__Impl ;
    public final void rule__Window__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1307:1: ( rule__Window__Group_5__3__Impl )
            // InternalQuickUI.g:1308:2: rule__Window__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__3"


    // $ANTLR start "rule__Window__Group_5__3__Impl"
    // InternalQuickUI.g:1314:1: rule__Window__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Window__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1318:1: ( ( '}' ) )
            // InternalQuickUI.g:1319:1: ( '}' )
            {
            // InternalQuickUI.g:1319:1: ( '}' )
            // InternalQuickUI.g:1320:2: '}'
            {
             before(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__3__Impl"


    // $ANTLR start "rule__Window__Group_6__0"
    // InternalQuickUI.g:1330:1: rule__Window__Group_6__0 : rule__Window__Group_6__0__Impl rule__Window__Group_6__1 ;
    public final void rule__Window__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1334:1: ( rule__Window__Group_6__0__Impl rule__Window__Group_6__1 )
            // InternalQuickUI.g:1335:2: rule__Window__Group_6__0__Impl rule__Window__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Window__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_6__0"


    // $ANTLR start "rule__Window__Group_6__0__Impl"
    // InternalQuickUI.g:1342:1: rule__Window__Group_6__0__Impl : ( 'Content' ) ;
    public final void rule__Window__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1346:1: ( ( 'Content' ) )
            // InternalQuickUI.g:1347:1: ( 'Content' )
            {
            // InternalQuickUI.g:1347:1: ( 'Content' )
            // InternalQuickUI.g:1348:2: 'Content'
            {
             before(grammarAccess.getWindowAccess().getContentKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getContentKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_6__0__Impl"


    // $ANTLR start "rule__Window__Group_6__1"
    // InternalQuickUI.g:1357:1: rule__Window__Group_6__1 : rule__Window__Group_6__1__Impl rule__Window__Group_6__2 ;
    public final void rule__Window__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1361:1: ( rule__Window__Group_6__1__Impl rule__Window__Group_6__2 )
            // InternalQuickUI.g:1362:2: rule__Window__Group_6__1__Impl rule__Window__Group_6__2
            {
            pushFollow(FOLLOW_14);
            rule__Window__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_6__1"


    // $ANTLR start "rule__Window__Group_6__1__Impl"
    // InternalQuickUI.g:1369:1: rule__Window__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Window__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1373:1: ( ( '{' ) )
            // InternalQuickUI.g:1374:1: ( '{' )
            {
            // InternalQuickUI.g:1374:1: ( '{' )
            // InternalQuickUI.g:1375:2: '{'
            {
             before(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_6__1__Impl"


    // $ANTLR start "rule__Window__Group_6__2"
    // InternalQuickUI.g:1384:1: rule__Window__Group_6__2 : rule__Window__Group_6__2__Impl rule__Window__Group_6__3 ;
    public final void rule__Window__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1388:1: ( rule__Window__Group_6__2__Impl rule__Window__Group_6__3 )
            // InternalQuickUI.g:1389:2: rule__Window__Group_6__2__Impl rule__Window__Group_6__3
            {
            pushFollow(FOLLOW_14);
            rule__Window__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_6__2"


    // $ANTLR start "rule__Window__Group_6__2__Impl"
    // InternalQuickUI.g:1396:1: rule__Window__Group_6__2__Impl : ( ( rule__Window__Content_elementsAssignment_6_2 )* ) ;
    public final void rule__Window__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1400:1: ( ( ( rule__Window__Content_elementsAssignment_6_2 )* ) )
            // InternalQuickUI.g:1401:1: ( ( rule__Window__Content_elementsAssignment_6_2 )* )
            {
            // InternalQuickUI.g:1401:1: ( ( rule__Window__Content_elementsAssignment_6_2 )* )
            // InternalQuickUI.g:1402:2: ( rule__Window__Content_elementsAssignment_6_2 )*
            {
             before(grammarAccess.getWindowAccess().getContent_elementsAssignment_6_2()); 
            // InternalQuickUI.g:1403:2: ( rule__Window__Content_elementsAssignment_6_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQuickUI.g:1403:3: rule__Window__Content_elementsAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Window__Content_elementsAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getWindowAccess().getContent_elementsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_6__2__Impl"


    // $ANTLR start "rule__Window__Group_6__3"
    // InternalQuickUI.g:1411:1: rule__Window__Group_6__3 : rule__Window__Group_6__3__Impl ;
    public final void rule__Window__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1415:1: ( rule__Window__Group_6__3__Impl )
            // InternalQuickUI.g:1416:2: rule__Window__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_6__3"


    // $ANTLR start "rule__Window__Group_6__3__Impl"
    // InternalQuickUI.g:1422:1: rule__Window__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Window__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1426:1: ( ( '}' ) )
            // InternalQuickUI.g:1427:1: ( '}' )
            {
            // InternalQuickUI.g:1427:1: ( '}' )
            // InternalQuickUI.g:1428:2: '}'
            {
             before(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_6__3__Impl"


    // $ANTLR start "rule__JavaElement__Group__0"
    // InternalQuickUI.g:1438:1: rule__JavaElement__Group__0 : rule__JavaElement__Group__0__Impl rule__JavaElement__Group__1 ;
    public final void rule__JavaElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1442:1: ( rule__JavaElement__Group__0__Impl rule__JavaElement__Group__1 )
            // InternalQuickUI.g:1443:2: rule__JavaElement__Group__0__Impl rule__JavaElement__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__JavaElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__0"


    // $ANTLR start "rule__JavaElement__Group__0__Impl"
    // InternalQuickUI.g:1450:1: rule__JavaElement__Group__0__Impl : ( ( rule__JavaElement__AliasAssignment_0 ) ) ;
    public final void rule__JavaElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1454:1: ( ( ( rule__JavaElement__AliasAssignment_0 ) ) )
            // InternalQuickUI.g:1455:1: ( ( rule__JavaElement__AliasAssignment_0 ) )
            {
            // InternalQuickUI.g:1455:1: ( ( rule__JavaElement__AliasAssignment_0 ) )
            // InternalQuickUI.g:1456:2: ( rule__JavaElement__AliasAssignment_0 )
            {
             before(grammarAccess.getJavaElementAccess().getAliasAssignment_0()); 
            // InternalQuickUI.g:1457:2: ( rule__JavaElement__AliasAssignment_0 )
            // InternalQuickUI.g:1457:3: rule__JavaElement__AliasAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JavaElement__AliasAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJavaElementAccess().getAliasAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__0__Impl"


    // $ANTLR start "rule__JavaElement__Group__1"
    // InternalQuickUI.g:1465:1: rule__JavaElement__Group__1 : rule__JavaElement__Group__1__Impl rule__JavaElement__Group__2 ;
    public final void rule__JavaElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1469:1: ( rule__JavaElement__Group__1__Impl rule__JavaElement__Group__2 )
            // InternalQuickUI.g:1470:2: rule__JavaElement__Group__1__Impl rule__JavaElement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__JavaElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__1"


    // $ANTLR start "rule__JavaElement__Group__1__Impl"
    // InternalQuickUI.g:1477:1: rule__JavaElement__Group__1__Impl : ( ( rule__JavaElement__Group_1__0 )? ) ;
    public final void rule__JavaElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1481:1: ( ( ( rule__JavaElement__Group_1__0 )? ) )
            // InternalQuickUI.g:1482:1: ( ( rule__JavaElement__Group_1__0 )? )
            {
            // InternalQuickUI.g:1482:1: ( ( rule__JavaElement__Group_1__0 )? )
            // InternalQuickUI.g:1483:2: ( rule__JavaElement__Group_1__0 )?
            {
             before(grammarAccess.getJavaElementAccess().getGroup_1()); 
            // InternalQuickUI.g:1484:2: ( rule__JavaElement__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQuickUI.g:1484:3: rule__JavaElement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JavaElement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJavaElementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__1__Impl"


    // $ANTLR start "rule__JavaElement__Group__2"
    // InternalQuickUI.g:1492:1: rule__JavaElement__Group__2 : rule__JavaElement__Group__2__Impl rule__JavaElement__Group__3 ;
    public final void rule__JavaElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1496:1: ( rule__JavaElement__Group__2__Impl rule__JavaElement__Group__3 )
            // InternalQuickUI.g:1497:2: rule__JavaElement__Group__2__Impl rule__JavaElement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__JavaElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__2"


    // $ANTLR start "rule__JavaElement__Group__2__Impl"
    // InternalQuickUI.g:1504:1: rule__JavaElement__Group__2__Impl : ( '{' ) ;
    public final void rule__JavaElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1508:1: ( ( '{' ) )
            // InternalQuickUI.g:1509:1: ( '{' )
            {
            // InternalQuickUI.g:1509:1: ( '{' )
            // InternalQuickUI.g:1510:2: '{'
            {
             before(grammarAccess.getJavaElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJavaElementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__2__Impl"


    // $ANTLR start "rule__JavaElement__Group__3"
    // InternalQuickUI.g:1519:1: rule__JavaElement__Group__3 : rule__JavaElement__Group__3__Impl rule__JavaElement__Group__4 ;
    public final void rule__JavaElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1523:1: ( rule__JavaElement__Group__3__Impl rule__JavaElement__Group__4 )
            // InternalQuickUI.g:1524:2: rule__JavaElement__Group__3__Impl rule__JavaElement__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__JavaElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__3"


    // $ANTLR start "rule__JavaElement__Group__3__Impl"
    // InternalQuickUI.g:1531:1: rule__JavaElement__Group__3__Impl : ( ( rule__JavaElement__SubelementAssignment_3 )* ) ;
    public final void rule__JavaElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1535:1: ( ( ( rule__JavaElement__SubelementAssignment_3 )* ) )
            // InternalQuickUI.g:1536:1: ( ( rule__JavaElement__SubelementAssignment_3 )* )
            {
            // InternalQuickUI.g:1536:1: ( ( rule__JavaElement__SubelementAssignment_3 )* )
            // InternalQuickUI.g:1537:2: ( rule__JavaElement__SubelementAssignment_3 )*
            {
             before(grammarAccess.getJavaElementAccess().getSubelementAssignment_3()); 
            // InternalQuickUI.g:1538:2: ( rule__JavaElement__SubelementAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=20 && LA16_0<=22)||(LA16_0>=28 && LA16_0<=30)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalQuickUI.g:1538:3: rule__JavaElement__SubelementAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__JavaElement__SubelementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getJavaElementAccess().getSubelementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__3__Impl"


    // $ANTLR start "rule__JavaElement__Group__4"
    // InternalQuickUI.g:1546:1: rule__JavaElement__Group__4 : rule__JavaElement__Group__4__Impl ;
    public final void rule__JavaElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1550:1: ( rule__JavaElement__Group__4__Impl )
            // InternalQuickUI.g:1551:2: rule__JavaElement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JavaElement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__4"


    // $ANTLR start "rule__JavaElement__Group__4__Impl"
    // InternalQuickUI.g:1557:1: rule__JavaElement__Group__4__Impl : ( '}' ) ;
    public final void rule__JavaElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1561:1: ( ( '}' ) )
            // InternalQuickUI.g:1562:1: ( '}' )
            {
            // InternalQuickUI.g:1562:1: ( '}' )
            // InternalQuickUI.g:1563:2: '}'
            {
             before(grammarAccess.getJavaElementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJavaElementAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__4__Impl"


    // $ANTLR start "rule__JavaElement__Group_1__0"
    // InternalQuickUI.g:1573:1: rule__JavaElement__Group_1__0 : rule__JavaElement__Group_1__0__Impl rule__JavaElement__Group_1__1 ;
    public final void rule__JavaElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1577:1: ( rule__JavaElement__Group_1__0__Impl rule__JavaElement__Group_1__1 )
            // InternalQuickUI.g:1578:2: rule__JavaElement__Group_1__0__Impl rule__JavaElement__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__JavaElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group_1__0"


    // $ANTLR start "rule__JavaElement__Group_1__0__Impl"
    // InternalQuickUI.g:1585:1: rule__JavaElement__Group_1__0__Impl : ( ':' ) ;
    public final void rule__JavaElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1589:1: ( ( ':' ) )
            // InternalQuickUI.g:1590:1: ( ':' )
            {
            // InternalQuickUI.g:1590:1: ( ':' )
            // InternalQuickUI.g:1591:2: ':'
            {
             before(grammarAccess.getJavaElementAccess().getColonKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJavaElementAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group_1__0__Impl"


    // $ANTLR start "rule__JavaElement__Group_1__1"
    // InternalQuickUI.g:1600:1: rule__JavaElement__Group_1__1 : rule__JavaElement__Group_1__1__Impl ;
    public final void rule__JavaElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1604:1: ( rule__JavaElement__Group_1__1__Impl )
            // InternalQuickUI.g:1605:2: rule__JavaElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JavaElement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group_1__1"


    // $ANTLR start "rule__JavaElement__Group_1__1__Impl"
    // InternalQuickUI.g:1611:1: rule__JavaElement__Group_1__1__Impl : ( ( rule__JavaElement__NameAssignment_1_1 ) ) ;
    public final void rule__JavaElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1615:1: ( ( ( rule__JavaElement__NameAssignment_1_1 ) ) )
            // InternalQuickUI.g:1616:1: ( ( rule__JavaElement__NameAssignment_1_1 ) )
            {
            // InternalQuickUI.g:1616:1: ( ( rule__JavaElement__NameAssignment_1_1 ) )
            // InternalQuickUI.g:1617:2: ( rule__JavaElement__NameAssignment_1_1 )
            {
             before(grammarAccess.getJavaElementAccess().getNameAssignment_1_1()); 
            // InternalQuickUI.g:1618:2: ( rule__JavaElement__NameAssignment_1_1 )
            // InternalQuickUI.g:1618:3: rule__JavaElement__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JavaElement__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJavaElementAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group_1__1__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalQuickUI.g:1627:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1631:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalQuickUI.g:1632:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Row__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0"


    // $ANTLR start "rule__Row__Group__0__Impl"
    // InternalQuickUI.g:1639:1: rule__Row__Group__0__Impl : ( 'Row' ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1643:1: ( ( 'Row' ) )
            // InternalQuickUI.g:1644:1: ( 'Row' )
            {
            // InternalQuickUI.g:1644:1: ( 'Row' )
            // InternalQuickUI.g:1645:2: 'Row'
            {
             before(grammarAccess.getRowAccess().getRowKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0__Impl"


    // $ANTLR start "rule__Row__Group__1"
    // InternalQuickUI.g:1654:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1658:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalQuickUI.g:1659:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Row__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1"


    // $ANTLR start "rule__Row__Group__1__Impl"
    // InternalQuickUI.g:1666:1: rule__Row__Group__1__Impl : ( ( rule__Row__Group_1__0 )? ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1670:1: ( ( ( rule__Row__Group_1__0 )? ) )
            // InternalQuickUI.g:1671:1: ( ( rule__Row__Group_1__0 )? )
            {
            // InternalQuickUI.g:1671:1: ( ( rule__Row__Group_1__0 )? )
            // InternalQuickUI.g:1672:2: ( rule__Row__Group_1__0 )?
            {
             before(grammarAccess.getRowAccess().getGroup_1()); 
            // InternalQuickUI.g:1673:2: ( rule__Row__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQuickUI.g:1673:3: rule__Row__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Row__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRowAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1__Impl"


    // $ANTLR start "rule__Row__Group__2"
    // InternalQuickUI.g:1681:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1685:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // InternalQuickUI.g:1686:2: rule__Row__Group__2__Impl rule__Row__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Row__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2"


    // $ANTLR start "rule__Row__Group__2__Impl"
    // InternalQuickUI.g:1693:1: rule__Row__Group__2__Impl : ( '{' ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1697:1: ( ( '{' ) )
            // InternalQuickUI.g:1698:1: ( '{' )
            {
            // InternalQuickUI.g:1698:1: ( '{' )
            // InternalQuickUI.g:1699:2: '{'
            {
             before(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2__Impl"


    // $ANTLR start "rule__Row__Group__3"
    // InternalQuickUI.g:1708:1: rule__Row__Group__3 : rule__Row__Group__3__Impl rule__Row__Group__4 ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1712:1: ( rule__Row__Group__3__Impl rule__Row__Group__4 )
            // InternalQuickUI.g:1713:2: rule__Row__Group__3__Impl rule__Row__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Row__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3"


    // $ANTLR start "rule__Row__Group__3__Impl"
    // InternalQuickUI.g:1720:1: rule__Row__Group__3__Impl : ( ( ( rule__Row__SubelementAssignment_3 ) ) ( ( rule__Row__SubelementAssignment_3 )* ) ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1724:1: ( ( ( ( rule__Row__SubelementAssignment_3 ) ) ( ( rule__Row__SubelementAssignment_3 )* ) ) )
            // InternalQuickUI.g:1725:1: ( ( ( rule__Row__SubelementAssignment_3 ) ) ( ( rule__Row__SubelementAssignment_3 )* ) )
            {
            // InternalQuickUI.g:1725:1: ( ( ( rule__Row__SubelementAssignment_3 ) ) ( ( rule__Row__SubelementAssignment_3 )* ) )
            // InternalQuickUI.g:1726:2: ( ( rule__Row__SubelementAssignment_3 ) ) ( ( rule__Row__SubelementAssignment_3 )* )
            {
            // InternalQuickUI.g:1726:2: ( ( rule__Row__SubelementAssignment_3 ) )
            // InternalQuickUI.g:1727:3: ( rule__Row__SubelementAssignment_3 )
            {
             before(grammarAccess.getRowAccess().getSubelementAssignment_3()); 
            // InternalQuickUI.g:1728:3: ( rule__Row__SubelementAssignment_3 )
            // InternalQuickUI.g:1728:4: rule__Row__SubelementAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Row__SubelementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getSubelementAssignment_3()); 

            }

            // InternalQuickUI.g:1731:2: ( ( rule__Row__SubelementAssignment_3 )* )
            // InternalQuickUI.g:1732:3: ( rule__Row__SubelementAssignment_3 )*
            {
             before(grammarAccess.getRowAccess().getSubelementAssignment_3()); 
            // InternalQuickUI.g:1733:3: ( rule__Row__SubelementAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=20 && LA18_0<=22)||(LA18_0>=28 && LA18_0<=30)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQuickUI.g:1733:4: rule__Row__SubelementAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Row__SubelementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRowAccess().getSubelementAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3__Impl"


    // $ANTLR start "rule__Row__Group__4"
    // InternalQuickUI.g:1742:1: rule__Row__Group__4 : rule__Row__Group__4__Impl ;
    public final void rule__Row__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1746:1: ( rule__Row__Group__4__Impl )
            // InternalQuickUI.g:1747:2: rule__Row__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__4"


    // $ANTLR start "rule__Row__Group__4__Impl"
    // InternalQuickUI.g:1753:1: rule__Row__Group__4__Impl : ( '}' ) ;
    public final void rule__Row__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1757:1: ( ( '}' ) )
            // InternalQuickUI.g:1758:1: ( '}' )
            {
            // InternalQuickUI.g:1758:1: ( '}' )
            // InternalQuickUI.g:1759:2: '}'
            {
             before(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__4__Impl"


    // $ANTLR start "rule__Row__Group_1__0"
    // InternalQuickUI.g:1769:1: rule__Row__Group_1__0 : rule__Row__Group_1__0__Impl rule__Row__Group_1__1 ;
    public final void rule__Row__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1773:1: ( rule__Row__Group_1__0__Impl rule__Row__Group_1__1 )
            // InternalQuickUI.g:1774:2: rule__Row__Group_1__0__Impl rule__Row__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Row__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_1__0"


    // $ANTLR start "rule__Row__Group_1__0__Impl"
    // InternalQuickUI.g:1781:1: rule__Row__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Row__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1785:1: ( ( ':' ) )
            // InternalQuickUI.g:1786:1: ( ':' )
            {
            // InternalQuickUI.g:1786:1: ( ':' )
            // InternalQuickUI.g:1787:2: ':'
            {
             before(grammarAccess.getRowAccess().getColonKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_1__0__Impl"


    // $ANTLR start "rule__Row__Group_1__1"
    // InternalQuickUI.g:1796:1: rule__Row__Group_1__1 : rule__Row__Group_1__1__Impl ;
    public final void rule__Row__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1800:1: ( rule__Row__Group_1__1__Impl )
            // InternalQuickUI.g:1801:2: rule__Row__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_1__1"


    // $ANTLR start "rule__Row__Group_1__1__Impl"
    // InternalQuickUI.g:1807:1: rule__Row__Group_1__1__Impl : ( ( rule__Row__NameAssignment_1_1 ) ) ;
    public final void rule__Row__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1811:1: ( ( ( rule__Row__NameAssignment_1_1 ) ) )
            // InternalQuickUI.g:1812:1: ( ( rule__Row__NameAssignment_1_1 ) )
            {
            // InternalQuickUI.g:1812:1: ( ( rule__Row__NameAssignment_1_1 ) )
            // InternalQuickUI.g:1813:2: ( rule__Row__NameAssignment_1_1 )
            {
             before(grammarAccess.getRowAccess().getNameAssignment_1_1()); 
            // InternalQuickUI.g:1814:2: ( rule__Row__NameAssignment_1_1 )
            // InternalQuickUI.g:1814:3: rule__Row__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Row__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_1__1__Impl"


    // $ANTLR start "rule__Option__Group_4__0"
    // InternalQuickUI.g:1823:1: rule__Option__Group_4__0 : rule__Option__Group_4__0__Impl rule__Option__Group_4__1 ;
    public final void rule__Option__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1827:1: ( rule__Option__Group_4__0__Impl rule__Option__Group_4__1 )
            // InternalQuickUI.g:1828:2: rule__Option__Group_4__0__Impl rule__Option__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Option__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_4__0"


    // $ANTLR start "rule__Option__Group_4__0__Impl"
    // InternalQuickUI.g:1835:1: rule__Option__Group_4__0__Impl : ( () ) ;
    public final void rule__Option__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1839:1: ( ( () ) )
            // InternalQuickUI.g:1840:1: ( () )
            {
            // InternalQuickUI.g:1840:1: ( () )
            // InternalQuickUI.g:1841:2: ()
            {
             before(grammarAccess.getOptionAccess().getFilterAction_4_0()); 
            // InternalQuickUI.g:1842:2: ()
            // InternalQuickUI.g:1842:3: 
            {
            }

             after(grammarAccess.getOptionAccess().getFilterAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_4__0__Impl"


    // $ANTLR start "rule__Option__Group_4__1"
    // InternalQuickUI.g:1850:1: rule__Option__Group_4__1 : rule__Option__Group_4__1__Impl ;
    public final void rule__Option__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1854:1: ( rule__Option__Group_4__1__Impl )
            // InternalQuickUI.g:1855:2: rule__Option__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_4__1"


    // $ANTLR start "rule__Option__Group_4__1__Impl"
    // InternalQuickUI.g:1861:1: rule__Option__Group_4__1__Impl : ( ruleFilter ) ;
    public final void rule__Option__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1865:1: ( ( ruleFilter ) )
            // InternalQuickUI.g:1866:1: ( ruleFilter )
            {
            // InternalQuickUI.g:1866:1: ( ruleFilter )
            // InternalQuickUI.g:1867:2: ruleFilter
            {
             before(grammarAccess.getOptionAccess().getFilterParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getFilterParserRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_4__1__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalQuickUI.g:1877:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1881:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalQuickUI.g:1882:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalQuickUI.g:1889:1: rule__Label__Group__0__Impl : ( 'Label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1893:1: ( ( 'Label' ) )
            // InternalQuickUI.g:1894:1: ( 'Label' )
            {
            // InternalQuickUI.g:1894:1: ( 'Label' )
            // InternalQuickUI.g:1895:2: 'Label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalQuickUI.g:1904:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1908:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalQuickUI.g:1909:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalQuickUI.g:1916:1: rule__Label__Group__1__Impl : ( ':' ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1920:1: ( ( ':' ) )
            // InternalQuickUI.g:1921:1: ( ':' )
            {
            // InternalQuickUI.g:1921:1: ( ':' )
            // InternalQuickUI.g:1922:2: ':'
            {
             before(grammarAccess.getLabelAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // InternalQuickUI.g:1931:1: rule__Label__Group__2 : rule__Label__Group__2__Impl ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1935:1: ( rule__Label__Group__2__Impl )
            // InternalQuickUI.g:1936:2: rule__Label__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // InternalQuickUI.g:1942:1: rule__Label__Group__2__Impl : ( ( rule__Label__ValueAssignment_2 ) ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1946:1: ( ( ( rule__Label__ValueAssignment_2 ) ) )
            // InternalQuickUI.g:1947:1: ( ( rule__Label__ValueAssignment_2 ) )
            {
            // InternalQuickUI.g:1947:1: ( ( rule__Label__ValueAssignment_2 ) )
            // InternalQuickUI.g:1948:2: ( rule__Label__ValueAssignment_2 )
            {
             before(grammarAccess.getLabelAccess().getValueAssignment_2()); 
            // InternalQuickUI.g:1949:2: ( rule__Label__ValueAssignment_2 )
            // InternalQuickUI.g:1949:3: rule__Label__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Label__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__Enabled__Group__0"
    // InternalQuickUI.g:1958:1: rule__Enabled__Group__0 : rule__Enabled__Group__0__Impl rule__Enabled__Group__1 ;
    public final void rule__Enabled__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1962:1: ( rule__Enabled__Group__0__Impl rule__Enabled__Group__1 )
            // InternalQuickUI.g:1963:2: rule__Enabled__Group__0__Impl rule__Enabled__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Enabled__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enabled__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enabled__Group__0"


    // $ANTLR start "rule__Enabled__Group__0__Impl"
    // InternalQuickUI.g:1970:1: rule__Enabled__Group__0__Impl : ( 'Enabled' ) ;
    public final void rule__Enabled__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1974:1: ( ( 'Enabled' ) )
            // InternalQuickUI.g:1975:1: ( 'Enabled' )
            {
            // InternalQuickUI.g:1975:1: ( 'Enabled' )
            // InternalQuickUI.g:1976:2: 'Enabled'
            {
             before(grammarAccess.getEnabledAccess().getEnabledKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnabledAccess().getEnabledKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enabled__Group__0__Impl"


    // $ANTLR start "rule__Enabled__Group__1"
    // InternalQuickUI.g:1985:1: rule__Enabled__Group__1 : rule__Enabled__Group__1__Impl rule__Enabled__Group__2 ;
    public final void rule__Enabled__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1989:1: ( rule__Enabled__Group__1__Impl rule__Enabled__Group__2 )
            // InternalQuickUI.g:1990:2: rule__Enabled__Group__1__Impl rule__Enabled__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Enabled__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enabled__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enabled__Group__1"


    // $ANTLR start "rule__Enabled__Group__1__Impl"
    // InternalQuickUI.g:1997:1: rule__Enabled__Group__1__Impl : ( ':' ) ;
    public final void rule__Enabled__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2001:1: ( ( ':' ) )
            // InternalQuickUI.g:2002:1: ( ':' )
            {
            // InternalQuickUI.g:2002:1: ( ':' )
            // InternalQuickUI.g:2003:2: ':'
            {
             before(grammarAccess.getEnabledAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnabledAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enabled__Group__1__Impl"


    // $ANTLR start "rule__Enabled__Group__2"
    // InternalQuickUI.g:2012:1: rule__Enabled__Group__2 : rule__Enabled__Group__2__Impl ;
    public final void rule__Enabled__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2016:1: ( rule__Enabled__Group__2__Impl )
            // InternalQuickUI.g:2017:2: rule__Enabled__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enabled__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enabled__Group__2"


    // $ANTLR start "rule__Enabled__Group__2__Impl"
    // InternalQuickUI.g:2023:1: rule__Enabled__Group__2__Impl : ( ( rule__Enabled__ConditionAssignment_2 ) ) ;
    public final void rule__Enabled__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2027:1: ( ( ( rule__Enabled__ConditionAssignment_2 ) ) )
            // InternalQuickUI.g:2028:1: ( ( rule__Enabled__ConditionAssignment_2 ) )
            {
            // InternalQuickUI.g:2028:1: ( ( rule__Enabled__ConditionAssignment_2 ) )
            // InternalQuickUI.g:2029:2: ( rule__Enabled__ConditionAssignment_2 )
            {
             before(grammarAccess.getEnabledAccess().getConditionAssignment_2()); 
            // InternalQuickUI.g:2030:2: ( rule__Enabled__ConditionAssignment_2 )
            // InternalQuickUI.g:2030:3: rule__Enabled__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Enabled__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnabledAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enabled__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalQuickUI.g:2039:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2043:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalQuickUI.g:2044:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalQuickUI.g:2051:1: rule__Condition__Group__0__Impl : ( ( 'if' )? ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2055:1: ( ( ( 'if' )? ) )
            // InternalQuickUI.g:2056:1: ( ( 'if' )? )
            {
            // InternalQuickUI.g:2056:1: ( ( 'if' )? )
            // InternalQuickUI.g:2057:2: ( 'if' )?
            {
             before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
            // InternalQuickUI.g:2058:2: ( 'if' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQuickUI.g:2058:3: 'if'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalQuickUI.g:2066:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2070:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalQuickUI.g:2071:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalQuickUI.g:2078:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ElementAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2082:1: ( ( ( rule__Condition__ElementAssignment_1 ) ) )
            // InternalQuickUI.g:2083:1: ( ( rule__Condition__ElementAssignment_1 ) )
            {
            // InternalQuickUI.g:2083:1: ( ( rule__Condition__ElementAssignment_1 ) )
            // InternalQuickUI.g:2084:2: ( rule__Condition__ElementAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getElementAssignment_1()); 
            // InternalQuickUI.g:2085:2: ( rule__Condition__ElementAssignment_1 )
            // InternalQuickUI.g:2085:3: rule__Condition__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalQuickUI.g:2093:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2097:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalQuickUI.g:2098:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalQuickUI.g:2105:1: rule__Condition__Group__2__Impl : ( ( 'is' )? ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2109:1: ( ( ( 'is' )? ) )
            // InternalQuickUI.g:2110:1: ( ( 'is' )? )
            {
            // InternalQuickUI.g:2110:1: ( ( 'is' )? )
            // InternalQuickUI.g:2111:2: ( 'is' )?
            {
             before(grammarAccess.getConditionAccess().getIsKeyword_2()); 
            // InternalQuickUI.g:2112:2: ( 'is' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQuickUI.g:2112:3: 'is'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalQuickUI.g:2120:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2124:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalQuickUI.g:2125:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalQuickUI.g:2132:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__NegationAssignment_3 )? ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2136:1: ( ( ( rule__Condition__NegationAssignment_3 )? ) )
            // InternalQuickUI.g:2137:1: ( ( rule__Condition__NegationAssignment_3 )? )
            {
            // InternalQuickUI.g:2137:1: ( ( rule__Condition__NegationAssignment_3 )? )
            // InternalQuickUI.g:2138:2: ( rule__Condition__NegationAssignment_3 )?
            {
             before(grammarAccess.getConditionAccess().getNegationAssignment_3()); 
            // InternalQuickUI.g:2139:2: ( rule__Condition__NegationAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQuickUI.g:2139:3: rule__Condition__NegationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__NegationAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getNegationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalQuickUI.g:2147:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2151:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // InternalQuickUI.g:2152:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Condition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalQuickUI.g:2159:1: rule__Condition__Group__4__Impl : ( ( rule__Condition__ConditionAssignment_4 ) ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2163:1: ( ( ( rule__Condition__ConditionAssignment_4 ) ) )
            // InternalQuickUI.g:2164:1: ( ( rule__Condition__ConditionAssignment_4 ) )
            {
            // InternalQuickUI.g:2164:1: ( ( rule__Condition__ConditionAssignment_4 ) )
            // InternalQuickUI.g:2165:2: ( rule__Condition__ConditionAssignment_4 )
            {
             before(grammarAccess.getConditionAccess().getConditionAssignment_4()); 
            // InternalQuickUI.g:2166:2: ( rule__Condition__ConditionAssignment_4 )
            // InternalQuickUI.g:2166:3: rule__Condition__ConditionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConditionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__5"
    // InternalQuickUI.g:2174:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2178:1: ( rule__Condition__Group__5__Impl )
            // InternalQuickUI.g:2179:2: rule__Condition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5"


    // $ANTLR start "rule__Condition__Group__5__Impl"
    // InternalQuickUI.g:2185:1: rule__Condition__Group__5__Impl : ( ( rule__Condition__Group_5__0 )? ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2189:1: ( ( ( rule__Condition__Group_5__0 )? ) )
            // InternalQuickUI.g:2190:1: ( ( rule__Condition__Group_5__0 )? )
            {
            // InternalQuickUI.g:2190:1: ( ( rule__Condition__Group_5__0 )? )
            // InternalQuickUI.g:2191:2: ( rule__Condition__Group_5__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_5()); 
            // InternalQuickUI.g:2192:2: ( rule__Condition__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQuickUI.g:2192:3: rule__Condition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group_5__0"
    // InternalQuickUI.g:2201:1: rule__Condition__Group_5__0 : rule__Condition__Group_5__0__Impl rule__Condition__Group_5__1 ;
    public final void rule__Condition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2205:1: ( rule__Condition__Group_5__0__Impl rule__Condition__Group_5__1 )
            // InternalQuickUI.g:2206:2: rule__Condition__Group_5__0__Impl rule__Condition__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__Condition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__0"


    // $ANTLR start "rule__Condition__Group_5__0__Impl"
    // InternalQuickUI.g:2213:1: rule__Condition__Group_5__0__Impl : ( 'and' ) ;
    public final void rule__Condition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2217:1: ( ( 'and' ) )
            // InternalQuickUI.g:2218:1: ( 'and' )
            {
            // InternalQuickUI.g:2218:1: ( 'and' )
            // InternalQuickUI.g:2219:2: 'and'
            {
             before(grammarAccess.getConditionAccess().getAndKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getAndKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__0__Impl"


    // $ANTLR start "rule__Condition__Group_5__1"
    // InternalQuickUI.g:2228:1: rule__Condition__Group_5__1 : rule__Condition__Group_5__1__Impl ;
    public final void rule__Condition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2232:1: ( rule__Condition__Group_5__1__Impl )
            // InternalQuickUI.g:2233:2: rule__Condition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__1"


    // $ANTLR start "rule__Condition__Group_5__1__Impl"
    // InternalQuickUI.g:2239:1: rule__Condition__Group_5__1__Impl : ( ( rule__Condition__SubconditionAssignment_5_1 ) ) ;
    public final void rule__Condition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2243:1: ( ( ( rule__Condition__SubconditionAssignment_5_1 ) ) )
            // InternalQuickUI.g:2244:1: ( ( rule__Condition__SubconditionAssignment_5_1 ) )
            {
            // InternalQuickUI.g:2244:1: ( ( rule__Condition__SubconditionAssignment_5_1 ) )
            // InternalQuickUI.g:2245:2: ( rule__Condition__SubconditionAssignment_5_1 )
            {
             before(grammarAccess.getConditionAccess().getSubconditionAssignment_5_1()); 
            // InternalQuickUI.g:2246:2: ( rule__Condition__SubconditionAssignment_5_1 )
            // InternalQuickUI.g:2246:3: rule__Condition__SubconditionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__SubconditionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getSubconditionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__1__Impl"


    // $ANTLR start "rule__ConditionType__Group_0__0"
    // InternalQuickUI.g:2255:1: rule__ConditionType__Group_0__0 : rule__ConditionType__Group_0__0__Impl rule__ConditionType__Group_0__1 ;
    public final void rule__ConditionType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2259:1: ( rule__ConditionType__Group_0__0__Impl rule__ConditionType__Group_0__1 )
            // InternalQuickUI.g:2260:2: rule__ConditionType__Group_0__0__Impl rule__ConditionType__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__ConditionType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Group_0__0"


    // $ANTLR start "rule__ConditionType__Group_0__0__Impl"
    // InternalQuickUI.g:2267:1: rule__ConditionType__Group_0__0__Impl : ( () ) ;
    public final void rule__ConditionType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2271:1: ( ( () ) )
            // InternalQuickUI.g:2272:1: ( () )
            {
            // InternalQuickUI.g:2272:1: ( () )
            // InternalQuickUI.g:2273:2: ()
            {
             before(grammarAccess.getConditionTypeAccess().getEmptyAction_0_0()); 
            // InternalQuickUI.g:2274:2: ()
            // InternalQuickUI.g:2274:3: 
            {
            }

             after(grammarAccess.getConditionTypeAccess().getEmptyAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Group_0__0__Impl"


    // $ANTLR start "rule__ConditionType__Group_0__1"
    // InternalQuickUI.g:2282:1: rule__ConditionType__Group_0__1 : rule__ConditionType__Group_0__1__Impl ;
    public final void rule__ConditionType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2286:1: ( rule__ConditionType__Group_0__1__Impl )
            // InternalQuickUI.g:2287:2: rule__ConditionType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionType__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Group_0__1"


    // $ANTLR start "rule__ConditionType__Group_0__1__Impl"
    // InternalQuickUI.g:2293:1: rule__ConditionType__Group_0__1__Impl : ( 'empty' ) ;
    public final void rule__ConditionType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2297:1: ( ( 'empty' ) )
            // InternalQuickUI.g:2298:1: ( 'empty' )
            {
            // InternalQuickUI.g:2298:1: ( 'empty' )
            // InternalQuickUI.g:2299:2: 'empty'
            {
             before(grammarAccess.getConditionTypeAccess().getEmptyKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConditionTypeAccess().getEmptyKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Group_0__1__Impl"


    // $ANTLR start "rule__ConditionType__Group_1__0"
    // InternalQuickUI.g:2309:1: rule__ConditionType__Group_1__0 : rule__ConditionType__Group_1__0__Impl rule__ConditionType__Group_1__1 ;
    public final void rule__ConditionType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2313:1: ( rule__ConditionType__Group_1__0__Impl rule__ConditionType__Group_1__1 )
            // InternalQuickUI.g:2314:2: rule__ConditionType__Group_1__0__Impl rule__ConditionType__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__ConditionType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Group_1__0"


    // $ANTLR start "rule__ConditionType__Group_1__0__Impl"
    // InternalQuickUI.g:2321:1: rule__ConditionType__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2325:1: ( ( () ) )
            // InternalQuickUI.g:2326:1: ( () )
            {
            // InternalQuickUI.g:2326:1: ( () )
            // InternalQuickUI.g:2327:2: ()
            {
             before(grammarAccess.getConditionTypeAccess().getCheckedAction_1_0()); 
            // InternalQuickUI.g:2328:2: ()
            // InternalQuickUI.g:2328:3: 
            {
            }

             after(grammarAccess.getConditionTypeAccess().getCheckedAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionType__Group_1__1"
    // InternalQuickUI.g:2336:1: rule__ConditionType__Group_1__1 : rule__ConditionType__Group_1__1__Impl ;
    public final void rule__ConditionType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2340:1: ( rule__ConditionType__Group_1__1__Impl )
            // InternalQuickUI.g:2341:2: rule__ConditionType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Group_1__1"


    // $ANTLR start "rule__ConditionType__Group_1__1__Impl"
    // InternalQuickUI.g:2347:1: rule__ConditionType__Group_1__1__Impl : ( 'checked' ) ;
    public final void rule__ConditionType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2351:1: ( ( 'checked' ) )
            // InternalQuickUI.g:2352:1: ( 'checked' )
            {
            // InternalQuickUI.g:2352:1: ( 'checked' )
            // InternalQuickUI.g:2353:2: 'checked'
            {
             before(grammarAccess.getConditionTypeAccess().getCheckedKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConditionTypeAccess().getCheckedKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Group_1__1__Impl"


    // $ANTLR start "rule__Checked__Group__0"
    // InternalQuickUI.g:2363:1: rule__Checked__Group__0 : rule__Checked__Group__0__Impl rule__Checked__Group__1 ;
    public final void rule__Checked__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2367:1: ( rule__Checked__Group__0__Impl rule__Checked__Group__1 )
            // InternalQuickUI.g:2368:2: rule__Checked__Group__0__Impl rule__Checked__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Checked__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checked__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checked__Group__0"


    // $ANTLR start "rule__Checked__Group__0__Impl"
    // InternalQuickUI.g:2375:1: rule__Checked__Group__0__Impl : ( 'Checked' ) ;
    public final void rule__Checked__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2379:1: ( ( 'Checked' ) )
            // InternalQuickUI.g:2380:1: ( 'Checked' )
            {
            // InternalQuickUI.g:2380:1: ( 'Checked' )
            // InternalQuickUI.g:2381:2: 'Checked'
            {
             before(grammarAccess.getCheckedAccess().getCheckedKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCheckedAccess().getCheckedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checked__Group__0__Impl"


    // $ANTLR start "rule__Checked__Group__1"
    // InternalQuickUI.g:2390:1: rule__Checked__Group__1 : rule__Checked__Group__1__Impl rule__Checked__Group__2 ;
    public final void rule__Checked__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2394:1: ( rule__Checked__Group__1__Impl rule__Checked__Group__2 )
            // InternalQuickUI.g:2395:2: rule__Checked__Group__1__Impl rule__Checked__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Checked__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checked__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checked__Group__1"


    // $ANTLR start "rule__Checked__Group__1__Impl"
    // InternalQuickUI.g:2402:1: rule__Checked__Group__1__Impl : ( ':' ) ;
    public final void rule__Checked__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2406:1: ( ( ':' ) )
            // InternalQuickUI.g:2407:1: ( ':' )
            {
            // InternalQuickUI.g:2407:1: ( ':' )
            // InternalQuickUI.g:2408:2: ':'
            {
             before(grammarAccess.getCheckedAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCheckedAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checked__Group__1__Impl"


    // $ANTLR start "rule__Checked__Group__2"
    // InternalQuickUI.g:2417:1: rule__Checked__Group__2 : rule__Checked__Group__2__Impl ;
    public final void rule__Checked__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2421:1: ( rule__Checked__Group__2__Impl )
            // InternalQuickUI.g:2422:2: rule__Checked__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checked__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checked__Group__2"


    // $ANTLR start "rule__Checked__Group__2__Impl"
    // InternalQuickUI.g:2428:1: rule__Checked__Group__2__Impl : ( ( rule__Checked__CheckedAssignment_2 ) ) ;
    public final void rule__Checked__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2432:1: ( ( ( rule__Checked__CheckedAssignment_2 ) ) )
            // InternalQuickUI.g:2433:1: ( ( rule__Checked__CheckedAssignment_2 ) )
            {
            // InternalQuickUI.g:2433:1: ( ( rule__Checked__CheckedAssignment_2 ) )
            // InternalQuickUI.g:2434:2: ( rule__Checked__CheckedAssignment_2 )
            {
             before(grammarAccess.getCheckedAccess().getCheckedAssignment_2()); 
            // InternalQuickUI.g:2435:2: ( rule__Checked__CheckedAssignment_2 )
            // InternalQuickUI.g:2435:3: rule__Checked__CheckedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Checked__CheckedAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckedAccess().getCheckedAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checked__Group__2__Impl"


    // $ANTLR start "rule__OnClick__Group__0"
    // InternalQuickUI.g:2444:1: rule__OnClick__Group__0 : rule__OnClick__Group__0__Impl rule__OnClick__Group__1 ;
    public final void rule__OnClick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2448:1: ( rule__OnClick__Group__0__Impl rule__OnClick__Group__1 )
            // InternalQuickUI.g:2449:2: rule__OnClick__Group__0__Impl rule__OnClick__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__OnClick__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnClick__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnClick__Group__0"


    // $ANTLR start "rule__OnClick__Group__0__Impl"
    // InternalQuickUI.g:2456:1: rule__OnClick__Group__0__Impl : ( 'OnClick' ) ;
    public final void rule__OnClick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2460:1: ( ( 'OnClick' ) )
            // InternalQuickUI.g:2461:1: ( 'OnClick' )
            {
            // InternalQuickUI.g:2461:1: ( 'OnClick' )
            // InternalQuickUI.g:2462:2: 'OnClick'
            {
             before(grammarAccess.getOnClickAccess().getOnClickKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOnClickAccess().getOnClickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnClick__Group__0__Impl"


    // $ANTLR start "rule__OnClick__Group__1"
    // InternalQuickUI.g:2471:1: rule__OnClick__Group__1 : rule__OnClick__Group__1__Impl rule__OnClick__Group__2 ;
    public final void rule__OnClick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2475:1: ( rule__OnClick__Group__1__Impl rule__OnClick__Group__2 )
            // InternalQuickUI.g:2476:2: rule__OnClick__Group__1__Impl rule__OnClick__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__OnClick__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnClick__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnClick__Group__1"


    // $ANTLR start "rule__OnClick__Group__1__Impl"
    // InternalQuickUI.g:2483:1: rule__OnClick__Group__1__Impl : ( ':' ) ;
    public final void rule__OnClick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2487:1: ( ( ':' ) )
            // InternalQuickUI.g:2488:1: ( ':' )
            {
            // InternalQuickUI.g:2488:1: ( ':' )
            // InternalQuickUI.g:2489:2: ':'
            {
             before(grammarAccess.getOnClickAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOnClickAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnClick__Group__1__Impl"


    // $ANTLR start "rule__OnClick__Group__2"
    // InternalQuickUI.g:2498:1: rule__OnClick__Group__2 : rule__OnClick__Group__2__Impl ;
    public final void rule__OnClick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2502:1: ( rule__OnClick__Group__2__Impl )
            // InternalQuickUI.g:2503:2: rule__OnClick__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnClick__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnClick__Group__2"


    // $ANTLR start "rule__OnClick__Group__2__Impl"
    // InternalQuickUI.g:2509:1: rule__OnClick__Group__2__Impl : ( ( rule__OnClick__CallbackAssignment_2 ) ) ;
    public final void rule__OnClick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2513:1: ( ( ( rule__OnClick__CallbackAssignment_2 ) ) )
            // InternalQuickUI.g:2514:1: ( ( rule__OnClick__CallbackAssignment_2 ) )
            {
            // InternalQuickUI.g:2514:1: ( ( rule__OnClick__CallbackAssignment_2 ) )
            // InternalQuickUI.g:2515:2: ( rule__OnClick__CallbackAssignment_2 )
            {
             before(grammarAccess.getOnClickAccess().getCallbackAssignment_2()); 
            // InternalQuickUI.g:2516:2: ( rule__OnClick__CallbackAssignment_2 )
            // InternalQuickUI.g:2516:3: rule__OnClick__CallbackAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OnClick__CallbackAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOnClickAccess().getCallbackAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnClick__Group__2__Impl"


    // $ANTLR start "rule__Filter__Group__0"
    // InternalQuickUI.g:2525:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2529:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalQuickUI.g:2530:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Filter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0"


    // $ANTLR start "rule__Filter__Group__0__Impl"
    // InternalQuickUI.g:2537:1: rule__Filter__Group__0__Impl : ( 'Filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2541:1: ( ( 'Filter' ) )
            // InternalQuickUI.g:2542:1: ( 'Filter' )
            {
            // InternalQuickUI.g:2542:1: ( 'Filter' )
            // InternalQuickUI.g:2543:2: 'Filter'
            {
             before(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0__Impl"


    // $ANTLR start "rule__Filter__Group__1"
    // InternalQuickUI.g:2552:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2556:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalQuickUI.g:2557:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Filter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__1"


    // $ANTLR start "rule__Filter__Group__1__Impl"
    // InternalQuickUI.g:2564:1: rule__Filter__Group__1__Impl : ( ':' ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2568:1: ( ( ':' ) )
            // InternalQuickUI.g:2569:1: ( ':' )
            {
            // InternalQuickUI.g:2569:1: ( ':' )
            // InternalQuickUI.g:2570:2: ':'
            {
             before(grammarAccess.getFilterAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__1__Impl"


    // $ANTLR start "rule__Filter__Group__2"
    // InternalQuickUI.g:2579:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2583:1: ( rule__Filter__Group__2__Impl )
            // InternalQuickUI.g:2584:2: rule__Filter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__2"


    // $ANTLR start "rule__Filter__Group__2__Impl"
    // InternalQuickUI.g:2590:1: rule__Filter__Group__2__Impl : ( ruleFilterExpression ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2594:1: ( ( ruleFilterExpression ) )
            // InternalQuickUI.g:2595:1: ( ruleFilterExpression )
            {
            // InternalQuickUI.g:2595:1: ( ruleFilterExpression )
            // InternalQuickUI.g:2596:2: ruleFilterExpression
            {
             before(grammarAccess.getFilterAccess().getFilterExpressionParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleFilterExpression();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getFilterExpressionParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__2__Impl"


    // $ANTLR start "rule__Boolean__Group__0"
    // InternalQuickUI.g:2606:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2610:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // InternalQuickUI.g:2611:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Boolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0"


    // $ANTLR start "rule__Boolean__Group__0__Impl"
    // InternalQuickUI.g:2618:1: rule__Boolean__Group__0__Impl : ( () ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2622:1: ( ( () ) )
            // InternalQuickUI.g:2623:1: ( () )
            {
            // InternalQuickUI.g:2623:1: ( () )
            // InternalQuickUI.g:2624:2: ()
            {
             before(grammarAccess.getBooleanAccess().getBooleanAction_0()); 
            // InternalQuickUI.g:2625:2: ()
            // InternalQuickUI.g:2625:3: 
            {
            }

             after(grammarAccess.getBooleanAccess().getBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0__Impl"


    // $ANTLR start "rule__Boolean__Group__1"
    // InternalQuickUI.g:2633:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2637:1: ( rule__Boolean__Group__1__Impl )
            // InternalQuickUI.g:2638:2: rule__Boolean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__1"


    // $ANTLR start "rule__Boolean__Group__1__Impl"
    // InternalQuickUI.g:2644:1: rule__Boolean__Group__1__Impl : ( ( rule__Boolean__Alternatives_1 ) ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2648:1: ( ( ( rule__Boolean__Alternatives_1 ) ) )
            // InternalQuickUI.g:2649:1: ( ( rule__Boolean__Alternatives_1 ) )
            {
            // InternalQuickUI.g:2649:1: ( ( rule__Boolean__Alternatives_1 ) )
            // InternalQuickUI.g:2650:2: ( rule__Boolean__Alternatives_1 )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives_1()); 
            // InternalQuickUI.g:2651:2: ( rule__Boolean__Alternatives_1 )
            // InternalQuickUI.g:2651:3: rule__Boolean__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__1__Impl"


    // $ANTLR start "rule__UIModel__AliasAssignment_0"
    // InternalQuickUI.g:2660:1: rule__UIModel__AliasAssignment_0 : ( ruleAlias ) ;
    public final void rule__UIModel__AliasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2664:1: ( ( ruleAlias ) )
            // InternalQuickUI.g:2665:2: ( ruleAlias )
            {
            // InternalQuickUI.g:2665:2: ( ruleAlias )
            // InternalQuickUI.g:2666:3: ruleAlias
            {
             before(grammarAccess.getUIModelAccess().getAliasAliasParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAlias();

            state._fsp--;

             after(grammarAccess.getUIModelAccess().getAliasAliasParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIModel__AliasAssignment_0"


    // $ANTLR start "rule__UIModel__WindowAssignment_1"
    // InternalQuickUI.g:2675:1: rule__UIModel__WindowAssignment_1 : ( ruleWindow ) ;
    public final void rule__UIModel__WindowAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2679:1: ( ( ruleWindow ) )
            // InternalQuickUI.g:2680:2: ( ruleWindow )
            {
            // InternalQuickUI.g:2680:2: ( ruleWindow )
            // InternalQuickUI.g:2681:3: ruleWindow
            {
             before(grammarAccess.getUIModelAccess().getWindowWindowParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getUIModelAccess().getWindowWindowParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIModel__WindowAssignment_1"


    // $ANTLR start "rule__Alias__NameAssignment_1"
    // InternalQuickUI.g:2690:1: rule__Alias__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alias__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2694:1: ( ( RULE_ID ) )
            // InternalQuickUI.g:2695:2: ( RULE_ID )
            {
            // InternalQuickUI.g:2695:2: ( RULE_ID )
            // InternalQuickUI.g:2696:3: RULE_ID
            {
             before(grammarAccess.getAliasAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAliasAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__NameAssignment_1"


    // $ANTLR start "rule__Alias__PackageAssignment_3"
    // InternalQuickUI.g:2705:1: rule__Alias__PackageAssignment_3 : ( rulePackage ) ;
    public final void rule__Alias__PackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2709:1: ( ( rulePackage ) )
            // InternalQuickUI.g:2710:2: ( rulePackage )
            {
            // InternalQuickUI.g:2710:2: ( rulePackage )
            // InternalQuickUI.g:2711:3: rulePackage
            {
             before(grammarAccess.getAliasAccess().getPackagePackageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getAliasAccess().getPackagePackageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alias__PackageAssignment_3"


    // $ANTLR start "rule__Package__PnameAssignment_0"
    // InternalQuickUI.g:2720:1: rule__Package__PnameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Package__PnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2724:1: ( ( RULE_ID ) )
            // InternalQuickUI.g:2725:2: ( RULE_ID )
            {
            // InternalQuickUI.g:2725:2: ( RULE_ID )
            // InternalQuickUI.g:2726:3: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getPnameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPnameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PnameAssignment_0"


    // $ANTLR start "rule__Package__SubpAssignment_1_1"
    // InternalQuickUI.g:2735:1: rule__Package__SubpAssignment_1_1 : ( rulePackage ) ;
    public final void rule__Package__SubpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2739:1: ( ( rulePackage ) )
            // InternalQuickUI.g:2740:2: ( rulePackage )
            {
            // InternalQuickUI.g:2740:2: ( rulePackage )
            // InternalQuickUI.g:2741:3: rulePackage
            {
             before(grammarAccess.getPackageAccess().getSubpPackageParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getSubpPackageParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__SubpAssignment_1_1"


    // $ANTLR start "rule__Window__MainAssignment_1_0"
    // InternalQuickUI.g:2750:1: rule__Window__MainAssignment_1_0 : ( ( 'Main' ) ) ;
    public final void rule__Window__MainAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2754:1: ( ( ( 'Main' ) ) )
            // InternalQuickUI.g:2755:2: ( ( 'Main' ) )
            {
            // InternalQuickUI.g:2755:2: ( ( 'Main' ) )
            // InternalQuickUI.g:2756:3: ( 'Main' )
            {
             before(grammarAccess.getWindowAccess().getMainMainKeyword_1_0_0()); 
            // InternalQuickUI.g:2757:3: ( 'Main' )
            // InternalQuickUI.g:2758:4: 'Main'
            {
             before(grammarAccess.getWindowAccess().getMainMainKeyword_1_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getMainMainKeyword_1_0_0()); 

            }

             after(grammarAccess.getWindowAccess().getMainMainKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__MainAssignment_1_0"


    // $ANTLR start "rule__Window__NameAssignment_2"
    // InternalQuickUI.g:2769:1: rule__Window__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Window__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2773:1: ( ( RULE_ID ) )
            // InternalQuickUI.g:2774:2: ( RULE_ID )
            {
            // InternalQuickUI.g:2774:2: ( RULE_ID )
            // InternalQuickUI.g:2775:3: RULE_ID
            {
             before(grammarAccess.getWindowAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__NameAssignment_2"


    // $ANTLR start "rule__Window__TitleAssignment_3_1"
    // InternalQuickUI.g:2784:1: rule__Window__TitleAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Window__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2788:1: ( ( RULE_STRING ) )
            // InternalQuickUI.g:2789:2: ( RULE_STRING )
            {
            // InternalQuickUI.g:2789:2: ( RULE_STRING )
            // InternalQuickUI.g:2790:3: RULE_STRING
            {
             before(grammarAccess.getWindowAccess().getTitleSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getTitleSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__TitleAssignment_3_1"


    // $ANTLR start "rule__Window__Menu_elementsAssignment_5_2"
    // InternalQuickUI.g:2799:1: rule__Window__Menu_elementsAssignment_5_2 : ( ruleElement ) ;
    public final void rule__Window__Menu_elementsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2803:1: ( ( ruleElement ) )
            // InternalQuickUI.g:2804:2: ( ruleElement )
            {
            // InternalQuickUI.g:2804:2: ( ruleElement )
            // InternalQuickUI.g:2805:3: ruleElement
            {
             before(grammarAccess.getWindowAccess().getMenu_elementsElementParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getMenu_elementsElementParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Menu_elementsAssignment_5_2"


    // $ANTLR start "rule__Window__Content_elementsAssignment_6_2"
    // InternalQuickUI.g:2814:1: rule__Window__Content_elementsAssignment_6_2 : ( ruleElement ) ;
    public final void rule__Window__Content_elementsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2818:1: ( ( ruleElement ) )
            // InternalQuickUI.g:2819:2: ( ruleElement )
            {
            // InternalQuickUI.g:2819:2: ( ruleElement )
            // InternalQuickUI.g:2820:3: ruleElement
            {
             before(grammarAccess.getWindowAccess().getContent_elementsElementParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getContent_elementsElementParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Content_elementsAssignment_6_2"


    // $ANTLR start "rule__JavaElement__AliasAssignment_0"
    // InternalQuickUI.g:2829:1: rule__JavaElement__AliasAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__JavaElement__AliasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2833:1: ( ( ( RULE_ID ) ) )
            // InternalQuickUI.g:2834:2: ( ( RULE_ID ) )
            {
            // InternalQuickUI.g:2834:2: ( ( RULE_ID ) )
            // InternalQuickUI.g:2835:3: ( RULE_ID )
            {
             before(grammarAccess.getJavaElementAccess().getAliasAliasCrossReference_0_0()); 
            // InternalQuickUI.g:2836:3: ( RULE_ID )
            // InternalQuickUI.g:2837:4: RULE_ID
            {
             before(grammarAccess.getJavaElementAccess().getAliasAliasIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJavaElementAccess().getAliasAliasIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getJavaElementAccess().getAliasAliasCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__AliasAssignment_0"


    // $ANTLR start "rule__JavaElement__NameAssignment_1_1"
    // InternalQuickUI.g:2848:1: rule__JavaElement__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__JavaElement__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2852:1: ( ( RULE_ID ) )
            // InternalQuickUI.g:2853:2: ( RULE_ID )
            {
            // InternalQuickUI.g:2853:2: ( RULE_ID )
            // InternalQuickUI.g:2854:3: RULE_ID
            {
             before(grammarAccess.getJavaElementAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJavaElementAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__NameAssignment_1_1"


    // $ANTLR start "rule__JavaElement__SubelementAssignment_3"
    // InternalQuickUI.g:2863:1: rule__JavaElement__SubelementAssignment_3 : ( ( rule__JavaElement__SubelementAlternatives_3_0 ) ) ;
    public final void rule__JavaElement__SubelementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2867:1: ( ( ( rule__JavaElement__SubelementAlternatives_3_0 ) ) )
            // InternalQuickUI.g:2868:2: ( ( rule__JavaElement__SubelementAlternatives_3_0 ) )
            {
            // InternalQuickUI.g:2868:2: ( ( rule__JavaElement__SubelementAlternatives_3_0 ) )
            // InternalQuickUI.g:2869:3: ( rule__JavaElement__SubelementAlternatives_3_0 )
            {
             before(grammarAccess.getJavaElementAccess().getSubelementAlternatives_3_0()); 
            // InternalQuickUI.g:2870:3: ( rule__JavaElement__SubelementAlternatives_3_0 )
            // InternalQuickUI.g:2870:4: rule__JavaElement__SubelementAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__JavaElement__SubelementAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getJavaElementAccess().getSubelementAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__SubelementAssignment_3"


    // $ANTLR start "rule__Row__NameAssignment_1_1"
    // InternalQuickUI.g:2878:1: rule__Row__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Row__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2882:1: ( ( RULE_ID ) )
            // InternalQuickUI.g:2883:2: ( RULE_ID )
            {
            // InternalQuickUI.g:2883:2: ( RULE_ID )
            // InternalQuickUI.g:2884:3: RULE_ID
            {
             before(grammarAccess.getRowAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__NameAssignment_1_1"


    // $ANTLR start "rule__Row__SubelementAssignment_3"
    // InternalQuickUI.g:2893:1: rule__Row__SubelementAssignment_3 : ( ( rule__Row__SubelementAlternatives_3_0 ) ) ;
    public final void rule__Row__SubelementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2897:1: ( ( ( rule__Row__SubelementAlternatives_3_0 ) ) )
            // InternalQuickUI.g:2898:2: ( ( rule__Row__SubelementAlternatives_3_0 ) )
            {
            // InternalQuickUI.g:2898:2: ( ( rule__Row__SubelementAlternatives_3_0 ) )
            // InternalQuickUI.g:2899:3: ( rule__Row__SubelementAlternatives_3_0 )
            {
             before(grammarAccess.getRowAccess().getSubelementAlternatives_3_0()); 
            // InternalQuickUI.g:2900:3: ( rule__Row__SubelementAlternatives_3_0 )
            // InternalQuickUI.g:2900:4: rule__Row__SubelementAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Row__SubelementAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getSubelementAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__SubelementAssignment_3"


    // $ANTLR start "rule__Label__ValueAssignment_2"
    // InternalQuickUI.g:2908:1: rule__Label__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Label__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2912:1: ( ( RULE_STRING ) )
            // InternalQuickUI.g:2913:2: ( RULE_STRING )
            {
            // InternalQuickUI.g:2913:2: ( RULE_STRING )
            // InternalQuickUI.g:2914:3: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__ValueAssignment_2"


    // $ANTLR start "rule__Enabled__ConditionAssignment_2"
    // InternalQuickUI.g:2923:1: rule__Enabled__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Enabled__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2927:1: ( ( ruleCondition ) )
            // InternalQuickUI.g:2928:2: ( ruleCondition )
            {
            // InternalQuickUI.g:2928:2: ( ruleCondition )
            // InternalQuickUI.g:2929:3: ruleCondition
            {
             before(grammarAccess.getEnabledAccess().getConditionConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getEnabledAccess().getConditionConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enabled__ConditionAssignment_2"


    // $ANTLR start "rule__Condition__ElementAssignment_1"
    // InternalQuickUI.g:2938:1: rule__Condition__ElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2942:1: ( ( ( RULE_ID ) ) )
            // InternalQuickUI.g:2943:2: ( ( RULE_ID ) )
            {
            // InternalQuickUI.g:2943:2: ( ( RULE_ID ) )
            // InternalQuickUI.g:2944:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getElementElementCrossReference_1_0()); 
            // InternalQuickUI.g:2945:3: ( RULE_ID )
            // InternalQuickUI.g:2946:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getElementElementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getElementElementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getElementElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ElementAssignment_1"


    // $ANTLR start "rule__Condition__NegationAssignment_3"
    // InternalQuickUI.g:2957:1: rule__Condition__NegationAssignment_3 : ( ( 'not' ) ) ;
    public final void rule__Condition__NegationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2961:1: ( ( ( 'not' ) ) )
            // InternalQuickUI.g:2962:2: ( ( 'not' ) )
            {
            // InternalQuickUI.g:2962:2: ( ( 'not' ) )
            // InternalQuickUI.g:2963:3: ( 'not' )
            {
             before(grammarAccess.getConditionAccess().getNegationNotKeyword_3_0()); 
            // InternalQuickUI.g:2964:3: ( 'not' )
            // InternalQuickUI.g:2965:4: 'not'
            {
             before(grammarAccess.getConditionAccess().getNegationNotKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNegationNotKeyword_3_0()); 

            }

             after(grammarAccess.getConditionAccess().getNegationNotKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__NegationAssignment_3"


    // $ANTLR start "rule__Condition__ConditionAssignment_4"
    // InternalQuickUI.g:2976:1: rule__Condition__ConditionAssignment_4 : ( ruleConditionType ) ;
    public final void rule__Condition__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2980:1: ( ( ruleConditionType ) )
            // InternalQuickUI.g:2981:2: ( ruleConditionType )
            {
            // InternalQuickUI.g:2981:2: ( ruleConditionType )
            // InternalQuickUI.g:2982:3: ruleConditionType
            {
             before(grammarAccess.getConditionAccess().getConditionConditionTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionType();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getConditionConditionTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConditionAssignment_4"


    // $ANTLR start "rule__Condition__SubconditionAssignment_5_1"
    // InternalQuickUI.g:2991:1: rule__Condition__SubconditionAssignment_5_1 : ( ruleCondition ) ;
    public final void rule__Condition__SubconditionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2995:1: ( ( ruleCondition ) )
            // InternalQuickUI.g:2996:2: ( ruleCondition )
            {
            // InternalQuickUI.g:2996:2: ( ruleCondition )
            // InternalQuickUI.g:2997:3: ruleCondition
            {
             before(grammarAccess.getConditionAccess().getSubconditionConditionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getSubconditionConditionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__SubconditionAssignment_5_1"


    // $ANTLR start "rule__Checked__CheckedAssignment_2"
    // InternalQuickUI.g:3006:1: rule__Checked__CheckedAssignment_2 : ( ruleBoolean ) ;
    public final void rule__Checked__CheckedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:3010:1: ( ( ruleBoolean ) )
            // InternalQuickUI.g:3011:2: ( ruleBoolean )
            {
            // InternalQuickUI.g:3011:2: ( ruleBoolean )
            // InternalQuickUI.g:3012:3: ruleBoolean
            {
             before(grammarAccess.getCheckedAccess().getCheckedBooleanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getCheckedAccess().getCheckedBooleanParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checked__CheckedAssignment_2"


    // $ANTLR start "rule__OnClick__CallbackAssignment_2"
    // InternalQuickUI.g:3021:1: rule__OnClick__CallbackAssignment_2 : ( RULE_ID ) ;
    public final void rule__OnClick__CallbackAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:3025:1: ( ( RULE_ID ) )
            // InternalQuickUI.g:3026:2: ( RULE_ID )
            {
            // InternalQuickUI.g:3026:2: ( RULE_ID )
            // InternalQuickUI.g:3027:3: RULE_ID
            {
             before(grammarAccess.getOnClickAccess().getCallbackIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnClickAccess().getCallbackIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnClick__CallbackAssignment_2"


    // $ANTLR start "rule__Boolean__IsTrueAssignment_1_0"
    // InternalQuickUI.g:3036:1: rule__Boolean__IsTrueAssignment_1_0 : ( ( 'true' ) ) ;
    public final void rule__Boolean__IsTrueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:3040:1: ( ( ( 'true' ) ) )
            // InternalQuickUI.g:3041:2: ( ( 'true' ) )
            {
            // InternalQuickUI.g:3041:2: ( ( 'true' ) )
            // InternalQuickUI.g:3042:3: ( 'true' )
            {
             before(grammarAccess.getBooleanAccess().getIsTrueTrueKeyword_1_0_0()); 
            // InternalQuickUI.g:3043:3: ( 'true' )
            // InternalQuickUI.g:3044:4: 'true'
            {
             before(grammarAccess.getBooleanAccess().getIsTrueTrueKeyword_1_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBooleanAccess().getIsTrueTrueKeyword_1_0_0()); 

            }

             after(grammarAccess.getBooleanAccess().getIsTrueTrueKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__IsTrueAssignment_1_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000120010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000070720010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000070700012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000070700010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000010D000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000800L});

}