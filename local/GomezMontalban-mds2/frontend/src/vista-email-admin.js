import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-email-admin`
 *
 * VistaEmailAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaEmailAdmin extends PolymerElement {

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
        return 'vista-email-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmailAdmin.is, VistaEmailAdmin);
