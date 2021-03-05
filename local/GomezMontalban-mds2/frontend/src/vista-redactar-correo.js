import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaRedactarCorreo extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h1 style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-m);" id="h1">Escribir correo</h1>
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-m);" id="vaadinHorizontalLayout">
   <p id="p1">Asunto : </p>
   <p id="p">Paragraph</p>
  </vaadin-horizontal-layout>
  <vaadin-text-area style="width: 90%; height: 90%; align-self: center;" id="vaadinTextArea"></vaadin-text-area>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin-top: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xl);" id="vaadinHorizontalLayout1">
  <vaadin-button theme="primary error" style="margin-right: var(--lumo-space-xl);" id="vaadinButton1">
    Cancelar 
  </vaadin-button>
  <vaadin-button theme="primary" style="margin-left: var(--lumo-space-xl);" id="vaadinButton">
    Enviar correo 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-redactar-correo';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRedactarCorreo.is, VistaRedactarCorreo);
