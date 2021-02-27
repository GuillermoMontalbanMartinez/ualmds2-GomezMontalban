import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `cibernauta-comun`
 *
 * CibernautaComun element.
 *
 * @customElement
 * @polymer
 */
class CibernautaComun extends PolymerElement {

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
        return 'cibernauta-comun';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(CibernautaComun.is, CibernautaComun);
