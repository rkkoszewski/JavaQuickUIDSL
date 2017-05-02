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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'use'", "':'", "'.'", "'{'", "'}'", "'Menu'", "'Content'", "'Row'", "'Label'", "'Enabled'", "'or'", "'and'", "'if'", "'is'", "'empty'", "'checked'", "'Checked'", "'OnClick'", "'Main'", "'not'", "'true'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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


    // $ANTLR start "entryRuleConditionBranch"
    // InternalQuickUI.g:303:1: entryRuleConditionBranch : ruleConditionBranch EOF ;
    public final void entryRuleConditionBranch() throws RecognitionException {
        try {
            // InternalQuickUI.g:304:1: ( ruleConditionBranch EOF )
            // InternalQuickUI.g:305:1: ruleConditionBranch EOF
            {
             before(grammarAccess.getConditionBranchRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionBranch();

            state._fsp--;

             after(grammarAccess.getConditionBranchRule()); 
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
    // $ANTLR end "entryRuleConditionBranch"


    // $ANTLR start "ruleConditionBranch"
    // InternalQuickUI.g:312:1: ruleConditionBranch : ( ( rule__ConditionBranch__Group__0 ) ) ;
    public final void ruleConditionBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:316:2: ( ( ( rule__ConditionBranch__Group__0 ) ) )
            // InternalQuickUI.g:317:2: ( ( rule__ConditionBranch__Group__0 ) )
            {
            // InternalQuickUI.g:317:2: ( ( rule__ConditionBranch__Group__0 ) )
            // InternalQuickUI.g:318:3: ( rule__ConditionBranch__Group__0 )
            {
             before(grammarAccess.getConditionBranchAccess().getGroup()); 
            // InternalQuickUI.g:319:3: ( rule__ConditionBranch__Group__0 )
            // InternalQuickUI.g:319:4: rule__ConditionBranch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBranch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionBranchAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionBranch"


    // $ANTLR start "entryRuleConditionConcatenation"
    // InternalQuickUI.g:328:1: entryRuleConditionConcatenation : ruleConditionConcatenation EOF ;
    public final void entryRuleConditionConcatenation() throws RecognitionException {
        try {
            // InternalQuickUI.g:329:1: ( ruleConditionConcatenation EOF )
            // InternalQuickUI.g:330:1: ruleConditionConcatenation EOF
            {
             before(grammarAccess.getConditionConcatenationRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionConcatenation();

            state._fsp--;

             after(grammarAccess.getConditionConcatenationRule()); 
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
    // $ANTLR end "entryRuleConditionConcatenation"


    // $ANTLR start "ruleConditionConcatenation"
    // InternalQuickUI.g:337:1: ruleConditionConcatenation : ( ( rule__ConditionConcatenation__Group__0 ) ) ;
    public final void ruleConditionConcatenation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:341:2: ( ( ( rule__ConditionConcatenation__Group__0 ) ) )
            // InternalQuickUI.g:342:2: ( ( rule__ConditionConcatenation__Group__0 ) )
            {
            // InternalQuickUI.g:342:2: ( ( rule__ConditionConcatenation__Group__0 ) )
            // InternalQuickUI.g:343:3: ( rule__ConditionConcatenation__Group__0 )
            {
             before(grammarAccess.getConditionConcatenationAccess().getGroup()); 
            // InternalQuickUI.g:344:3: ( rule__ConditionConcatenation__Group__0 )
            // InternalQuickUI.g:344:4: rule__ConditionConcatenation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionConcatenation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionConcatenationAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionConcatenation"


    // $ANTLR start "entryRuleConditionValue"
    // InternalQuickUI.g:353:1: entryRuleConditionValue : ruleConditionValue EOF ;
    public final void entryRuleConditionValue() throws RecognitionException {
        try {
            // InternalQuickUI.g:354:1: ( ruleConditionValue EOF )
            // InternalQuickUI.g:355:1: ruleConditionValue EOF
            {
             before(grammarAccess.getConditionValueRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionValue();

            state._fsp--;

             after(grammarAccess.getConditionValueRule()); 
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
    // $ANTLR end "entryRuleConditionValue"


    // $ANTLR start "ruleConditionValue"
    // InternalQuickUI.g:362:1: ruleConditionValue : ( ruleCondition ) ;
    public final void ruleConditionValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:366:2: ( ( ruleCondition ) )
            // InternalQuickUI.g:367:2: ( ruleCondition )
            {
            // InternalQuickUI.g:367:2: ( ruleCondition )
            // InternalQuickUI.g:368:3: ruleCondition
            {
             before(grammarAccess.getConditionValueAccess().getConditionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionValueAccess().getConditionParserRuleCall()); 

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
    // $ANTLR end "ruleConditionValue"


    // $ANTLR start "entryRuleCondition"
    // InternalQuickUI.g:378:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalQuickUI.g:379:1: ( ruleCondition EOF )
            // InternalQuickUI.g:380:1: ruleCondition EOF
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
    // InternalQuickUI.g:387:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:391:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalQuickUI.g:392:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalQuickUI.g:392:2: ( ( rule__Condition__Group__0 ) )
            // InternalQuickUI.g:393:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalQuickUI.g:394:3: ( rule__Condition__Group__0 )
            // InternalQuickUI.g:394:4: rule__Condition__Group__0
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
    // InternalQuickUI.g:403:1: entryRuleConditionType : ruleConditionType EOF ;
    public final void entryRuleConditionType() throws RecognitionException {
        try {
            // InternalQuickUI.g:404:1: ( ruleConditionType EOF )
            // InternalQuickUI.g:405:1: ruleConditionType EOF
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
    // InternalQuickUI.g:412:1: ruleConditionType : ( ( rule__ConditionType__Alternatives ) ) ;
    public final void ruleConditionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:416:2: ( ( ( rule__ConditionType__Alternatives ) ) )
            // InternalQuickUI.g:417:2: ( ( rule__ConditionType__Alternatives ) )
            {
            // InternalQuickUI.g:417:2: ( ( rule__ConditionType__Alternatives ) )
            // InternalQuickUI.g:418:3: ( rule__ConditionType__Alternatives )
            {
             before(grammarAccess.getConditionTypeAccess().getAlternatives()); 
            // InternalQuickUI.g:419:3: ( rule__ConditionType__Alternatives )
            // InternalQuickUI.g:419:4: rule__ConditionType__Alternatives
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
    // InternalQuickUI.g:428:1: entryRuleChecked : ruleChecked EOF ;
    public final void entryRuleChecked() throws RecognitionException {
        try {
            // InternalQuickUI.g:429:1: ( ruleChecked EOF )
            // InternalQuickUI.g:430:1: ruleChecked EOF
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
    // InternalQuickUI.g:437:1: ruleChecked : ( ( rule__Checked__Group__0 ) ) ;
    public final void ruleChecked() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:441:2: ( ( ( rule__Checked__Group__0 ) ) )
            // InternalQuickUI.g:442:2: ( ( rule__Checked__Group__0 ) )
            {
            // InternalQuickUI.g:442:2: ( ( rule__Checked__Group__0 ) )
            // InternalQuickUI.g:443:3: ( rule__Checked__Group__0 )
            {
             before(grammarAccess.getCheckedAccess().getGroup()); 
            // InternalQuickUI.g:444:3: ( rule__Checked__Group__0 )
            // InternalQuickUI.g:444:4: rule__Checked__Group__0
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
    // InternalQuickUI.g:453:1: entryRuleOnClick : ruleOnClick EOF ;
    public final void entryRuleOnClick() throws RecognitionException {
        try {
            // InternalQuickUI.g:454:1: ( ruleOnClick EOF )
            // InternalQuickUI.g:455:1: ruleOnClick EOF
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
    // InternalQuickUI.g:462:1: ruleOnClick : ( ( rule__OnClick__Group__0 ) ) ;
    public final void ruleOnClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:466:2: ( ( ( rule__OnClick__Group__0 ) ) )
            // InternalQuickUI.g:467:2: ( ( rule__OnClick__Group__0 ) )
            {
            // InternalQuickUI.g:467:2: ( ( rule__OnClick__Group__0 ) )
            // InternalQuickUI.g:468:3: ( rule__OnClick__Group__0 )
            {
             before(grammarAccess.getOnClickAccess().getGroup()); 
            // InternalQuickUI.g:469:3: ( rule__OnClick__Group__0 )
            // InternalQuickUI.g:469:4: rule__OnClick__Group__0
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


    // $ANTLR start "entryRuleBoolean"
    // InternalQuickUI.g:478:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalQuickUI.g:479:1: ( ruleBoolean EOF )
            // InternalQuickUI.g:480:1: ruleBoolean EOF
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
    // InternalQuickUI.g:487:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:491:2: ( ( ( rule__Boolean__Group__0 ) ) )
            // InternalQuickUI.g:492:2: ( ( rule__Boolean__Group__0 ) )
            {
            // InternalQuickUI.g:492:2: ( ( rule__Boolean__Group__0 ) )
            // InternalQuickUI.g:493:3: ( rule__Boolean__Group__0 )
            {
             before(grammarAccess.getBooleanAccess().getGroup()); 
            // InternalQuickUI.g:494:3: ( rule__Boolean__Group__0 )
            // InternalQuickUI.g:494:4: rule__Boolean__Group__0
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
    // InternalQuickUI.g:502:1: rule__Element__Alternatives : ( ( ruleRow ) | ( ruleJavaElement ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:506:1: ( ( ruleRow ) | ( ruleJavaElement ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
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
                    // InternalQuickUI.g:507:2: ( ruleRow )
                    {
                    // InternalQuickUI.g:507:2: ( ruleRow )
                    // InternalQuickUI.g:508:3: ruleRow
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
                    // InternalQuickUI.g:513:2: ( ruleJavaElement )
                    {
                    // InternalQuickUI.g:513:2: ( ruleJavaElement )
                    // InternalQuickUI.g:514:3: ruleJavaElement
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
    // InternalQuickUI.g:523:1: rule__JavaElement__SubelementAlternatives_3_0 : ( ( ruleElement ) | ( ruleOption ) );
    public final void rule__JavaElement__SubelementAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:527:1: ( ( ruleElement ) | ( ruleOption ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==19) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=20 && LA2_0<=21)||(LA2_0>=28 && LA2_0<=29)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQuickUI.g:528:2: ( ruleElement )
                    {
                    // InternalQuickUI.g:528:2: ( ruleElement )
                    // InternalQuickUI.g:529:3: ruleElement
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
                    // InternalQuickUI.g:534:2: ( ruleOption )
                    {
                    // InternalQuickUI.g:534:2: ( ruleOption )
                    // InternalQuickUI.g:535:3: ruleOption
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
    // InternalQuickUI.g:544:1: rule__Row__SubelementAlternatives_3_0 : ( ( ruleElement ) | ( ruleOption ) );
    public final void rule__Row__SubelementAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:548:1: ( ( ruleElement ) | ( ruleOption ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==19) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=20 && LA3_0<=21)||(LA3_0>=28 && LA3_0<=29)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQuickUI.g:549:2: ( ruleElement )
                    {
                    // InternalQuickUI.g:549:2: ( ruleElement )
                    // InternalQuickUI.g:550:3: ruleElement
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
                    // InternalQuickUI.g:555:2: ( ruleOption )
                    {
                    // InternalQuickUI.g:555:2: ( ruleOption )
                    // InternalQuickUI.g:556:3: ruleOption
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
    // InternalQuickUI.g:565:1: rule__Option__Alternatives : ( ( ruleLabel ) | ( ruleEnabled ) | ( ruleChecked ) | ( ruleOnClick ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:569:1: ( ( ruleLabel ) | ( ruleEnabled ) | ( ruleChecked ) | ( ruleOnClick ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalQuickUI.g:570:2: ( ruleLabel )
                    {
                    // InternalQuickUI.g:570:2: ( ruleLabel )
                    // InternalQuickUI.g:571:3: ruleLabel
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
                    // InternalQuickUI.g:576:2: ( ruleEnabled )
                    {
                    // InternalQuickUI.g:576:2: ( ruleEnabled )
                    // InternalQuickUI.g:577:3: ruleEnabled
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
                    // InternalQuickUI.g:582:2: ( ruleChecked )
                    {
                    // InternalQuickUI.g:582:2: ( ruleChecked )
                    // InternalQuickUI.g:583:3: ruleChecked
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
                    // InternalQuickUI.g:588:2: ( ruleOnClick )
                    {
                    // InternalQuickUI.g:588:2: ( ruleOnClick )
                    // InternalQuickUI.g:589:3: ruleOnClick
                    {
                     before(grammarAccess.getOptionAccess().getOnClickParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOnClick();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getOnClickParserRuleCall_3()); 

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
    // InternalQuickUI.g:598:1: rule__ConditionType__Alternatives : ( ( ( rule__ConditionType__Group_0__0 ) ) | ( ( rule__ConditionType__Group_1__0 ) ) );
    public final void rule__ConditionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:602:1: ( ( ( rule__ConditionType__Group_0__0 ) ) | ( ( rule__ConditionType__Group_1__0 ) ) )
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
                    // InternalQuickUI.g:603:2: ( ( rule__ConditionType__Group_0__0 ) )
                    {
                    // InternalQuickUI.g:603:2: ( ( rule__ConditionType__Group_0__0 ) )
                    // InternalQuickUI.g:604:3: ( rule__ConditionType__Group_0__0 )
                    {
                     before(grammarAccess.getConditionTypeAccess().getGroup_0()); 
                    // InternalQuickUI.g:605:3: ( rule__ConditionType__Group_0__0 )
                    // InternalQuickUI.g:605:4: rule__ConditionType__Group_0__0
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
                    // InternalQuickUI.g:609:2: ( ( rule__ConditionType__Group_1__0 ) )
                    {
                    // InternalQuickUI.g:609:2: ( ( rule__ConditionType__Group_1__0 ) )
                    // InternalQuickUI.g:610:3: ( rule__ConditionType__Group_1__0 )
                    {
                     before(grammarAccess.getConditionTypeAccess().getGroup_1()); 
                    // InternalQuickUI.g:611:3: ( rule__ConditionType__Group_1__0 )
                    // InternalQuickUI.g:611:4: rule__ConditionType__Group_1__0
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
    // InternalQuickUI.g:619:1: rule__Boolean__Alternatives_1 : ( ( ( rule__Boolean__IsTrueAssignment_1_0 ) ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:623:1: ( ( ( rule__Boolean__IsTrueAssignment_1_0 ) ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQuickUI.g:624:2: ( ( rule__Boolean__IsTrueAssignment_1_0 ) )
                    {
                    // InternalQuickUI.g:624:2: ( ( rule__Boolean__IsTrueAssignment_1_0 ) )
                    // InternalQuickUI.g:625:3: ( rule__Boolean__IsTrueAssignment_1_0 )
                    {
                     before(grammarAccess.getBooleanAccess().getIsTrueAssignment_1_0()); 
                    // InternalQuickUI.g:626:3: ( rule__Boolean__IsTrueAssignment_1_0 )
                    // InternalQuickUI.g:626:4: rule__Boolean__IsTrueAssignment_1_0
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
                    // InternalQuickUI.g:630:2: ( 'false' )
                    {
                    // InternalQuickUI.g:630:2: ( 'false' )
                    // InternalQuickUI.g:631:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1_1()); 
                    match(input,11,FOLLOW_2); 
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
    // InternalQuickUI.g:640:1: rule__UIModel__Group__0 : rule__UIModel__Group__0__Impl rule__UIModel__Group__1 ;
    public final void rule__UIModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:644:1: ( rule__UIModel__Group__0__Impl rule__UIModel__Group__1 )
            // InternalQuickUI.g:645:2: rule__UIModel__Group__0__Impl rule__UIModel__Group__1
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
    // InternalQuickUI.g:652:1: rule__UIModel__Group__0__Impl : ( ( rule__UIModel__AliasAssignment_0 )* ) ;
    public final void rule__UIModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:656:1: ( ( ( rule__UIModel__AliasAssignment_0 )* ) )
            // InternalQuickUI.g:657:1: ( ( rule__UIModel__AliasAssignment_0 )* )
            {
            // InternalQuickUI.g:657:1: ( ( rule__UIModel__AliasAssignment_0 )* )
            // InternalQuickUI.g:658:2: ( rule__UIModel__AliasAssignment_0 )*
            {
             before(grammarAccess.getUIModelAccess().getAliasAssignment_0()); 
            // InternalQuickUI.g:659:2: ( rule__UIModel__AliasAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQuickUI.g:659:3: rule__UIModel__AliasAssignment_0
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
    // InternalQuickUI.g:667:1: rule__UIModel__Group__1 : rule__UIModel__Group__1__Impl ;
    public final void rule__UIModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:671:1: ( rule__UIModel__Group__1__Impl )
            // InternalQuickUI.g:672:2: rule__UIModel__Group__1__Impl
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
    // InternalQuickUI.g:678:1: rule__UIModel__Group__1__Impl : ( ( ( rule__UIModel__WindowAssignment_1 ) ) ( ( rule__UIModel__WindowAssignment_1 )* ) ) ;
    public final void rule__UIModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:682:1: ( ( ( ( rule__UIModel__WindowAssignment_1 ) ) ( ( rule__UIModel__WindowAssignment_1 )* ) ) )
            // InternalQuickUI.g:683:1: ( ( ( rule__UIModel__WindowAssignment_1 ) ) ( ( rule__UIModel__WindowAssignment_1 )* ) )
            {
            // InternalQuickUI.g:683:1: ( ( ( rule__UIModel__WindowAssignment_1 ) ) ( ( rule__UIModel__WindowAssignment_1 )* ) )
            // InternalQuickUI.g:684:2: ( ( rule__UIModel__WindowAssignment_1 ) ) ( ( rule__UIModel__WindowAssignment_1 )* )
            {
            // InternalQuickUI.g:684:2: ( ( rule__UIModel__WindowAssignment_1 ) )
            // InternalQuickUI.g:685:3: ( rule__UIModel__WindowAssignment_1 )
            {
             before(grammarAccess.getUIModelAccess().getWindowAssignment_1()); 
            // InternalQuickUI.g:686:3: ( rule__UIModel__WindowAssignment_1 )
            // InternalQuickUI.g:686:4: rule__UIModel__WindowAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__UIModel__WindowAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUIModelAccess().getWindowAssignment_1()); 

            }

            // InternalQuickUI.g:689:2: ( ( rule__UIModel__WindowAssignment_1 )* )
            // InternalQuickUI.g:690:3: ( rule__UIModel__WindowAssignment_1 )*
            {
             before(grammarAccess.getUIModelAccess().getWindowAssignment_1()); 
            // InternalQuickUI.g:691:3: ( rule__UIModel__WindowAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQuickUI.g:691:4: rule__UIModel__WindowAssignment_1
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
    // InternalQuickUI.g:701:1: rule__Alias__Group__0 : rule__Alias__Group__0__Impl rule__Alias__Group__1 ;
    public final void rule__Alias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:705:1: ( rule__Alias__Group__0__Impl rule__Alias__Group__1 )
            // InternalQuickUI.g:706:2: rule__Alias__Group__0__Impl rule__Alias__Group__1
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
    // InternalQuickUI.g:713:1: rule__Alias__Group__0__Impl : ( 'use' ) ;
    public final void rule__Alias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:717:1: ( ( 'use' ) )
            // InternalQuickUI.g:718:1: ( 'use' )
            {
            // InternalQuickUI.g:718:1: ( 'use' )
            // InternalQuickUI.g:719:2: 'use'
            {
             before(grammarAccess.getAliasAccess().getUseKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalQuickUI.g:728:1: rule__Alias__Group__1 : rule__Alias__Group__1__Impl rule__Alias__Group__2 ;
    public final void rule__Alias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:732:1: ( rule__Alias__Group__1__Impl rule__Alias__Group__2 )
            // InternalQuickUI.g:733:2: rule__Alias__Group__1__Impl rule__Alias__Group__2
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
    // InternalQuickUI.g:740:1: rule__Alias__Group__1__Impl : ( ( rule__Alias__NameAssignment_1 ) ) ;
    public final void rule__Alias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:744:1: ( ( ( rule__Alias__NameAssignment_1 ) ) )
            // InternalQuickUI.g:745:1: ( ( rule__Alias__NameAssignment_1 ) )
            {
            // InternalQuickUI.g:745:1: ( ( rule__Alias__NameAssignment_1 ) )
            // InternalQuickUI.g:746:2: ( rule__Alias__NameAssignment_1 )
            {
             before(grammarAccess.getAliasAccess().getNameAssignment_1()); 
            // InternalQuickUI.g:747:2: ( rule__Alias__NameAssignment_1 )
            // InternalQuickUI.g:747:3: rule__Alias__NameAssignment_1
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
    // InternalQuickUI.g:755:1: rule__Alias__Group__2 : rule__Alias__Group__2__Impl rule__Alias__Group__3 ;
    public final void rule__Alias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:759:1: ( rule__Alias__Group__2__Impl rule__Alias__Group__3 )
            // InternalQuickUI.g:760:2: rule__Alias__Group__2__Impl rule__Alias__Group__3
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
    // InternalQuickUI.g:767:1: rule__Alias__Group__2__Impl : ( ':' ) ;
    public final void rule__Alias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:771:1: ( ( ':' ) )
            // InternalQuickUI.g:772:1: ( ':' )
            {
            // InternalQuickUI.g:772:1: ( ':' )
            // InternalQuickUI.g:773:2: ':'
            {
             before(grammarAccess.getAliasAccess().getColonKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalQuickUI.g:782:1: rule__Alias__Group__3 : rule__Alias__Group__3__Impl ;
    public final void rule__Alias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:786:1: ( rule__Alias__Group__3__Impl )
            // InternalQuickUI.g:787:2: rule__Alias__Group__3__Impl
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
    // InternalQuickUI.g:793:1: rule__Alias__Group__3__Impl : ( ( rule__Alias__PackageAssignment_3 ) ) ;
    public final void rule__Alias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:797:1: ( ( ( rule__Alias__PackageAssignment_3 ) ) )
            // InternalQuickUI.g:798:1: ( ( rule__Alias__PackageAssignment_3 ) )
            {
            // InternalQuickUI.g:798:1: ( ( rule__Alias__PackageAssignment_3 ) )
            // InternalQuickUI.g:799:2: ( rule__Alias__PackageAssignment_3 )
            {
             before(grammarAccess.getAliasAccess().getPackageAssignment_3()); 
            // InternalQuickUI.g:800:2: ( rule__Alias__PackageAssignment_3 )
            // InternalQuickUI.g:800:3: rule__Alias__PackageAssignment_3
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
    // InternalQuickUI.g:809:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:813:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalQuickUI.g:814:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalQuickUI.g:821:1: rule__Package__Group__0__Impl : ( ( rule__Package__PnameAssignment_0 ) ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:825:1: ( ( ( rule__Package__PnameAssignment_0 ) ) )
            // InternalQuickUI.g:826:1: ( ( rule__Package__PnameAssignment_0 ) )
            {
            // InternalQuickUI.g:826:1: ( ( rule__Package__PnameAssignment_0 ) )
            // InternalQuickUI.g:827:2: ( rule__Package__PnameAssignment_0 )
            {
             before(grammarAccess.getPackageAccess().getPnameAssignment_0()); 
            // InternalQuickUI.g:828:2: ( rule__Package__PnameAssignment_0 )
            // InternalQuickUI.g:828:3: rule__Package__PnameAssignment_0
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
    // InternalQuickUI.g:836:1: rule__Package__Group__1 : rule__Package__Group__1__Impl ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:840:1: ( rule__Package__Group__1__Impl )
            // InternalQuickUI.g:841:2: rule__Package__Group__1__Impl
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
    // InternalQuickUI.g:847:1: rule__Package__Group__1__Impl : ( ( rule__Package__Group_1__0 )? ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:851:1: ( ( ( rule__Package__Group_1__0 )? ) )
            // InternalQuickUI.g:852:1: ( ( rule__Package__Group_1__0 )? )
            {
            // InternalQuickUI.g:852:1: ( ( rule__Package__Group_1__0 )? )
            // InternalQuickUI.g:853:2: ( rule__Package__Group_1__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_1()); 
            // InternalQuickUI.g:854:2: ( rule__Package__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQuickUI.g:854:3: rule__Package__Group_1__0
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
    // InternalQuickUI.g:863:1: rule__Package__Group_1__0 : rule__Package__Group_1__0__Impl rule__Package__Group_1__1 ;
    public final void rule__Package__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:867:1: ( rule__Package__Group_1__0__Impl rule__Package__Group_1__1 )
            // InternalQuickUI.g:868:2: rule__Package__Group_1__0__Impl rule__Package__Group_1__1
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
    // InternalQuickUI.g:875:1: rule__Package__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Package__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:879:1: ( ( '.' ) )
            // InternalQuickUI.g:880:1: ( '.' )
            {
            // InternalQuickUI.g:880:1: ( '.' )
            // InternalQuickUI.g:881:2: '.'
            {
             before(grammarAccess.getPackageAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalQuickUI.g:890:1: rule__Package__Group_1__1 : rule__Package__Group_1__1__Impl ;
    public final void rule__Package__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:894:1: ( rule__Package__Group_1__1__Impl )
            // InternalQuickUI.g:895:2: rule__Package__Group_1__1__Impl
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
    // InternalQuickUI.g:901:1: rule__Package__Group_1__1__Impl : ( ( rule__Package__SubpAssignment_1_1 ) ) ;
    public final void rule__Package__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:905:1: ( ( ( rule__Package__SubpAssignment_1_1 ) ) )
            // InternalQuickUI.g:906:1: ( ( rule__Package__SubpAssignment_1_1 ) )
            {
            // InternalQuickUI.g:906:1: ( ( rule__Package__SubpAssignment_1_1 ) )
            // InternalQuickUI.g:907:2: ( rule__Package__SubpAssignment_1_1 )
            {
             before(grammarAccess.getPackageAccess().getSubpAssignment_1_1()); 
            // InternalQuickUI.g:908:2: ( rule__Package__SubpAssignment_1_1 )
            // InternalQuickUI.g:908:3: rule__Package__SubpAssignment_1_1
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
    // InternalQuickUI.g:917:1: rule__Window__Group__0 : rule__Window__Group__0__Impl rule__Window__Group__1 ;
    public final void rule__Window__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:921:1: ( rule__Window__Group__0__Impl rule__Window__Group__1 )
            // InternalQuickUI.g:922:2: rule__Window__Group__0__Impl rule__Window__Group__1
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
    // InternalQuickUI.g:929:1: rule__Window__Group__0__Impl : ( () ) ;
    public final void rule__Window__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:933:1: ( ( () ) )
            // InternalQuickUI.g:934:1: ( () )
            {
            // InternalQuickUI.g:934:1: ( () )
            // InternalQuickUI.g:935:2: ()
            {
             before(grammarAccess.getWindowAccess().getWindowAction_0()); 
            // InternalQuickUI.g:936:2: ()
            // InternalQuickUI.g:936:3: 
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
    // InternalQuickUI.g:944:1: rule__Window__Group__1 : rule__Window__Group__1__Impl rule__Window__Group__2 ;
    public final void rule__Window__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:948:1: ( rule__Window__Group__1__Impl rule__Window__Group__2 )
            // InternalQuickUI.g:949:2: rule__Window__Group__1__Impl rule__Window__Group__2
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
    // InternalQuickUI.g:956:1: rule__Window__Group__1__Impl : ( ( rule__Window__Group_1__0 )? ) ;
    public final void rule__Window__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:960:1: ( ( ( rule__Window__Group_1__0 )? ) )
            // InternalQuickUI.g:961:1: ( ( rule__Window__Group_1__0 )? )
            {
            // InternalQuickUI.g:961:1: ( ( rule__Window__Group_1__0 )? )
            // InternalQuickUI.g:962:2: ( rule__Window__Group_1__0 )?
            {
             before(grammarAccess.getWindowAccess().getGroup_1()); 
            // InternalQuickUI.g:963:2: ( rule__Window__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQuickUI.g:963:3: rule__Window__Group_1__0
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
    // InternalQuickUI.g:971:1: rule__Window__Group__2 : rule__Window__Group__2__Impl rule__Window__Group__3 ;
    public final void rule__Window__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:975:1: ( rule__Window__Group__2__Impl rule__Window__Group__3 )
            // InternalQuickUI.g:976:2: rule__Window__Group__2__Impl rule__Window__Group__3
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
    // InternalQuickUI.g:983:1: rule__Window__Group__2__Impl : ( ( rule__Window__NameAssignment_2 ) ) ;
    public final void rule__Window__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:987:1: ( ( ( rule__Window__NameAssignment_2 ) ) )
            // InternalQuickUI.g:988:1: ( ( rule__Window__NameAssignment_2 ) )
            {
            // InternalQuickUI.g:988:1: ( ( rule__Window__NameAssignment_2 ) )
            // InternalQuickUI.g:989:2: ( rule__Window__NameAssignment_2 )
            {
             before(grammarAccess.getWindowAccess().getNameAssignment_2()); 
            // InternalQuickUI.g:990:2: ( rule__Window__NameAssignment_2 )
            // InternalQuickUI.g:990:3: rule__Window__NameAssignment_2
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
    // InternalQuickUI.g:998:1: rule__Window__Group__3 : rule__Window__Group__3__Impl rule__Window__Group__4 ;
    public final void rule__Window__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1002:1: ( rule__Window__Group__3__Impl rule__Window__Group__4 )
            // InternalQuickUI.g:1003:2: rule__Window__Group__3__Impl rule__Window__Group__4
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
    // InternalQuickUI.g:1010:1: rule__Window__Group__3__Impl : ( ( rule__Window__Group_3__0 )? ) ;
    public final void rule__Window__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1014:1: ( ( ( rule__Window__Group_3__0 )? ) )
            // InternalQuickUI.g:1015:1: ( ( rule__Window__Group_3__0 )? )
            {
            // InternalQuickUI.g:1015:1: ( ( rule__Window__Group_3__0 )? )
            // InternalQuickUI.g:1016:2: ( rule__Window__Group_3__0 )?
            {
             before(grammarAccess.getWindowAccess().getGroup_3()); 
            // InternalQuickUI.g:1017:2: ( rule__Window__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQuickUI.g:1017:3: rule__Window__Group_3__0
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
    // InternalQuickUI.g:1025:1: rule__Window__Group__4 : rule__Window__Group__4__Impl rule__Window__Group__5 ;
    public final void rule__Window__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1029:1: ( rule__Window__Group__4__Impl rule__Window__Group__5 )
            // InternalQuickUI.g:1030:2: rule__Window__Group__4__Impl rule__Window__Group__5
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
    // InternalQuickUI.g:1037:1: rule__Window__Group__4__Impl : ( '{' ) ;
    public final void rule__Window__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1041:1: ( ( '{' ) )
            // InternalQuickUI.g:1042:1: ( '{' )
            {
            // InternalQuickUI.g:1042:1: ( '{' )
            // InternalQuickUI.g:1043:2: '{'
            {
             before(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
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
    // InternalQuickUI.g:1052:1: rule__Window__Group__5 : rule__Window__Group__5__Impl rule__Window__Group__6 ;
    public final void rule__Window__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1056:1: ( rule__Window__Group__5__Impl rule__Window__Group__6 )
            // InternalQuickUI.g:1057:2: rule__Window__Group__5__Impl rule__Window__Group__6
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
    // InternalQuickUI.g:1064:1: rule__Window__Group__5__Impl : ( ( rule__Window__Group_5__0 )? ) ;
    public final void rule__Window__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1068:1: ( ( ( rule__Window__Group_5__0 )? ) )
            // InternalQuickUI.g:1069:1: ( ( rule__Window__Group_5__0 )? )
            {
            // InternalQuickUI.g:1069:1: ( ( rule__Window__Group_5__0 )? )
            // InternalQuickUI.g:1070:2: ( rule__Window__Group_5__0 )?
            {
             before(grammarAccess.getWindowAccess().getGroup_5()); 
            // InternalQuickUI.g:1071:2: ( rule__Window__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQuickUI.g:1071:3: rule__Window__Group_5__0
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
    // InternalQuickUI.g:1079:1: rule__Window__Group__6 : rule__Window__Group__6__Impl rule__Window__Group__7 ;
    public final void rule__Window__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1083:1: ( rule__Window__Group__6__Impl rule__Window__Group__7 )
            // InternalQuickUI.g:1084:2: rule__Window__Group__6__Impl rule__Window__Group__7
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
    // InternalQuickUI.g:1091:1: rule__Window__Group__6__Impl : ( ( rule__Window__Group_6__0 ) ) ;
    public final void rule__Window__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1095:1: ( ( ( rule__Window__Group_6__0 ) ) )
            // InternalQuickUI.g:1096:1: ( ( rule__Window__Group_6__0 ) )
            {
            // InternalQuickUI.g:1096:1: ( ( rule__Window__Group_6__0 ) )
            // InternalQuickUI.g:1097:2: ( rule__Window__Group_6__0 )
            {
             before(grammarAccess.getWindowAccess().getGroup_6()); 
            // InternalQuickUI.g:1098:2: ( rule__Window__Group_6__0 )
            // InternalQuickUI.g:1098:3: rule__Window__Group_6__0
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
    // InternalQuickUI.g:1106:1: rule__Window__Group__7 : rule__Window__Group__7__Impl ;
    public final void rule__Window__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1110:1: ( rule__Window__Group__7__Impl )
            // InternalQuickUI.g:1111:2: rule__Window__Group__7__Impl
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
    // InternalQuickUI.g:1117:1: rule__Window__Group__7__Impl : ( '}' ) ;
    public final void rule__Window__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1121:1: ( ( '}' ) )
            // InternalQuickUI.g:1122:1: ( '}' )
            {
            // InternalQuickUI.g:1122:1: ( '}' )
            // InternalQuickUI.g:1123:2: '}'
            {
             before(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
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
    // InternalQuickUI.g:1133:1: rule__Window__Group_1__0 : rule__Window__Group_1__0__Impl rule__Window__Group_1__1 ;
    public final void rule__Window__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1137:1: ( rule__Window__Group_1__0__Impl rule__Window__Group_1__1 )
            // InternalQuickUI.g:1138:2: rule__Window__Group_1__0__Impl rule__Window__Group_1__1
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
    // InternalQuickUI.g:1145:1: rule__Window__Group_1__0__Impl : ( ( rule__Window__MainAssignment_1_0 ) ) ;
    public final void rule__Window__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1149:1: ( ( ( rule__Window__MainAssignment_1_0 ) ) )
            // InternalQuickUI.g:1150:1: ( ( rule__Window__MainAssignment_1_0 ) )
            {
            // InternalQuickUI.g:1150:1: ( ( rule__Window__MainAssignment_1_0 ) )
            // InternalQuickUI.g:1151:2: ( rule__Window__MainAssignment_1_0 )
            {
             before(grammarAccess.getWindowAccess().getMainAssignment_1_0()); 
            // InternalQuickUI.g:1152:2: ( rule__Window__MainAssignment_1_0 )
            // InternalQuickUI.g:1152:3: rule__Window__MainAssignment_1_0
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
    // InternalQuickUI.g:1160:1: rule__Window__Group_1__1 : rule__Window__Group_1__1__Impl ;
    public final void rule__Window__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1164:1: ( rule__Window__Group_1__1__Impl )
            // InternalQuickUI.g:1165:2: rule__Window__Group_1__1__Impl
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
    // InternalQuickUI.g:1171:1: rule__Window__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Window__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1175:1: ( ( ':' ) )
            // InternalQuickUI.g:1176:1: ( ':' )
            {
            // InternalQuickUI.g:1176:1: ( ':' )
            // InternalQuickUI.g:1177:2: ':'
            {
             before(grammarAccess.getWindowAccess().getColonKeyword_1_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalQuickUI.g:1187:1: rule__Window__Group_3__0 : rule__Window__Group_3__0__Impl rule__Window__Group_3__1 ;
    public final void rule__Window__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1191:1: ( rule__Window__Group_3__0__Impl rule__Window__Group_3__1 )
            // InternalQuickUI.g:1192:2: rule__Window__Group_3__0__Impl rule__Window__Group_3__1
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
    // InternalQuickUI.g:1199:1: rule__Window__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Window__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1203:1: ( ( ':' ) )
            // InternalQuickUI.g:1204:1: ( ':' )
            {
            // InternalQuickUI.g:1204:1: ( ':' )
            // InternalQuickUI.g:1205:2: ':'
            {
             before(grammarAccess.getWindowAccess().getColonKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalQuickUI.g:1214:1: rule__Window__Group_3__1 : rule__Window__Group_3__1__Impl ;
    public final void rule__Window__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1218:1: ( rule__Window__Group_3__1__Impl )
            // InternalQuickUI.g:1219:2: rule__Window__Group_3__1__Impl
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
    // InternalQuickUI.g:1225:1: rule__Window__Group_3__1__Impl : ( ( rule__Window__TitleAssignment_3_1 ) ) ;
    public final void rule__Window__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1229:1: ( ( ( rule__Window__TitleAssignment_3_1 ) ) )
            // InternalQuickUI.g:1230:1: ( ( rule__Window__TitleAssignment_3_1 ) )
            {
            // InternalQuickUI.g:1230:1: ( ( rule__Window__TitleAssignment_3_1 ) )
            // InternalQuickUI.g:1231:2: ( rule__Window__TitleAssignment_3_1 )
            {
             before(grammarAccess.getWindowAccess().getTitleAssignment_3_1()); 
            // InternalQuickUI.g:1232:2: ( rule__Window__TitleAssignment_3_1 )
            // InternalQuickUI.g:1232:3: rule__Window__TitleAssignment_3_1
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
    // InternalQuickUI.g:1241:1: rule__Window__Group_5__0 : rule__Window__Group_5__0__Impl rule__Window__Group_5__1 ;
    public final void rule__Window__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1245:1: ( rule__Window__Group_5__0__Impl rule__Window__Group_5__1 )
            // InternalQuickUI.g:1246:2: rule__Window__Group_5__0__Impl rule__Window__Group_5__1
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
    // InternalQuickUI.g:1253:1: rule__Window__Group_5__0__Impl : ( 'Menu' ) ;
    public final void rule__Window__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1257:1: ( ( 'Menu' ) )
            // InternalQuickUI.g:1258:1: ( 'Menu' )
            {
            // InternalQuickUI.g:1258:1: ( 'Menu' )
            // InternalQuickUI.g:1259:2: 'Menu'
            {
             before(grammarAccess.getWindowAccess().getMenuKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalQuickUI.g:1268:1: rule__Window__Group_5__1 : rule__Window__Group_5__1__Impl rule__Window__Group_5__2 ;
    public final void rule__Window__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1272:1: ( rule__Window__Group_5__1__Impl rule__Window__Group_5__2 )
            // InternalQuickUI.g:1273:2: rule__Window__Group_5__1__Impl rule__Window__Group_5__2
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
    // InternalQuickUI.g:1280:1: rule__Window__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Window__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1284:1: ( ( '{' ) )
            // InternalQuickUI.g:1285:1: ( '{' )
            {
            // InternalQuickUI.g:1285:1: ( '{' )
            // InternalQuickUI.g:1286:2: '{'
            {
             before(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalQuickUI.g:1295:1: rule__Window__Group_5__2 : rule__Window__Group_5__2__Impl rule__Window__Group_5__3 ;
    public final void rule__Window__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1299:1: ( rule__Window__Group_5__2__Impl rule__Window__Group_5__3 )
            // InternalQuickUI.g:1300:2: rule__Window__Group_5__2__Impl rule__Window__Group_5__3
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
    // InternalQuickUI.g:1307:1: rule__Window__Group_5__2__Impl : ( ( rule__Window__Menu_elementsAssignment_5_2 )* ) ;
    public final void rule__Window__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1311:1: ( ( ( rule__Window__Menu_elementsAssignment_5_2 )* ) )
            // InternalQuickUI.g:1312:1: ( ( rule__Window__Menu_elementsAssignment_5_2 )* )
            {
            // InternalQuickUI.g:1312:1: ( ( rule__Window__Menu_elementsAssignment_5_2 )* )
            // InternalQuickUI.g:1313:2: ( rule__Window__Menu_elementsAssignment_5_2 )*
            {
             before(grammarAccess.getWindowAccess().getMenu_elementsAssignment_5_2()); 
            // InternalQuickUI.g:1314:2: ( rule__Window__Menu_elementsAssignment_5_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQuickUI.g:1314:3: rule__Window__Menu_elementsAssignment_5_2
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
    // InternalQuickUI.g:1322:1: rule__Window__Group_5__3 : rule__Window__Group_5__3__Impl ;
    public final void rule__Window__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1326:1: ( rule__Window__Group_5__3__Impl )
            // InternalQuickUI.g:1327:2: rule__Window__Group_5__3__Impl
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
    // InternalQuickUI.g:1333:1: rule__Window__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Window__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1337:1: ( ( '}' ) )
            // InternalQuickUI.g:1338:1: ( '}' )
            {
            // InternalQuickUI.g:1338:1: ( '}' )
            // InternalQuickUI.g:1339:2: '}'
            {
             before(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalQuickUI.g:1349:1: rule__Window__Group_6__0 : rule__Window__Group_6__0__Impl rule__Window__Group_6__1 ;
    public final void rule__Window__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1353:1: ( rule__Window__Group_6__0__Impl rule__Window__Group_6__1 )
            // InternalQuickUI.g:1354:2: rule__Window__Group_6__0__Impl rule__Window__Group_6__1
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
    // InternalQuickUI.g:1361:1: rule__Window__Group_6__0__Impl : ( 'Content' ) ;
    public final void rule__Window__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1365:1: ( ( 'Content' ) )
            // InternalQuickUI.g:1366:1: ( 'Content' )
            {
            // InternalQuickUI.g:1366:1: ( 'Content' )
            // InternalQuickUI.g:1367:2: 'Content'
            {
             before(grammarAccess.getWindowAccess().getContentKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalQuickUI.g:1376:1: rule__Window__Group_6__1 : rule__Window__Group_6__1__Impl rule__Window__Group_6__2 ;
    public final void rule__Window__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1380:1: ( rule__Window__Group_6__1__Impl rule__Window__Group_6__2 )
            // InternalQuickUI.g:1381:2: rule__Window__Group_6__1__Impl rule__Window__Group_6__2
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
    // InternalQuickUI.g:1388:1: rule__Window__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Window__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1392:1: ( ( '{' ) )
            // InternalQuickUI.g:1393:1: ( '{' )
            {
            // InternalQuickUI.g:1393:1: ( '{' )
            // InternalQuickUI.g:1394:2: '{'
            {
             before(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalQuickUI.g:1403:1: rule__Window__Group_6__2 : rule__Window__Group_6__2__Impl rule__Window__Group_6__3 ;
    public final void rule__Window__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1407:1: ( rule__Window__Group_6__2__Impl rule__Window__Group_6__3 )
            // InternalQuickUI.g:1408:2: rule__Window__Group_6__2__Impl rule__Window__Group_6__3
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
    // InternalQuickUI.g:1415:1: rule__Window__Group_6__2__Impl : ( ( rule__Window__Content_elementsAssignment_6_2 )* ) ;
    public final void rule__Window__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1419:1: ( ( ( rule__Window__Content_elementsAssignment_6_2 )* ) )
            // InternalQuickUI.g:1420:1: ( ( rule__Window__Content_elementsAssignment_6_2 )* )
            {
            // InternalQuickUI.g:1420:1: ( ( rule__Window__Content_elementsAssignment_6_2 )* )
            // InternalQuickUI.g:1421:2: ( rule__Window__Content_elementsAssignment_6_2 )*
            {
             before(grammarAccess.getWindowAccess().getContent_elementsAssignment_6_2()); 
            // InternalQuickUI.g:1422:2: ( rule__Window__Content_elementsAssignment_6_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQuickUI.g:1422:3: rule__Window__Content_elementsAssignment_6_2
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
    // InternalQuickUI.g:1430:1: rule__Window__Group_6__3 : rule__Window__Group_6__3__Impl ;
    public final void rule__Window__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1434:1: ( rule__Window__Group_6__3__Impl )
            // InternalQuickUI.g:1435:2: rule__Window__Group_6__3__Impl
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
    // InternalQuickUI.g:1441:1: rule__Window__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Window__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1445:1: ( ( '}' ) )
            // InternalQuickUI.g:1446:1: ( '}' )
            {
            // InternalQuickUI.g:1446:1: ( '}' )
            // InternalQuickUI.g:1447:2: '}'
            {
             before(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalQuickUI.g:1457:1: rule__JavaElement__Group__0 : rule__JavaElement__Group__0__Impl rule__JavaElement__Group__1 ;
    public final void rule__JavaElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1461:1: ( rule__JavaElement__Group__0__Impl rule__JavaElement__Group__1 )
            // InternalQuickUI.g:1462:2: rule__JavaElement__Group__0__Impl rule__JavaElement__Group__1
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
    // InternalQuickUI.g:1469:1: rule__JavaElement__Group__0__Impl : ( ( rule__JavaElement__AliasAssignment_0 ) ) ;
    public final void rule__JavaElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1473:1: ( ( ( rule__JavaElement__AliasAssignment_0 ) ) )
            // InternalQuickUI.g:1474:1: ( ( rule__JavaElement__AliasAssignment_0 ) )
            {
            // InternalQuickUI.g:1474:1: ( ( rule__JavaElement__AliasAssignment_0 ) )
            // InternalQuickUI.g:1475:2: ( rule__JavaElement__AliasAssignment_0 )
            {
             before(grammarAccess.getJavaElementAccess().getAliasAssignment_0()); 
            // InternalQuickUI.g:1476:2: ( rule__JavaElement__AliasAssignment_0 )
            // InternalQuickUI.g:1476:3: rule__JavaElement__AliasAssignment_0
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
    // InternalQuickUI.g:1484:1: rule__JavaElement__Group__1 : rule__JavaElement__Group__1__Impl rule__JavaElement__Group__2 ;
    public final void rule__JavaElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1488:1: ( rule__JavaElement__Group__1__Impl rule__JavaElement__Group__2 )
            // InternalQuickUI.g:1489:2: rule__JavaElement__Group__1__Impl rule__JavaElement__Group__2
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
    // InternalQuickUI.g:1496:1: rule__JavaElement__Group__1__Impl : ( ( rule__JavaElement__Group_1__0 )? ) ;
    public final void rule__JavaElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1500:1: ( ( ( rule__JavaElement__Group_1__0 )? ) )
            // InternalQuickUI.g:1501:1: ( ( rule__JavaElement__Group_1__0 )? )
            {
            // InternalQuickUI.g:1501:1: ( ( rule__JavaElement__Group_1__0 )? )
            // InternalQuickUI.g:1502:2: ( rule__JavaElement__Group_1__0 )?
            {
             before(grammarAccess.getJavaElementAccess().getGroup_1()); 
            // InternalQuickUI.g:1503:2: ( rule__JavaElement__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQuickUI.g:1503:3: rule__JavaElement__Group_1__0
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
    // InternalQuickUI.g:1511:1: rule__JavaElement__Group__2 : rule__JavaElement__Group__2__Impl rule__JavaElement__Group__3 ;
    public final void rule__JavaElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1515:1: ( rule__JavaElement__Group__2__Impl rule__JavaElement__Group__3 )
            // InternalQuickUI.g:1516:2: rule__JavaElement__Group__2__Impl rule__JavaElement__Group__3
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
    // InternalQuickUI.g:1523:1: rule__JavaElement__Group__2__Impl : ( '{' ) ;
    public final void rule__JavaElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1527:1: ( ( '{' ) )
            // InternalQuickUI.g:1528:1: ( '{' )
            {
            // InternalQuickUI.g:1528:1: ( '{' )
            // InternalQuickUI.g:1529:2: '{'
            {
             before(grammarAccess.getJavaElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalQuickUI.g:1538:1: rule__JavaElement__Group__3 : rule__JavaElement__Group__3__Impl rule__JavaElement__Group__4 ;
    public final void rule__JavaElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1542:1: ( rule__JavaElement__Group__3__Impl rule__JavaElement__Group__4 )
            // InternalQuickUI.g:1543:2: rule__JavaElement__Group__3__Impl rule__JavaElement__Group__4
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
    // InternalQuickUI.g:1550:1: rule__JavaElement__Group__3__Impl : ( ( rule__JavaElement__SubelementAssignment_3 )* ) ;
    public final void rule__JavaElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1554:1: ( ( ( rule__JavaElement__SubelementAssignment_3 )* ) )
            // InternalQuickUI.g:1555:1: ( ( rule__JavaElement__SubelementAssignment_3 )* )
            {
            // InternalQuickUI.g:1555:1: ( ( rule__JavaElement__SubelementAssignment_3 )* )
            // InternalQuickUI.g:1556:2: ( rule__JavaElement__SubelementAssignment_3 )*
            {
             before(grammarAccess.getJavaElementAccess().getSubelementAssignment_3()); 
            // InternalQuickUI.g:1557:2: ( rule__JavaElement__SubelementAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=19 && LA16_0<=21)||(LA16_0>=28 && LA16_0<=29)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalQuickUI.g:1557:3: rule__JavaElement__SubelementAssignment_3
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
    // InternalQuickUI.g:1565:1: rule__JavaElement__Group__4 : rule__JavaElement__Group__4__Impl ;
    public final void rule__JavaElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1569:1: ( rule__JavaElement__Group__4__Impl )
            // InternalQuickUI.g:1570:2: rule__JavaElement__Group__4__Impl
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
    // InternalQuickUI.g:1576:1: rule__JavaElement__Group__4__Impl : ( '}' ) ;
    public final void rule__JavaElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1580:1: ( ( '}' ) )
            // InternalQuickUI.g:1581:1: ( '}' )
            {
            // InternalQuickUI.g:1581:1: ( '}' )
            // InternalQuickUI.g:1582:2: '}'
            {
             before(grammarAccess.getJavaElementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalQuickUI.g:1592:1: rule__JavaElement__Group_1__0 : rule__JavaElement__Group_1__0__Impl rule__JavaElement__Group_1__1 ;
    public final void rule__JavaElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1596:1: ( rule__JavaElement__Group_1__0__Impl rule__JavaElement__Group_1__1 )
            // InternalQuickUI.g:1597:2: rule__JavaElement__Group_1__0__Impl rule__JavaElement__Group_1__1
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
    // InternalQuickUI.g:1604:1: rule__JavaElement__Group_1__0__Impl : ( ':' ) ;
    public final void rule__JavaElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1608:1: ( ( ':' ) )
            // InternalQuickUI.g:1609:1: ( ':' )
            {
            // InternalQuickUI.g:1609:1: ( ':' )
            // InternalQuickUI.g:1610:2: ':'
            {
             before(grammarAccess.getJavaElementAccess().getColonKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalQuickUI.g:1619:1: rule__JavaElement__Group_1__1 : rule__JavaElement__Group_1__1__Impl ;
    public final void rule__JavaElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1623:1: ( rule__JavaElement__Group_1__1__Impl )
            // InternalQuickUI.g:1624:2: rule__JavaElement__Group_1__1__Impl
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
    // InternalQuickUI.g:1630:1: rule__JavaElement__Group_1__1__Impl : ( ( rule__JavaElement__NameAssignment_1_1 ) ) ;
    public final void rule__JavaElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1634:1: ( ( ( rule__JavaElement__NameAssignment_1_1 ) ) )
            // InternalQuickUI.g:1635:1: ( ( rule__JavaElement__NameAssignment_1_1 ) )
            {
            // InternalQuickUI.g:1635:1: ( ( rule__JavaElement__NameAssignment_1_1 ) )
            // InternalQuickUI.g:1636:2: ( rule__JavaElement__NameAssignment_1_1 )
            {
             before(grammarAccess.getJavaElementAccess().getNameAssignment_1_1()); 
            // InternalQuickUI.g:1637:2: ( rule__JavaElement__NameAssignment_1_1 )
            // InternalQuickUI.g:1637:3: rule__JavaElement__NameAssignment_1_1
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
    // InternalQuickUI.g:1646:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1650:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalQuickUI.g:1651:2: rule__Row__Group__0__Impl rule__Row__Group__1
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
    // InternalQuickUI.g:1658:1: rule__Row__Group__0__Impl : ( 'Row' ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1662:1: ( ( 'Row' ) )
            // InternalQuickUI.g:1663:1: ( 'Row' )
            {
            // InternalQuickUI.g:1663:1: ( 'Row' )
            // InternalQuickUI.g:1664:2: 'Row'
            {
             before(grammarAccess.getRowAccess().getRowKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalQuickUI.g:1673:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1677:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalQuickUI.g:1678:2: rule__Row__Group__1__Impl rule__Row__Group__2
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
    // InternalQuickUI.g:1685:1: rule__Row__Group__1__Impl : ( ( rule__Row__Group_1__0 )? ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1689:1: ( ( ( rule__Row__Group_1__0 )? ) )
            // InternalQuickUI.g:1690:1: ( ( rule__Row__Group_1__0 )? )
            {
            // InternalQuickUI.g:1690:1: ( ( rule__Row__Group_1__0 )? )
            // InternalQuickUI.g:1691:2: ( rule__Row__Group_1__0 )?
            {
             before(grammarAccess.getRowAccess().getGroup_1()); 
            // InternalQuickUI.g:1692:2: ( rule__Row__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQuickUI.g:1692:3: rule__Row__Group_1__0
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
    // InternalQuickUI.g:1700:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1704:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // InternalQuickUI.g:1705:2: rule__Row__Group__2__Impl rule__Row__Group__3
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
    // InternalQuickUI.g:1712:1: rule__Row__Group__2__Impl : ( '{' ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1716:1: ( ( '{' ) )
            // InternalQuickUI.g:1717:1: ( '{' )
            {
            // InternalQuickUI.g:1717:1: ( '{' )
            // InternalQuickUI.g:1718:2: '{'
            {
             before(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalQuickUI.g:1727:1: rule__Row__Group__3 : rule__Row__Group__3__Impl rule__Row__Group__4 ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1731:1: ( rule__Row__Group__3__Impl rule__Row__Group__4 )
            // InternalQuickUI.g:1732:2: rule__Row__Group__3__Impl rule__Row__Group__4
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
    // InternalQuickUI.g:1739:1: rule__Row__Group__3__Impl : ( ( ( rule__Row__SubelementAssignment_3 ) ) ( ( rule__Row__SubelementAssignment_3 )* ) ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1743:1: ( ( ( ( rule__Row__SubelementAssignment_3 ) ) ( ( rule__Row__SubelementAssignment_3 )* ) ) )
            // InternalQuickUI.g:1744:1: ( ( ( rule__Row__SubelementAssignment_3 ) ) ( ( rule__Row__SubelementAssignment_3 )* ) )
            {
            // InternalQuickUI.g:1744:1: ( ( ( rule__Row__SubelementAssignment_3 ) ) ( ( rule__Row__SubelementAssignment_3 )* ) )
            // InternalQuickUI.g:1745:2: ( ( rule__Row__SubelementAssignment_3 ) ) ( ( rule__Row__SubelementAssignment_3 )* )
            {
            // InternalQuickUI.g:1745:2: ( ( rule__Row__SubelementAssignment_3 ) )
            // InternalQuickUI.g:1746:3: ( rule__Row__SubelementAssignment_3 )
            {
             before(grammarAccess.getRowAccess().getSubelementAssignment_3()); 
            // InternalQuickUI.g:1747:3: ( rule__Row__SubelementAssignment_3 )
            // InternalQuickUI.g:1747:4: rule__Row__SubelementAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__Row__SubelementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getSubelementAssignment_3()); 

            }

            // InternalQuickUI.g:1750:2: ( ( rule__Row__SubelementAssignment_3 )* )
            // InternalQuickUI.g:1751:3: ( rule__Row__SubelementAssignment_3 )*
            {
             before(grammarAccess.getRowAccess().getSubelementAssignment_3()); 
            // InternalQuickUI.g:1752:3: ( rule__Row__SubelementAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=19 && LA18_0<=21)||(LA18_0>=28 && LA18_0<=29)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQuickUI.g:1752:4: rule__Row__SubelementAssignment_3
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
    // InternalQuickUI.g:1761:1: rule__Row__Group__4 : rule__Row__Group__4__Impl ;
    public final void rule__Row__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1765:1: ( rule__Row__Group__4__Impl )
            // InternalQuickUI.g:1766:2: rule__Row__Group__4__Impl
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
    // InternalQuickUI.g:1772:1: rule__Row__Group__4__Impl : ( '}' ) ;
    public final void rule__Row__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1776:1: ( ( '}' ) )
            // InternalQuickUI.g:1777:1: ( '}' )
            {
            // InternalQuickUI.g:1777:1: ( '}' )
            // InternalQuickUI.g:1778:2: '}'
            {
             before(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalQuickUI.g:1788:1: rule__Row__Group_1__0 : rule__Row__Group_1__0__Impl rule__Row__Group_1__1 ;
    public final void rule__Row__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1792:1: ( rule__Row__Group_1__0__Impl rule__Row__Group_1__1 )
            // InternalQuickUI.g:1793:2: rule__Row__Group_1__0__Impl rule__Row__Group_1__1
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
    // InternalQuickUI.g:1800:1: rule__Row__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Row__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1804:1: ( ( ':' ) )
            // InternalQuickUI.g:1805:1: ( ':' )
            {
            // InternalQuickUI.g:1805:1: ( ':' )
            // InternalQuickUI.g:1806:2: ':'
            {
             before(grammarAccess.getRowAccess().getColonKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalQuickUI.g:1815:1: rule__Row__Group_1__1 : rule__Row__Group_1__1__Impl ;
    public final void rule__Row__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1819:1: ( rule__Row__Group_1__1__Impl )
            // InternalQuickUI.g:1820:2: rule__Row__Group_1__1__Impl
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
    // InternalQuickUI.g:1826:1: rule__Row__Group_1__1__Impl : ( ( rule__Row__NameAssignment_1_1 ) ) ;
    public final void rule__Row__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1830:1: ( ( ( rule__Row__NameAssignment_1_1 ) ) )
            // InternalQuickUI.g:1831:1: ( ( rule__Row__NameAssignment_1_1 ) )
            {
            // InternalQuickUI.g:1831:1: ( ( rule__Row__NameAssignment_1_1 ) )
            // InternalQuickUI.g:1832:2: ( rule__Row__NameAssignment_1_1 )
            {
             before(grammarAccess.getRowAccess().getNameAssignment_1_1()); 
            // InternalQuickUI.g:1833:2: ( rule__Row__NameAssignment_1_1 )
            // InternalQuickUI.g:1833:3: rule__Row__NameAssignment_1_1
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


    // $ANTLR start "rule__Label__Group__0"
    // InternalQuickUI.g:1842:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1846:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalQuickUI.g:1847:2: rule__Label__Group__0__Impl rule__Label__Group__1
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
    // InternalQuickUI.g:1854:1: rule__Label__Group__0__Impl : ( 'Label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1858:1: ( ( 'Label' ) )
            // InternalQuickUI.g:1859:1: ( 'Label' )
            {
            // InternalQuickUI.g:1859:1: ( 'Label' )
            // InternalQuickUI.g:1860:2: 'Label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalQuickUI.g:1869:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1873:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalQuickUI.g:1874:2: rule__Label__Group__1__Impl rule__Label__Group__2
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
    // InternalQuickUI.g:1881:1: rule__Label__Group__1__Impl : ( ':' ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1885:1: ( ( ':' ) )
            // InternalQuickUI.g:1886:1: ( ':' )
            {
            // InternalQuickUI.g:1886:1: ( ':' )
            // InternalQuickUI.g:1887:2: ':'
            {
             before(grammarAccess.getLabelAccess().getColonKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalQuickUI.g:1896:1: rule__Label__Group__2 : rule__Label__Group__2__Impl ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1900:1: ( rule__Label__Group__2__Impl )
            // InternalQuickUI.g:1901:2: rule__Label__Group__2__Impl
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
    // InternalQuickUI.g:1907:1: rule__Label__Group__2__Impl : ( ( rule__Label__ValueAssignment_2 ) ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1911:1: ( ( ( rule__Label__ValueAssignment_2 ) ) )
            // InternalQuickUI.g:1912:1: ( ( rule__Label__ValueAssignment_2 ) )
            {
            // InternalQuickUI.g:1912:1: ( ( rule__Label__ValueAssignment_2 ) )
            // InternalQuickUI.g:1913:2: ( rule__Label__ValueAssignment_2 )
            {
             before(grammarAccess.getLabelAccess().getValueAssignment_2()); 
            // InternalQuickUI.g:1914:2: ( rule__Label__ValueAssignment_2 )
            // InternalQuickUI.g:1914:3: rule__Label__ValueAssignment_2
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
    // InternalQuickUI.g:1923:1: rule__Enabled__Group__0 : rule__Enabled__Group__0__Impl rule__Enabled__Group__1 ;
    public final void rule__Enabled__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1927:1: ( rule__Enabled__Group__0__Impl rule__Enabled__Group__1 )
            // InternalQuickUI.g:1928:2: rule__Enabled__Group__0__Impl rule__Enabled__Group__1
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
    // InternalQuickUI.g:1935:1: rule__Enabled__Group__0__Impl : ( 'Enabled' ) ;
    public final void rule__Enabled__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1939:1: ( ( 'Enabled' ) )
            // InternalQuickUI.g:1940:1: ( 'Enabled' )
            {
            // InternalQuickUI.g:1940:1: ( 'Enabled' )
            // InternalQuickUI.g:1941:2: 'Enabled'
            {
             before(grammarAccess.getEnabledAccess().getEnabledKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalQuickUI.g:1950:1: rule__Enabled__Group__1 : rule__Enabled__Group__1__Impl rule__Enabled__Group__2 ;
    public final void rule__Enabled__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1954:1: ( rule__Enabled__Group__1__Impl rule__Enabled__Group__2 )
            // InternalQuickUI.g:1955:2: rule__Enabled__Group__1__Impl rule__Enabled__Group__2
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
    // InternalQuickUI.g:1962:1: rule__Enabled__Group__1__Impl : ( ':' ) ;
    public final void rule__Enabled__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1966:1: ( ( ':' ) )
            // InternalQuickUI.g:1967:1: ( ':' )
            {
            // InternalQuickUI.g:1967:1: ( ':' )
            // InternalQuickUI.g:1968:2: ':'
            {
             before(grammarAccess.getEnabledAccess().getColonKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalQuickUI.g:1977:1: rule__Enabled__Group__2 : rule__Enabled__Group__2__Impl ;
    public final void rule__Enabled__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1981:1: ( rule__Enabled__Group__2__Impl )
            // InternalQuickUI.g:1982:2: rule__Enabled__Group__2__Impl
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
    // InternalQuickUI.g:1988:1: rule__Enabled__Group__2__Impl : ( ( rule__Enabled__ConditionAssignment_2 ) ) ;
    public final void rule__Enabled__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:1992:1: ( ( ( rule__Enabled__ConditionAssignment_2 ) ) )
            // InternalQuickUI.g:1993:1: ( ( rule__Enabled__ConditionAssignment_2 ) )
            {
            // InternalQuickUI.g:1993:1: ( ( rule__Enabled__ConditionAssignment_2 ) )
            // InternalQuickUI.g:1994:2: ( rule__Enabled__ConditionAssignment_2 )
            {
             before(grammarAccess.getEnabledAccess().getConditionAssignment_2()); 
            // InternalQuickUI.g:1995:2: ( rule__Enabled__ConditionAssignment_2 )
            // InternalQuickUI.g:1995:3: rule__Enabled__ConditionAssignment_2
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


    // $ANTLR start "rule__ConditionBranch__Group__0"
    // InternalQuickUI.g:2004:1: rule__ConditionBranch__Group__0 : rule__ConditionBranch__Group__0__Impl rule__ConditionBranch__Group__1 ;
    public final void rule__ConditionBranch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2008:1: ( rule__ConditionBranch__Group__0__Impl rule__ConditionBranch__Group__1 )
            // InternalQuickUI.g:2009:2: rule__ConditionBranch__Group__0__Impl rule__ConditionBranch__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ConditionBranch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionBranch__Group__1();

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
    // $ANTLR end "rule__ConditionBranch__Group__0"


    // $ANTLR start "rule__ConditionBranch__Group__0__Impl"
    // InternalQuickUI.g:2016:1: rule__ConditionBranch__Group__0__Impl : ( ruleConditionConcatenation ) ;
    public final void rule__ConditionBranch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2020:1: ( ( ruleConditionConcatenation ) )
            // InternalQuickUI.g:2021:1: ( ruleConditionConcatenation )
            {
            // InternalQuickUI.g:2021:1: ( ruleConditionConcatenation )
            // InternalQuickUI.g:2022:2: ruleConditionConcatenation
            {
             before(grammarAccess.getConditionBranchAccess().getConditionConcatenationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionConcatenation();

            state._fsp--;

             after(grammarAccess.getConditionBranchAccess().getConditionConcatenationParserRuleCall_0()); 

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
    // $ANTLR end "rule__ConditionBranch__Group__0__Impl"


    // $ANTLR start "rule__ConditionBranch__Group__1"
    // InternalQuickUI.g:2031:1: rule__ConditionBranch__Group__1 : rule__ConditionBranch__Group__1__Impl ;
    public final void rule__ConditionBranch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2035:1: ( rule__ConditionBranch__Group__1__Impl )
            // InternalQuickUI.g:2036:2: rule__ConditionBranch__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBranch__Group__1__Impl();

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
    // $ANTLR end "rule__ConditionBranch__Group__1"


    // $ANTLR start "rule__ConditionBranch__Group__1__Impl"
    // InternalQuickUI.g:2042:1: rule__ConditionBranch__Group__1__Impl : ( ( rule__ConditionBranch__Group_1__0 )* ) ;
    public final void rule__ConditionBranch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2046:1: ( ( ( rule__ConditionBranch__Group_1__0 )* ) )
            // InternalQuickUI.g:2047:1: ( ( rule__ConditionBranch__Group_1__0 )* )
            {
            // InternalQuickUI.g:2047:1: ( ( rule__ConditionBranch__Group_1__0 )* )
            // InternalQuickUI.g:2048:2: ( rule__ConditionBranch__Group_1__0 )*
            {
             before(grammarAccess.getConditionBranchAccess().getGroup_1()); 
            // InternalQuickUI.g:2049:2: ( rule__ConditionBranch__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQuickUI.g:2049:3: rule__ConditionBranch__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ConditionBranch__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getConditionBranchAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ConditionBranch__Group__1__Impl"


    // $ANTLR start "rule__ConditionBranch__Group_1__0"
    // InternalQuickUI.g:2058:1: rule__ConditionBranch__Group_1__0 : rule__ConditionBranch__Group_1__0__Impl rule__ConditionBranch__Group_1__1 ;
    public final void rule__ConditionBranch__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2062:1: ( rule__ConditionBranch__Group_1__0__Impl rule__ConditionBranch__Group_1__1 )
            // InternalQuickUI.g:2063:2: rule__ConditionBranch__Group_1__0__Impl rule__ConditionBranch__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__ConditionBranch__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionBranch__Group_1__1();

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
    // $ANTLR end "rule__ConditionBranch__Group_1__0"


    // $ANTLR start "rule__ConditionBranch__Group_1__0__Impl"
    // InternalQuickUI.g:2070:1: rule__ConditionBranch__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionBranch__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2074:1: ( ( () ) )
            // InternalQuickUI.g:2075:1: ( () )
            {
            // InternalQuickUI.g:2075:1: ( () )
            // InternalQuickUI.g:2076:2: ()
            {
             before(grammarAccess.getConditionBranchAccess().getConditionBranchLeftAction_1_0()); 
            // InternalQuickUI.g:2077:2: ()
            // InternalQuickUI.g:2077:3: 
            {
            }

             after(grammarAccess.getConditionBranchAccess().getConditionBranchLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBranch__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionBranch__Group_1__1"
    // InternalQuickUI.g:2085:1: rule__ConditionBranch__Group_1__1 : rule__ConditionBranch__Group_1__1__Impl rule__ConditionBranch__Group_1__2 ;
    public final void rule__ConditionBranch__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2089:1: ( rule__ConditionBranch__Group_1__1__Impl rule__ConditionBranch__Group_1__2 )
            // InternalQuickUI.g:2090:2: rule__ConditionBranch__Group_1__1__Impl rule__ConditionBranch__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__ConditionBranch__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionBranch__Group_1__2();

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
    // $ANTLR end "rule__ConditionBranch__Group_1__1"


    // $ANTLR start "rule__ConditionBranch__Group_1__1__Impl"
    // InternalQuickUI.g:2097:1: rule__ConditionBranch__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__ConditionBranch__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2101:1: ( ( 'or' ) )
            // InternalQuickUI.g:2102:1: ( 'or' )
            {
            // InternalQuickUI.g:2102:1: ( 'or' )
            // InternalQuickUI.g:2103:2: 'or'
            {
             before(grammarAccess.getConditionBranchAccess().getOrKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConditionBranchAccess().getOrKeyword_1_1()); 

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
    // $ANTLR end "rule__ConditionBranch__Group_1__1__Impl"


    // $ANTLR start "rule__ConditionBranch__Group_1__2"
    // InternalQuickUI.g:2112:1: rule__ConditionBranch__Group_1__2 : rule__ConditionBranch__Group_1__2__Impl ;
    public final void rule__ConditionBranch__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2116:1: ( rule__ConditionBranch__Group_1__2__Impl )
            // InternalQuickUI.g:2117:2: rule__ConditionBranch__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBranch__Group_1__2__Impl();

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
    // $ANTLR end "rule__ConditionBranch__Group_1__2"


    // $ANTLR start "rule__ConditionBranch__Group_1__2__Impl"
    // InternalQuickUI.g:2123:1: rule__ConditionBranch__Group_1__2__Impl : ( ( rule__ConditionBranch__RightAssignment_1_2 ) ) ;
    public final void rule__ConditionBranch__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2127:1: ( ( ( rule__ConditionBranch__RightAssignment_1_2 ) ) )
            // InternalQuickUI.g:2128:1: ( ( rule__ConditionBranch__RightAssignment_1_2 ) )
            {
            // InternalQuickUI.g:2128:1: ( ( rule__ConditionBranch__RightAssignment_1_2 ) )
            // InternalQuickUI.g:2129:2: ( rule__ConditionBranch__RightAssignment_1_2 )
            {
             before(grammarAccess.getConditionBranchAccess().getRightAssignment_1_2()); 
            // InternalQuickUI.g:2130:2: ( rule__ConditionBranch__RightAssignment_1_2 )
            // InternalQuickUI.g:2130:3: rule__ConditionBranch__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBranch__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionBranchAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ConditionBranch__Group_1__2__Impl"


    // $ANTLR start "rule__ConditionConcatenation__Group__0"
    // InternalQuickUI.g:2139:1: rule__ConditionConcatenation__Group__0 : rule__ConditionConcatenation__Group__0__Impl rule__ConditionConcatenation__Group__1 ;
    public final void rule__ConditionConcatenation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2143:1: ( rule__ConditionConcatenation__Group__0__Impl rule__ConditionConcatenation__Group__1 )
            // InternalQuickUI.g:2144:2: rule__ConditionConcatenation__Group__0__Impl rule__ConditionConcatenation__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ConditionConcatenation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionConcatenation__Group__1();

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
    // $ANTLR end "rule__ConditionConcatenation__Group__0"


    // $ANTLR start "rule__ConditionConcatenation__Group__0__Impl"
    // InternalQuickUI.g:2151:1: rule__ConditionConcatenation__Group__0__Impl : ( ruleCondition ) ;
    public final void rule__ConditionConcatenation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2155:1: ( ( ruleCondition ) )
            // InternalQuickUI.g:2156:1: ( ruleCondition )
            {
            // InternalQuickUI.g:2156:1: ( ruleCondition )
            // InternalQuickUI.g:2157:2: ruleCondition
            {
             before(grammarAccess.getConditionConcatenationAccess().getConditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionConcatenationAccess().getConditionParserRuleCall_0()); 

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
    // $ANTLR end "rule__ConditionConcatenation__Group__0__Impl"


    // $ANTLR start "rule__ConditionConcatenation__Group__1"
    // InternalQuickUI.g:2166:1: rule__ConditionConcatenation__Group__1 : rule__ConditionConcatenation__Group__1__Impl ;
    public final void rule__ConditionConcatenation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2170:1: ( rule__ConditionConcatenation__Group__1__Impl )
            // InternalQuickUI.g:2171:2: rule__ConditionConcatenation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionConcatenation__Group__1__Impl();

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
    // $ANTLR end "rule__ConditionConcatenation__Group__1"


    // $ANTLR start "rule__ConditionConcatenation__Group__1__Impl"
    // InternalQuickUI.g:2177:1: rule__ConditionConcatenation__Group__1__Impl : ( ( rule__ConditionConcatenation__Group_1__0 )* ) ;
    public final void rule__ConditionConcatenation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2181:1: ( ( ( rule__ConditionConcatenation__Group_1__0 )* ) )
            // InternalQuickUI.g:2182:1: ( ( rule__ConditionConcatenation__Group_1__0 )* )
            {
            // InternalQuickUI.g:2182:1: ( ( rule__ConditionConcatenation__Group_1__0 )* )
            // InternalQuickUI.g:2183:2: ( rule__ConditionConcatenation__Group_1__0 )*
            {
             before(grammarAccess.getConditionConcatenationAccess().getGroup_1()); 
            // InternalQuickUI.g:2184:2: ( rule__ConditionConcatenation__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQuickUI.g:2184:3: rule__ConditionConcatenation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ConditionConcatenation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getConditionConcatenationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ConditionConcatenation__Group__1__Impl"


    // $ANTLR start "rule__ConditionConcatenation__Group_1__0"
    // InternalQuickUI.g:2193:1: rule__ConditionConcatenation__Group_1__0 : rule__ConditionConcatenation__Group_1__0__Impl rule__ConditionConcatenation__Group_1__1 ;
    public final void rule__ConditionConcatenation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2197:1: ( rule__ConditionConcatenation__Group_1__0__Impl rule__ConditionConcatenation__Group_1__1 )
            // InternalQuickUI.g:2198:2: rule__ConditionConcatenation__Group_1__0__Impl rule__ConditionConcatenation__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__ConditionConcatenation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionConcatenation__Group_1__1();

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
    // $ANTLR end "rule__ConditionConcatenation__Group_1__0"


    // $ANTLR start "rule__ConditionConcatenation__Group_1__0__Impl"
    // InternalQuickUI.g:2205:1: rule__ConditionConcatenation__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionConcatenation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2209:1: ( ( () ) )
            // InternalQuickUI.g:2210:1: ( () )
            {
            // InternalQuickUI.g:2210:1: ( () )
            // InternalQuickUI.g:2211:2: ()
            {
             before(grammarAccess.getConditionConcatenationAccess().getConditionConcatenationLeftAction_1_0()); 
            // InternalQuickUI.g:2212:2: ()
            // InternalQuickUI.g:2212:3: 
            {
            }

             after(grammarAccess.getConditionConcatenationAccess().getConditionConcatenationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionConcatenation__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionConcatenation__Group_1__1"
    // InternalQuickUI.g:2220:1: rule__ConditionConcatenation__Group_1__1 : rule__ConditionConcatenation__Group_1__1__Impl rule__ConditionConcatenation__Group_1__2 ;
    public final void rule__ConditionConcatenation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2224:1: ( rule__ConditionConcatenation__Group_1__1__Impl rule__ConditionConcatenation__Group_1__2 )
            // InternalQuickUI.g:2225:2: rule__ConditionConcatenation__Group_1__1__Impl rule__ConditionConcatenation__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__ConditionConcatenation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionConcatenation__Group_1__2();

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
    // $ANTLR end "rule__ConditionConcatenation__Group_1__1"


    // $ANTLR start "rule__ConditionConcatenation__Group_1__1__Impl"
    // InternalQuickUI.g:2232:1: rule__ConditionConcatenation__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__ConditionConcatenation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2236:1: ( ( 'and' ) )
            // InternalQuickUI.g:2237:1: ( 'and' )
            {
            // InternalQuickUI.g:2237:1: ( 'and' )
            // InternalQuickUI.g:2238:2: 'and'
            {
             before(grammarAccess.getConditionConcatenationAccess().getAndKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConditionConcatenationAccess().getAndKeyword_1_1()); 

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
    // $ANTLR end "rule__ConditionConcatenation__Group_1__1__Impl"


    // $ANTLR start "rule__ConditionConcatenation__Group_1__2"
    // InternalQuickUI.g:2247:1: rule__ConditionConcatenation__Group_1__2 : rule__ConditionConcatenation__Group_1__2__Impl ;
    public final void rule__ConditionConcatenation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2251:1: ( rule__ConditionConcatenation__Group_1__2__Impl )
            // InternalQuickUI.g:2252:2: rule__ConditionConcatenation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionConcatenation__Group_1__2__Impl();

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
    // $ANTLR end "rule__ConditionConcatenation__Group_1__2"


    // $ANTLR start "rule__ConditionConcatenation__Group_1__2__Impl"
    // InternalQuickUI.g:2258:1: rule__ConditionConcatenation__Group_1__2__Impl : ( ( rule__ConditionConcatenation__RightAssignment_1_2 ) ) ;
    public final void rule__ConditionConcatenation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2262:1: ( ( ( rule__ConditionConcatenation__RightAssignment_1_2 ) ) )
            // InternalQuickUI.g:2263:1: ( ( rule__ConditionConcatenation__RightAssignment_1_2 ) )
            {
            // InternalQuickUI.g:2263:1: ( ( rule__ConditionConcatenation__RightAssignment_1_2 ) )
            // InternalQuickUI.g:2264:2: ( rule__ConditionConcatenation__RightAssignment_1_2 )
            {
             before(grammarAccess.getConditionConcatenationAccess().getRightAssignment_1_2()); 
            // InternalQuickUI.g:2265:2: ( rule__ConditionConcatenation__RightAssignment_1_2 )
            // InternalQuickUI.g:2265:3: rule__ConditionConcatenation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionConcatenation__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionConcatenationAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ConditionConcatenation__Group_1__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalQuickUI.g:2274:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2278:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalQuickUI.g:2279:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalQuickUI.g:2286:1: rule__Condition__Group__0__Impl : ( ( 'if' )? ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2290:1: ( ( ( 'if' )? ) )
            // InternalQuickUI.g:2291:1: ( ( 'if' )? )
            {
            // InternalQuickUI.g:2291:1: ( ( 'if' )? )
            // InternalQuickUI.g:2292:2: ( 'if' )?
            {
             before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
            // InternalQuickUI.g:2293:2: ( 'if' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQuickUI.g:2293:3: 'if'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalQuickUI.g:2301:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2305:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalQuickUI.g:2306:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalQuickUI.g:2313:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ElementAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2317:1: ( ( ( rule__Condition__ElementAssignment_1 ) ) )
            // InternalQuickUI.g:2318:1: ( ( rule__Condition__ElementAssignment_1 ) )
            {
            // InternalQuickUI.g:2318:1: ( ( rule__Condition__ElementAssignment_1 ) )
            // InternalQuickUI.g:2319:2: ( rule__Condition__ElementAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getElementAssignment_1()); 
            // InternalQuickUI.g:2320:2: ( rule__Condition__ElementAssignment_1 )
            // InternalQuickUI.g:2320:3: rule__Condition__ElementAssignment_1
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
    // InternalQuickUI.g:2328:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2332:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalQuickUI.g:2333:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalQuickUI.g:2340:1: rule__Condition__Group__2__Impl : ( ( 'is' )? ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2344:1: ( ( ( 'is' )? ) )
            // InternalQuickUI.g:2345:1: ( ( 'is' )? )
            {
            // InternalQuickUI.g:2345:1: ( ( 'is' )? )
            // InternalQuickUI.g:2346:2: ( 'is' )?
            {
             before(grammarAccess.getConditionAccess().getIsKeyword_2()); 
            // InternalQuickUI.g:2347:2: ( 'is' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQuickUI.g:2347:3: 'is'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalQuickUI.g:2355:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2359:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalQuickUI.g:2360:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalQuickUI.g:2367:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__NegationAssignment_3 )? ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2371:1: ( ( ( rule__Condition__NegationAssignment_3 )? ) )
            // InternalQuickUI.g:2372:1: ( ( rule__Condition__NegationAssignment_3 )? )
            {
            // InternalQuickUI.g:2372:1: ( ( rule__Condition__NegationAssignment_3 )? )
            // InternalQuickUI.g:2373:2: ( rule__Condition__NegationAssignment_3 )?
            {
             before(grammarAccess.getConditionAccess().getNegationAssignment_3()); 
            // InternalQuickUI.g:2374:2: ( rule__Condition__NegationAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQuickUI.g:2374:3: rule__Condition__NegationAssignment_3
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
    // InternalQuickUI.g:2382:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2386:1: ( rule__Condition__Group__4__Impl )
            // InternalQuickUI.g:2387:2: rule__Condition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__4__Impl();

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
    // InternalQuickUI.g:2393:1: rule__Condition__Group__4__Impl : ( ( rule__Condition__ConditionAssignment_4 ) ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2397:1: ( ( ( rule__Condition__ConditionAssignment_4 ) ) )
            // InternalQuickUI.g:2398:1: ( ( rule__Condition__ConditionAssignment_4 ) )
            {
            // InternalQuickUI.g:2398:1: ( ( rule__Condition__ConditionAssignment_4 ) )
            // InternalQuickUI.g:2399:2: ( rule__Condition__ConditionAssignment_4 )
            {
             before(grammarAccess.getConditionAccess().getConditionAssignment_4()); 
            // InternalQuickUI.g:2400:2: ( rule__Condition__ConditionAssignment_4 )
            // InternalQuickUI.g:2400:3: rule__Condition__ConditionAssignment_4
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


    // $ANTLR start "rule__ConditionType__Group_0__0"
    // InternalQuickUI.g:2409:1: rule__ConditionType__Group_0__0 : rule__ConditionType__Group_0__0__Impl rule__ConditionType__Group_0__1 ;
    public final void rule__ConditionType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2413:1: ( rule__ConditionType__Group_0__0__Impl rule__ConditionType__Group_0__1 )
            // InternalQuickUI.g:2414:2: rule__ConditionType__Group_0__0__Impl rule__ConditionType__Group_0__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalQuickUI.g:2421:1: rule__ConditionType__Group_0__0__Impl : ( () ) ;
    public final void rule__ConditionType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2425:1: ( ( () ) )
            // InternalQuickUI.g:2426:1: ( () )
            {
            // InternalQuickUI.g:2426:1: ( () )
            // InternalQuickUI.g:2427:2: ()
            {
             before(grammarAccess.getConditionTypeAccess().getEmptyAction_0_0()); 
            // InternalQuickUI.g:2428:2: ()
            // InternalQuickUI.g:2428:3: 
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
    // InternalQuickUI.g:2436:1: rule__ConditionType__Group_0__1 : rule__ConditionType__Group_0__1__Impl ;
    public final void rule__ConditionType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2440:1: ( rule__ConditionType__Group_0__1__Impl )
            // InternalQuickUI.g:2441:2: rule__ConditionType__Group_0__1__Impl
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
    // InternalQuickUI.g:2447:1: rule__ConditionType__Group_0__1__Impl : ( 'empty' ) ;
    public final void rule__ConditionType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2451:1: ( ( 'empty' ) )
            // InternalQuickUI.g:2452:1: ( 'empty' )
            {
            // InternalQuickUI.g:2452:1: ( 'empty' )
            // InternalQuickUI.g:2453:2: 'empty'
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
    // InternalQuickUI.g:2463:1: rule__ConditionType__Group_1__0 : rule__ConditionType__Group_1__0__Impl rule__ConditionType__Group_1__1 ;
    public final void rule__ConditionType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2467:1: ( rule__ConditionType__Group_1__0__Impl rule__ConditionType__Group_1__1 )
            // InternalQuickUI.g:2468:2: rule__ConditionType__Group_1__0__Impl rule__ConditionType__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalQuickUI.g:2475:1: rule__ConditionType__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2479:1: ( ( () ) )
            // InternalQuickUI.g:2480:1: ( () )
            {
            // InternalQuickUI.g:2480:1: ( () )
            // InternalQuickUI.g:2481:2: ()
            {
             before(grammarAccess.getConditionTypeAccess().getCheckedAction_1_0()); 
            // InternalQuickUI.g:2482:2: ()
            // InternalQuickUI.g:2482:3: 
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
    // InternalQuickUI.g:2490:1: rule__ConditionType__Group_1__1 : rule__ConditionType__Group_1__1__Impl ;
    public final void rule__ConditionType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2494:1: ( rule__ConditionType__Group_1__1__Impl )
            // InternalQuickUI.g:2495:2: rule__ConditionType__Group_1__1__Impl
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
    // InternalQuickUI.g:2501:1: rule__ConditionType__Group_1__1__Impl : ( 'checked' ) ;
    public final void rule__ConditionType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2505:1: ( ( 'checked' ) )
            // InternalQuickUI.g:2506:1: ( 'checked' )
            {
            // InternalQuickUI.g:2506:1: ( 'checked' )
            // InternalQuickUI.g:2507:2: 'checked'
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
    // InternalQuickUI.g:2517:1: rule__Checked__Group__0 : rule__Checked__Group__0__Impl rule__Checked__Group__1 ;
    public final void rule__Checked__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2521:1: ( rule__Checked__Group__0__Impl rule__Checked__Group__1 )
            // InternalQuickUI.g:2522:2: rule__Checked__Group__0__Impl rule__Checked__Group__1
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
    // InternalQuickUI.g:2529:1: rule__Checked__Group__0__Impl : ( 'Checked' ) ;
    public final void rule__Checked__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2533:1: ( ( 'Checked' ) )
            // InternalQuickUI.g:2534:1: ( 'Checked' )
            {
            // InternalQuickUI.g:2534:1: ( 'Checked' )
            // InternalQuickUI.g:2535:2: 'Checked'
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
    // InternalQuickUI.g:2544:1: rule__Checked__Group__1 : rule__Checked__Group__1__Impl rule__Checked__Group__2 ;
    public final void rule__Checked__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2548:1: ( rule__Checked__Group__1__Impl rule__Checked__Group__2 )
            // InternalQuickUI.g:2549:2: rule__Checked__Group__1__Impl rule__Checked__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalQuickUI.g:2556:1: rule__Checked__Group__1__Impl : ( ':' ) ;
    public final void rule__Checked__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2560:1: ( ( ':' ) )
            // InternalQuickUI.g:2561:1: ( ':' )
            {
            // InternalQuickUI.g:2561:1: ( ':' )
            // InternalQuickUI.g:2562:2: ':'
            {
             before(grammarAccess.getCheckedAccess().getColonKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalQuickUI.g:2571:1: rule__Checked__Group__2 : rule__Checked__Group__2__Impl ;
    public final void rule__Checked__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2575:1: ( rule__Checked__Group__2__Impl )
            // InternalQuickUI.g:2576:2: rule__Checked__Group__2__Impl
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
    // InternalQuickUI.g:2582:1: rule__Checked__Group__2__Impl : ( ( rule__Checked__CheckedAssignment_2 ) ) ;
    public final void rule__Checked__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2586:1: ( ( ( rule__Checked__CheckedAssignment_2 ) ) )
            // InternalQuickUI.g:2587:1: ( ( rule__Checked__CheckedAssignment_2 ) )
            {
            // InternalQuickUI.g:2587:1: ( ( rule__Checked__CheckedAssignment_2 ) )
            // InternalQuickUI.g:2588:2: ( rule__Checked__CheckedAssignment_2 )
            {
             before(grammarAccess.getCheckedAccess().getCheckedAssignment_2()); 
            // InternalQuickUI.g:2589:2: ( rule__Checked__CheckedAssignment_2 )
            // InternalQuickUI.g:2589:3: rule__Checked__CheckedAssignment_2
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
    // InternalQuickUI.g:2598:1: rule__OnClick__Group__0 : rule__OnClick__Group__0__Impl rule__OnClick__Group__1 ;
    public final void rule__OnClick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2602:1: ( rule__OnClick__Group__0__Impl rule__OnClick__Group__1 )
            // InternalQuickUI.g:2603:2: rule__OnClick__Group__0__Impl rule__OnClick__Group__1
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
    // InternalQuickUI.g:2610:1: rule__OnClick__Group__0__Impl : ( 'OnClick' ) ;
    public final void rule__OnClick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2614:1: ( ( 'OnClick' ) )
            // InternalQuickUI.g:2615:1: ( 'OnClick' )
            {
            // InternalQuickUI.g:2615:1: ( 'OnClick' )
            // InternalQuickUI.g:2616:2: 'OnClick'
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
    // InternalQuickUI.g:2625:1: rule__OnClick__Group__1 : rule__OnClick__Group__1__Impl rule__OnClick__Group__2 ;
    public final void rule__OnClick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2629:1: ( rule__OnClick__Group__1__Impl rule__OnClick__Group__2 )
            // InternalQuickUI.g:2630:2: rule__OnClick__Group__1__Impl rule__OnClick__Group__2
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
    // InternalQuickUI.g:2637:1: rule__OnClick__Group__1__Impl : ( ':' ) ;
    public final void rule__OnClick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2641:1: ( ( ':' ) )
            // InternalQuickUI.g:2642:1: ( ':' )
            {
            // InternalQuickUI.g:2642:1: ( ':' )
            // InternalQuickUI.g:2643:2: ':'
            {
             before(grammarAccess.getOnClickAccess().getColonKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalQuickUI.g:2652:1: rule__OnClick__Group__2 : rule__OnClick__Group__2__Impl ;
    public final void rule__OnClick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2656:1: ( rule__OnClick__Group__2__Impl )
            // InternalQuickUI.g:2657:2: rule__OnClick__Group__2__Impl
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
    // InternalQuickUI.g:2663:1: rule__OnClick__Group__2__Impl : ( ( rule__OnClick__CallbackAssignment_2 ) ) ;
    public final void rule__OnClick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2667:1: ( ( ( rule__OnClick__CallbackAssignment_2 ) ) )
            // InternalQuickUI.g:2668:1: ( ( rule__OnClick__CallbackAssignment_2 ) )
            {
            // InternalQuickUI.g:2668:1: ( ( rule__OnClick__CallbackAssignment_2 ) )
            // InternalQuickUI.g:2669:2: ( rule__OnClick__CallbackAssignment_2 )
            {
             before(grammarAccess.getOnClickAccess().getCallbackAssignment_2()); 
            // InternalQuickUI.g:2670:2: ( rule__OnClick__CallbackAssignment_2 )
            // InternalQuickUI.g:2670:3: rule__OnClick__CallbackAssignment_2
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


    // $ANTLR start "rule__Boolean__Group__0"
    // InternalQuickUI.g:2679:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2683:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // InternalQuickUI.g:2684:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalQuickUI.g:2691:1: rule__Boolean__Group__0__Impl : ( () ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2695:1: ( ( () ) )
            // InternalQuickUI.g:2696:1: ( () )
            {
            // InternalQuickUI.g:2696:1: ( () )
            // InternalQuickUI.g:2697:2: ()
            {
             before(grammarAccess.getBooleanAccess().getBooleanAction_0()); 
            // InternalQuickUI.g:2698:2: ()
            // InternalQuickUI.g:2698:3: 
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
    // InternalQuickUI.g:2706:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2710:1: ( rule__Boolean__Group__1__Impl )
            // InternalQuickUI.g:2711:2: rule__Boolean__Group__1__Impl
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
    // InternalQuickUI.g:2717:1: rule__Boolean__Group__1__Impl : ( ( rule__Boolean__Alternatives_1 ) ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2721:1: ( ( ( rule__Boolean__Alternatives_1 ) ) )
            // InternalQuickUI.g:2722:1: ( ( rule__Boolean__Alternatives_1 ) )
            {
            // InternalQuickUI.g:2722:1: ( ( rule__Boolean__Alternatives_1 ) )
            // InternalQuickUI.g:2723:2: ( rule__Boolean__Alternatives_1 )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives_1()); 
            // InternalQuickUI.g:2724:2: ( rule__Boolean__Alternatives_1 )
            // InternalQuickUI.g:2724:3: rule__Boolean__Alternatives_1
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
    // InternalQuickUI.g:2733:1: rule__UIModel__AliasAssignment_0 : ( ruleAlias ) ;
    public final void rule__UIModel__AliasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2737:1: ( ( ruleAlias ) )
            // InternalQuickUI.g:2738:2: ( ruleAlias )
            {
            // InternalQuickUI.g:2738:2: ( ruleAlias )
            // InternalQuickUI.g:2739:3: ruleAlias
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
    // InternalQuickUI.g:2748:1: rule__UIModel__WindowAssignment_1 : ( ruleWindow ) ;
    public final void rule__UIModel__WindowAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2752:1: ( ( ruleWindow ) )
            // InternalQuickUI.g:2753:2: ( ruleWindow )
            {
            // InternalQuickUI.g:2753:2: ( ruleWindow )
            // InternalQuickUI.g:2754:3: ruleWindow
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
    // InternalQuickUI.g:2763:1: rule__Alias__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alias__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2767:1: ( ( RULE_ID ) )
            // InternalQuickUI.g:2768:2: ( RULE_ID )
            {
            // InternalQuickUI.g:2768:2: ( RULE_ID )
            // InternalQuickUI.g:2769:3: RULE_ID
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
    // InternalQuickUI.g:2778:1: rule__Alias__PackageAssignment_3 : ( rulePackage ) ;
    public final void rule__Alias__PackageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2782:1: ( ( rulePackage ) )
            // InternalQuickUI.g:2783:2: ( rulePackage )
            {
            // InternalQuickUI.g:2783:2: ( rulePackage )
            // InternalQuickUI.g:2784:3: rulePackage
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
    // InternalQuickUI.g:2793:1: rule__Package__PnameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Package__PnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2797:1: ( ( RULE_ID ) )
            // InternalQuickUI.g:2798:2: ( RULE_ID )
            {
            // InternalQuickUI.g:2798:2: ( RULE_ID )
            // InternalQuickUI.g:2799:3: RULE_ID
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
    // InternalQuickUI.g:2808:1: rule__Package__SubpAssignment_1_1 : ( rulePackage ) ;
    public final void rule__Package__SubpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2812:1: ( ( rulePackage ) )
            // InternalQuickUI.g:2813:2: ( rulePackage )
            {
            // InternalQuickUI.g:2813:2: ( rulePackage )
            // InternalQuickUI.g:2814:3: rulePackage
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
    // InternalQuickUI.g:2823:1: rule__Window__MainAssignment_1_0 : ( ( 'Main' ) ) ;
    public final void rule__Window__MainAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2827:1: ( ( ( 'Main' ) ) )
            // InternalQuickUI.g:2828:2: ( ( 'Main' ) )
            {
            // InternalQuickUI.g:2828:2: ( ( 'Main' ) )
            // InternalQuickUI.g:2829:3: ( 'Main' )
            {
             before(grammarAccess.getWindowAccess().getMainMainKeyword_1_0_0()); 
            // InternalQuickUI.g:2830:3: ( 'Main' )
            // InternalQuickUI.g:2831:4: 'Main'
            {
             before(grammarAccess.getWindowAccess().getMainMainKeyword_1_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQuickUI.g:2842:1: rule__Window__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Window__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2846:1: ( ( RULE_ID ) )
            // InternalQuickUI.g:2847:2: ( RULE_ID )
            {
            // InternalQuickUI.g:2847:2: ( RULE_ID )
            // InternalQuickUI.g:2848:3: RULE_ID
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
    // InternalQuickUI.g:2857:1: rule__Window__TitleAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Window__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2861:1: ( ( RULE_STRING ) )
            // InternalQuickUI.g:2862:2: ( RULE_STRING )
            {
            // InternalQuickUI.g:2862:2: ( RULE_STRING )
            // InternalQuickUI.g:2863:3: RULE_STRING
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
    // InternalQuickUI.g:2872:1: rule__Window__Menu_elementsAssignment_5_2 : ( ruleElement ) ;
    public final void rule__Window__Menu_elementsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2876:1: ( ( ruleElement ) )
            // InternalQuickUI.g:2877:2: ( ruleElement )
            {
            // InternalQuickUI.g:2877:2: ( ruleElement )
            // InternalQuickUI.g:2878:3: ruleElement
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
    // InternalQuickUI.g:2887:1: rule__Window__Content_elementsAssignment_6_2 : ( ruleElement ) ;
    public final void rule__Window__Content_elementsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2891:1: ( ( ruleElement ) )
            // InternalQuickUI.g:2892:2: ( ruleElement )
            {
            // InternalQuickUI.g:2892:2: ( ruleElement )
            // InternalQuickUI.g:2893:3: ruleElement
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
    // InternalQuickUI.g:2902:1: rule__JavaElement__AliasAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__JavaElement__AliasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2906:1: ( ( ( RULE_ID ) ) )
            // InternalQuickUI.g:2907:2: ( ( RULE_ID ) )
            {
            // InternalQuickUI.g:2907:2: ( ( RULE_ID ) )
            // InternalQuickUI.g:2908:3: ( RULE_ID )
            {
             before(grammarAccess.getJavaElementAccess().getAliasAliasCrossReference_0_0()); 
            // InternalQuickUI.g:2909:3: ( RULE_ID )
            // InternalQuickUI.g:2910:4: RULE_ID
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
    // InternalQuickUI.g:2921:1: rule__JavaElement__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__JavaElement__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2925:1: ( ( RULE_ID ) )
            // InternalQuickUI.g:2926:2: ( RULE_ID )
            {
            // InternalQuickUI.g:2926:2: ( RULE_ID )
            // InternalQuickUI.g:2927:3: RULE_ID
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
    // InternalQuickUI.g:2936:1: rule__JavaElement__SubelementAssignment_3 : ( ( rule__JavaElement__SubelementAlternatives_3_0 ) ) ;
    public final void rule__JavaElement__SubelementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2940:1: ( ( ( rule__JavaElement__SubelementAlternatives_3_0 ) ) )
            // InternalQuickUI.g:2941:2: ( ( rule__JavaElement__SubelementAlternatives_3_0 ) )
            {
            // InternalQuickUI.g:2941:2: ( ( rule__JavaElement__SubelementAlternatives_3_0 ) )
            // InternalQuickUI.g:2942:3: ( rule__JavaElement__SubelementAlternatives_3_0 )
            {
             before(grammarAccess.getJavaElementAccess().getSubelementAlternatives_3_0()); 
            // InternalQuickUI.g:2943:3: ( rule__JavaElement__SubelementAlternatives_3_0 )
            // InternalQuickUI.g:2943:4: rule__JavaElement__SubelementAlternatives_3_0
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
    // InternalQuickUI.g:2951:1: rule__Row__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Row__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2955:1: ( ( RULE_ID ) )
            // InternalQuickUI.g:2956:2: ( RULE_ID )
            {
            // InternalQuickUI.g:2956:2: ( RULE_ID )
            // InternalQuickUI.g:2957:3: RULE_ID
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
    // InternalQuickUI.g:2966:1: rule__Row__SubelementAssignment_3 : ( ( rule__Row__SubelementAlternatives_3_0 ) ) ;
    public final void rule__Row__SubelementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2970:1: ( ( ( rule__Row__SubelementAlternatives_3_0 ) ) )
            // InternalQuickUI.g:2971:2: ( ( rule__Row__SubelementAlternatives_3_0 ) )
            {
            // InternalQuickUI.g:2971:2: ( ( rule__Row__SubelementAlternatives_3_0 ) )
            // InternalQuickUI.g:2972:3: ( rule__Row__SubelementAlternatives_3_0 )
            {
             before(grammarAccess.getRowAccess().getSubelementAlternatives_3_0()); 
            // InternalQuickUI.g:2973:3: ( rule__Row__SubelementAlternatives_3_0 )
            // InternalQuickUI.g:2973:4: rule__Row__SubelementAlternatives_3_0
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
    // InternalQuickUI.g:2981:1: rule__Label__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Label__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:2985:1: ( ( RULE_STRING ) )
            // InternalQuickUI.g:2986:2: ( RULE_STRING )
            {
            // InternalQuickUI.g:2986:2: ( RULE_STRING )
            // InternalQuickUI.g:2987:3: RULE_STRING
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
    // InternalQuickUI.g:2996:1: rule__Enabled__ConditionAssignment_2 : ( ruleConditionBranch ) ;
    public final void rule__Enabled__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:3000:1: ( ( ruleConditionBranch ) )
            // InternalQuickUI.g:3001:2: ( ruleConditionBranch )
            {
            // InternalQuickUI.g:3001:2: ( ruleConditionBranch )
            // InternalQuickUI.g:3002:3: ruleConditionBranch
            {
             before(grammarAccess.getEnabledAccess().getConditionConditionBranchParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionBranch();

            state._fsp--;

             after(grammarAccess.getEnabledAccess().getConditionConditionBranchParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__ConditionBranch__RightAssignment_1_2"
    // InternalQuickUI.g:3011:1: rule__ConditionBranch__RightAssignment_1_2 : ( ruleConditionConcatenation ) ;
    public final void rule__ConditionBranch__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:3015:1: ( ( ruleConditionConcatenation ) )
            // InternalQuickUI.g:3016:2: ( ruleConditionConcatenation )
            {
            // InternalQuickUI.g:3016:2: ( ruleConditionConcatenation )
            // InternalQuickUI.g:3017:3: ruleConditionConcatenation
            {
             before(grammarAccess.getConditionBranchAccess().getRightConditionConcatenationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionConcatenation();

            state._fsp--;

             after(grammarAccess.getConditionBranchAccess().getRightConditionConcatenationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ConditionBranch__RightAssignment_1_2"


    // $ANTLR start "rule__ConditionConcatenation__RightAssignment_1_2"
    // InternalQuickUI.g:3026:1: rule__ConditionConcatenation__RightAssignment_1_2 : ( ruleConditionValue ) ;
    public final void rule__ConditionConcatenation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:3030:1: ( ( ruleConditionValue ) )
            // InternalQuickUI.g:3031:2: ( ruleConditionValue )
            {
            // InternalQuickUI.g:3031:2: ( ruleConditionValue )
            // InternalQuickUI.g:3032:3: ruleConditionValue
            {
             before(grammarAccess.getConditionConcatenationAccess().getRightConditionValueParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionValue();

            state._fsp--;

             after(grammarAccess.getConditionConcatenationAccess().getRightConditionValueParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ConditionConcatenation__RightAssignment_1_2"


    // $ANTLR start "rule__Condition__ElementAssignment_1"
    // InternalQuickUI.g:3041:1: rule__Condition__ElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:3045:1: ( ( ( RULE_ID ) ) )
            // InternalQuickUI.g:3046:2: ( ( RULE_ID ) )
            {
            // InternalQuickUI.g:3046:2: ( ( RULE_ID ) )
            // InternalQuickUI.g:3047:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getElementElementCrossReference_1_0()); 
            // InternalQuickUI.g:3048:3: ( RULE_ID )
            // InternalQuickUI.g:3049:4: RULE_ID
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
    // InternalQuickUI.g:3060:1: rule__Condition__NegationAssignment_3 : ( ( 'not' ) ) ;
    public final void rule__Condition__NegationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:3064:1: ( ( ( 'not' ) ) )
            // InternalQuickUI.g:3065:2: ( ( 'not' ) )
            {
            // InternalQuickUI.g:3065:2: ( ( 'not' ) )
            // InternalQuickUI.g:3066:3: ( 'not' )
            {
             before(grammarAccess.getConditionAccess().getNegationNotKeyword_3_0()); 
            // InternalQuickUI.g:3067:3: ( 'not' )
            // InternalQuickUI.g:3068:4: 'not'
            {
             before(grammarAccess.getConditionAccess().getNegationNotKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalQuickUI.g:3079:1: rule__Condition__ConditionAssignment_4 : ( ruleConditionType ) ;
    public final void rule__Condition__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:3083:1: ( ( ruleConditionType ) )
            // InternalQuickUI.g:3084:2: ( ruleConditionType )
            {
            // InternalQuickUI.g:3084:2: ( ruleConditionType )
            // InternalQuickUI.g:3085:3: ruleConditionType
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


    // $ANTLR start "rule__Checked__CheckedAssignment_2"
    // InternalQuickUI.g:3094:1: rule__Checked__CheckedAssignment_2 : ( ruleBoolean ) ;
    public final void rule__Checked__CheckedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:3098:1: ( ( ruleBoolean ) )
            // InternalQuickUI.g:3099:2: ( ruleBoolean )
            {
            // InternalQuickUI.g:3099:2: ( ruleBoolean )
            // InternalQuickUI.g:3100:3: ruleBoolean
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
    // InternalQuickUI.g:3109:1: rule__OnClick__CallbackAssignment_2 : ( RULE_ID ) ;
    public final void rule__OnClick__CallbackAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:3113:1: ( ( RULE_ID ) )
            // InternalQuickUI.g:3114:2: ( RULE_ID )
            {
            // InternalQuickUI.g:3114:2: ( RULE_ID )
            // InternalQuickUI.g:3115:3: RULE_ID
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
    // InternalQuickUI.g:3124:1: rule__Boolean__IsTrueAssignment_1_0 : ( ( 'true' ) ) ;
    public final void rule__Boolean__IsTrueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuickUI.g:3128:1: ( ( ( 'true' ) ) )
            // InternalQuickUI.g:3129:2: ( ( 'true' ) )
            {
            // InternalQuickUI.g:3129:2: ( ( 'true' ) )
            // InternalQuickUI.g:3130:3: ( 'true' )
            {
             before(grammarAccess.getBooleanAccess().getIsTrueTrueKeyword_1_0_0()); 
            // InternalQuickUI.g:3131:3: ( 'true' )
            // InternalQuickUI.g:3132:4: 'true'
            {
             before(grammarAccess.getBooleanAccess().getIsTrueTrueKeyword_1_0_0()); 
            match(input,32,FOLLOW_2); 
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000090010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030390010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030380012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000030380010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000008E000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000800L});

}