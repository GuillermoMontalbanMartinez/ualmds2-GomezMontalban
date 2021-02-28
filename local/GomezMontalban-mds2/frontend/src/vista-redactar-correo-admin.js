import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-contestar-email-admin`
 *
 * VistaContestarEmailAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaContestarEmailAdmin extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-contestar-email-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaContestarEmailAdmin.is, VistaContestarEmailAdmin);
